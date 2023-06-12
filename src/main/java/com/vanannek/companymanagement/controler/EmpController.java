package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.service.EmpService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/edit-view")
    public String getEditView() {
        return "";
    }

    @PostMapping("/add-new")
    public String add(@ModelAttribute EmployeeDto e, HttpSession session) {
        empService.addEmp(e);
        session.setAttribute("msg", "Emplyoee Added Sucessfully..");
        return "redirect:/";
    }

    public String delete() {
        return "redirect:/";
    }

    public String update() {
        return "redirect:/";
    }

    @GetMapping("/get-all")
    public String showAll(Model model) {
        List<EmployeeDto> employees = empService.getAll();
        model.addAttribute("employees", employees);
        return "employee_list";
    }
}
