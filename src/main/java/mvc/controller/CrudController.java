package mvc.controller;

import mvc.dao.ClientDao;
import mvc.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/crud")
public class CrudController {
    private final ClientDao clientDao;

    @Autowired
    public CrudController(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @RequestMapping("/list")
    public String index(Model model) {
        List<Client> clients = clientDao.findAll();
        model.addAttribute("clients", clients);
        System.out.println(clients);
        return "crud/list";
    }

    @RequestMapping("/add-client")
    public String addClient(Model model) {
        model.addAttribute("client", new Client());
        return "crud/form-client";
    }

    // @RequestMapping(value = "/insert-client", method = RequestMethod.POST)
    // use @PostMapping instead of @RequestMapping
    // use @ModelAttribute instead of @RequestParam to bind form data to the model
    @PostMapping("/save-client")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientDao.save(client);
        System.out.println(client.toString().concat(" inserted"));
        return "redirect:/crud/list";
    }

    // @RequestMapping("/update-client")
    @GetMapping("/edit-client")
    public String updateClient(@RequestParam("id") int id, Model model) {
        System.out.println("id: " + id);
        Client client = clientDao.findById(id);
        System.out.println(client);
        model.addAttribute("client", client);
        return "crud/form-client";
    }

    @PostMapping("/update-client")
    public String updateClient(@ModelAttribute("client") Client client) {
        clientDao.update(client);
        System.out.println(client.toString().concat(" updated"));
        return "redirect:/crud/list";
    }


}
