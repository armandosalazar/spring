package mvc.controller;

import mvc.dao.ClientDao;
import mvc.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping
    public String index(Model model) {
        List<Client> clients = clientDao.getClients();
        model.addAttribute("clients", clients);
        System.out.println(clients);
        return "crud/index";
    }
}
