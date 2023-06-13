package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.RoleDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RoleService extends BaseApiService {

    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/role";
    }

    public List<RoleDto> findAll() {
        RoleDto[] roles = get(getBaseUrl(), RoleDto[].class);
        if (roles != null)
            return Arrays.asList(roles);
        return new ArrayList<>();
    }
}
