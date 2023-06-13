package com.vanannek.companymanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    private String username;
    private String password;
    private Long empId;
}
