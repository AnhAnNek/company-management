package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.AccountDto;
import com.vanannek.companymanagement.dto.DepartmentDto;
import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.dto.RoleDto;
import com.vanannek.companymanagement.enums.EGender;
import com.vanannek.companymanagement.service.AccService;
import com.vanannek.companymanagement.service.DeptService;
import com.vanannek.companymanagement.service.EmpService;
import com.vanannek.companymanagement.service.RoleService;
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

    @Autowired
    private AccService accService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private RoleService roleService;

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
        accService.deleteAcc(id);
        return "redirect:/employee/get-all";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model m) {
        EmployeeDto emp = empService.findById(id);
        AccountDto acc = accService.findByEmpId(id);
        List<DepartmentDto> depts = deptService.findAll();
        List<RoleDto> roles = roleService.findAll();
        m.addAttribute("emp", emp);
        m.addAttribute("acc", acc);
        m.addAttribute("genders", EGender.values());
        m.addAttribute("depts", depts);
        m.addAttribute("roles", roles);
        return "input_employee";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute EmployeeDto e, @ModelAttribute AccountDto a, HttpSession session) {
        empService.updateEmp(e);
        accService.updateAcc(a);
        session.setAttribute("msg", "Employee Update Successfully...");
        return "redirect:/employee";
    }

    @GetMapping("/get-all")
    public String showAll(Model model) {
        List<EmployeeDto> employees = empService.getAll();
        model.addAttribute("employees", employees);
        return "employee_list";
    }
}
