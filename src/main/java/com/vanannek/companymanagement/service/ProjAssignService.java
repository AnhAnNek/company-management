package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.dto.ProjAssignDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjAssignService  extends BaseApiService {
    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/project-assignment";
    }

    public List<ProjAssignDto> getAll() {
        ProjAssignDto[] projAssign = get(getBaseUrl(), ProjAssignDto[].class);
        if (projAssign != null)
            return Arrays.asList(projAssign);
        return new ArrayList<>();
    }
}
