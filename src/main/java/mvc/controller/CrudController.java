package mvc.controller;

import mvc.dao.ClientDao;
import mvc.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "crud/add-client";
    }

    // @RequestMapping(value = "/insert-client", method = RequestMethod.POST)
    // use @PostMapping instead of @RequestMapping
    // use @ModelAttribute instead of @RequestParam to bind form data to the model
    @PostMapping("/insert-client")
    public String insertClient(@ModelAttribute("client") Client client) {
        // clientDao.insertClient(client);
        clientDao.save(client);
        System.out.println(client.toString().concat(" inserted"));
        return "redirect:/crud/list";
    }



}
