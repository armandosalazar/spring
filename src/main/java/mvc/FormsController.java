package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormsController {
    @RequestMapping("/forms")
    public String forms() {
        return "forms";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "process-form";
    }
}
