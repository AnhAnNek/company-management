package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.ProjectDto;
import com.vanannek.companymanagement.service.ProjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjService projService;

    @GetMapping("/")
    public String hello() {
        List<ProjectDto> projs = projService.getAll();
        return "home";
    }
}
