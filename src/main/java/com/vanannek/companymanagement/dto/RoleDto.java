package com.vanannek.companymanagement.dto;

import com.vanannek.companymanagement.enums.EPermission;
import io.swagger.annotations.ApiParam;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class RoleDto {
    private Integer id;

    @ApiParam(name = "permission")
    private EPermission perms;

    private String title;

    private BigDecimal salary;
}
