package com.vanannek.companymanagement.service;

import com.vanannek.companymanagement.dto.AccountDto;
import org.springframework.stereotype.Service;

@Service
public class AccService extends BaseApiService {

    @Override
    protected String getBaseUrl() {
        return super.getBaseUrl() + "/account";
    }

    public void deleteAcc(Long empId) {
    }

    public AccountDto findByEmpId(Long empId) {
        String apiUrl = getBaseUrl() + "/get?empId=" + empId;
        return get(apiUrl, AccountDto.class);
    }

    public void updateAcc(AccountDto acc) {
    }
}
