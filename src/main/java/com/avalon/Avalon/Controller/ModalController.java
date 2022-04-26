package com.avalon.Avalon.Controller;

import com.avalon.Avalon.Service.VolumetricoSATService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("modals")
public class ModalController {

    @Autowired
    public VolumetricoSATService volumetricoSATService;

    @GetMapping("productoModal")
    public String productoModal(@RequestParam("volumId") long volumId, Model model) {
        model.addAttribute("productSet", volumetricoSATService.findProductSetById(volumId));
        return "productoModal";
    }

    @GetMapping("modalConfirm")
    public String modalConfirm(@RequestParam("volumId") long volumId, Model model) {
        model.addAttribute("volumId", volumId);
        return "modalConfirm";
    }

    @GetMapping("test")
    public String test(Model model) {
        model.addAttribute("listVolumetricoSAT", volumetricoSATService.findAll());
        return "modal2";
    }
}
