package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class EmpService extends BaseApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.base-url}")
    private String baseUrl;

    public List<EmployeeDto> getAll() {
        String apiUrl = baseUrl + "/employee";
        EmployeeDto[] employees = get(apiUrl, EmployeeDto[].class);
        return Arrays.asList(employees);
    }
}
