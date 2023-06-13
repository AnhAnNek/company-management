package com.vanannek.companymanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDto {
    private Long id;
    private String name;
    private Long deptHeadId;
}
