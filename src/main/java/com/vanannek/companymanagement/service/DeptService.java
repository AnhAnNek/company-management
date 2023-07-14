package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.DepartmentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DeptService extends BaseApiService {

    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/department";
    }

    public List<DepartmentDto> findAll() {
        DepartmentDto[] depts = get(getBaseUrl(), DepartmentDto[].class);
        if (depts != null)
            return Arrays.asList(depts);
        return new ArrayList<>();
    }
}
