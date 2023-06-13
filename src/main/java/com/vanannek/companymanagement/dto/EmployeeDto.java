package com.vanannek.companymanagement.dto;

import io.swagger.annotations.ApiParam;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class EmployeeDto {
    private Long id;

    private String name = "";

    private String gender;

    private Date birthday = new Date();

    private String identifyCard = "";

    private String email = "";

    private String phoneNumber = "";

    private String address = "";

    @ApiParam("depId")
    private Long deptId;

    private Integer roleId;
}

