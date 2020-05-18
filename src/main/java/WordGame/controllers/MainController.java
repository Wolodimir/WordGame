package WordGame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexPage(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("reg", "Nu eto registracia my son");
        return "login";
    }
    @PostMapping("/login")
    public String enterIntoGame(Model model){
        return "game-main";
    }
}
