package com.vanannek.companymanagement.dto;

import com.vanannek.companymanagement.enums.EProjStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private Long id;
    private String name;
    private String details;
    private Date created;
    private Date start;
    private Date end;
    private Date completed;
    private String progress;
    private EProjStatus status;
    private Long ownerId;
    private BigDecimal bonusSalary;
}
