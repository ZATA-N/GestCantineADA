package ci.atosdigitalacademy.macantine.controllers;



import ci.atosdigitalacademy.macantine.services.PlatService;
import ci.atosdigitalacademy.macantine.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/plats")
public class PlatController {

    public final PlatService platService;

    @GetMapping
    public String showPlatPage(Model model){

        final List<PlatDTO> finalPlat = platService.findAll();
        model.addAttribute("plats", finalPlat);
        model.addAttribute("plat", new PlatDTO());

        long platCount = platService.countPlat();
        model.addAttribute("platCount", platCount);


        return "plats/plats";
    }

    @GetMapping("/formPlat")
    public String showFormMenu(Model model){
        return "forms/formPlat";
    }

}
