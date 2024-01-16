package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class CrudController {
    @RequestMapping
    public String index(Model model) {
        return "crud/index";
    }
}
