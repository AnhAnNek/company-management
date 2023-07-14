package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpService extends BaseApiService {

    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/employee";
    }

    public void addEmp(EmployeeDto emp) {
        String apiUrl = getBaseUrl() + "/add";
        post(apiUrl, emp, Void.class);
    }

    public void deleteEmp(Long id) {
        String apiUrl = getBaseUrl() + "/delete/" + id;
        delete(apiUrl);
    }

    public void updateEmp(EmployeeDto emp) {
        String apiUrl = getBaseUrl() + "/update/" + emp.getId();
        put(apiUrl, emp, Void.class);
    }

    public List<EmployeeDto> getAll() {
        EmployeeDto[] emps = get(getBaseUrl(), EmployeeDto[].class);
        if (emps != null)
            return Arrays.asList(emps);
        return new ArrayList<>();
    }

    public EmployeeDto findById(Long id) {
        String apiUrl = getBaseUrl() + "/get?id=" + id;
        return get(apiUrl, EmployeeDto.class);
    }
}
