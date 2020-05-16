package WordGame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("mage", "KOLDUN EBUCHI");
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("reg", "Nu eto registracia my son");
        return "login";
    }

}
