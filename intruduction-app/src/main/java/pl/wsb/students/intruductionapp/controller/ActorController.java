package pl.wsb.students.intruductionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsb.students.intruductionapp.service.ActorService;

@Controller
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    public String index(Model model)
    {
        model.addAttribute("listActors", actorService.listAll());
        return "actor/index";
    }
}
