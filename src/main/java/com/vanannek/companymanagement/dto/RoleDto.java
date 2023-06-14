package com.vanannek.companymanagement.dto;

import com.vanannek.companymanagement.enums.EPermission;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private Integer id;

    @ApiParam(name = "permission")
    private EPermission perms;

    private String title;

    private BigDecimal salary;
}
