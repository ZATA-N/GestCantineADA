package ci.atosdigitalacademy.macantine.controllers;


import ci.atosdigitalacademy.macantine.models.Menu;
import ci.atosdigitalacademy.macantine.services.MenuService;
import ci.atosdigitalacademy.macantine.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/")
public class HomeController {

    private final MenuService menuService;

    @GetMapping
    public String showIndex(Model model) {
        final List<MenuDTO> finalMenu = menuService.findAll();
        model.addAttribute("menus", finalMenu);
        model.addAttribute("menu", new Menu());

        long menuCount = menuService.countMenu();
        model.addAttribute("menuService", menuCount);

        return "home/acceuil";
    }

}
