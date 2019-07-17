package com.tw.apistackbase;


import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.Arrays;

//import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.is;  // 是这个不是上面那个
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest  // 标注为web mvc测试
@ExtendWith(SpringExtension.class)  // 扩展 基础环境
public class CompanyControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CompanyService companyService;

    @Test
    public void should_return_company_find_by_id() throws Exception {
        Employee employee1 = new Employee(1, "murphy", 22, "female", 66666);
        Employee employee2 = new Employee(2, "murphy", 22, "female", 66666);
        Company company = new Company("1", "OOCL", 20000, new ArrayList<Employee>(Arrays.asList(employee1, employee2)) {
        });

        when(companyService.findCompanyById(anyString())).thenReturn(company);

        ResultActions resultActions = mvc.perform(get("/companies/{id}", company.getCompanyId()));
        resultActions.andExpect(status().isOk())
                .andExpect(jsonPath("$.companyId" ,is("1")))
                .andExpect(jsonPath("$.companyId", is("1")))
                .andExpect(jsonPath("$.companyName", is("OOCL")))
                .andExpect(jsonPath("$.companyName", is("OOCL")));
    }


}
