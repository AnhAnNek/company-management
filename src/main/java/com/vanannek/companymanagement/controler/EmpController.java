package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.service.EmpService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/input-employee")
    public String getEditView() {
        return "input_employee";
    }

    @PostMapping("/add-new")
    public String add(@ModelAttribute EmployeeDto e, HttpSession session) {
        empService.addEmp(e);
        session.setAttribute("msg", "Employee Added Successfully..");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        empService.deleteEmp(id);
        return "redirect:/employee/get-all";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model m) {
        EmployeeDto emp = empService.findById(id);
        m.addAttribute("emp", emp);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute EmployeeDto e, HttpSession session) {
        empService.addEmp(e);
        session.setAttribute("msg", "Employee Update Successfully...");
        return "redirect:/";
    }

    @GetMapping("/get-all")
    public String showAll(Model model) {
        List<EmployeeDto> employees = empService.getAll();
        model.addAttribute("employees", employees);
        return "employee_list";
    }
}
