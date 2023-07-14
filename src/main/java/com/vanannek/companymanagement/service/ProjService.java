package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.dto.ProjectDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProjService extends BaseApiService {

    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/project";
    }

    public List<ProjectDto> getAll() {
        // http://localhost:8000/api/project
        ProjectDto[] projs = get(getBaseUrl(), ProjectDto[].class);
        if (projs != null)
            return Arrays.asList(projs);
        return new ArrayList<>();
    }
}
