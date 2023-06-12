package com.vanannek.companymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name = "";
    private String gender;
    private Date birthday = new Date();
    private String identifyCard = "";
    private String email = "";
    private String phoneNumber = "";
    private String address = "";
    private Long depId;
    private Integer roleId;
}

