package ci.atosdigitalacademy.macantine.controllers;


import ci.atosdigitalacademy.macantine.services.MenuService;
import ci.atosdigitalacademy.macantine.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/menus")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model){

        final List<MenuDTO> finalMenu = menuService.findAll();
        model.addAttribute("menus", finalMenu);
        model.addAttribute("menu", new MenuDTO());

        long menuCount = menuService.countMenu();
        model.addAttribute("countMenu", menuCount);

        return "menu/menus";
    }

    @GetMapping("/formMenu")
    public String showFormMenu(Model model){
        return "forms/formMenu";
    }

    @PostMapping("/save")
    public String savemenu(MenuDTO menuDTO){
        log.debug("menu{}" , menuDTO);
        menuService.save(menuDTO);
        return "redirect:/menus";
    }
}
