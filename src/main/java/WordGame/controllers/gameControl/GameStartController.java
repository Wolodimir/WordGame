package WordGame.controllers.gameControl;

import WordGame.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameStartController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/game-main")
    public String gameMainPage(Model model){
        return "game/game-main";
    }
}
