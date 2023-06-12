package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpService extends BaseApiService {

    @Autowired
    private RestTemplate restTemplate;

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

    public void updateEmp(Long id, EmployeeDto emp) {
        String apiUrl = getBaseUrl() + "/update/" + id;
        put(apiUrl, emp, Void.class);
    }

    public List<EmployeeDto> getAll() {
        EmployeeDto[] emps = get(getBaseUrl(), EmployeeDto[].class);
        if (emps != null)
            return Arrays.asList(emps);
        return new ArrayList<>();
    }
}
