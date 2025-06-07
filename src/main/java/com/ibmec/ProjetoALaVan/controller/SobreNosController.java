package com.ibmec.ProjetoALaVan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sobre")
public class SobreNosController {
    @GetMapping
    public String sobreNos() {
        return "SobreNos";
    }
}
