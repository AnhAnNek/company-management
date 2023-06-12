package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/get-all")
    public String employeeList(Model model) {
        List<EmployeeDto> employees = empService.getAll();
        model.addAttribute("employees", employees);
        return "employee_list";
    }
}
