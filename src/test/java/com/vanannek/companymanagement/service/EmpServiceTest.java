package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.EmployeeDto;
import com.vanannek.companymanagement.enums.EGender;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmpServiceTest {

    @Mock
    private EmpService empServiceMock;

    @Autowired
    private MockMvc mock;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAll() throws Exception {
        List<EmployeeDto> expected = new ArrayList<>();
        expected.add(EmployeeDto.builder()
                        .id(2L)
                        .name("Hoàng Long")
                        .gender(EGender.FEMALE.toString())
                        .birthday(new Date(2000, 1, 1))
                        .identifyCard("07512312234")
                        .email("info.bb@gmail.com")
                        .phoneNumber("0912381833")
                        .address("Ap 2 So 202")
                        .deptId(1L)
                        .roleId(1)
                        .build());

        when(empServiceMock.getAll()).thenReturn(expected);

        this.mock
                .perform(MockMvcRequestBuilders
                        .get("/api/employee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Hoàng Long"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].gender").value("FEMALE"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].birthday").value("2000-01-01"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].identifyCard").value("07512312234"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].email").value("info.bb@gmail.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].phoneNumber").value("0912381833"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].deptId").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].roleId").value("1"));
    }
}