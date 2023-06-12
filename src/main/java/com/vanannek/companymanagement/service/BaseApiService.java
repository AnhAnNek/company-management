package com.vanannek.companymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class BaseApiService {

    @Autowired
    protected RestTemplate restTemplate;

    @Value("${api.base-url}")
    private String baseUrl;

    protected String getBaseUrl() {
        return baseUrl;
    }

    protected <T> T get(String url, Class<T> responseType) {
        try {
            ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.GET, null, responseType);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T> T post(String url, Object request, Class<T> responseType) {
        try {
            ResponseEntity<T> response = restTemplate.postForEntity(url, request, responseType);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T> T put(String url, Object request, Class<T> responseType) {
        try {
            ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(request), responseType);
            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void delete(String url) {
        try {
            restTemplate.delete(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
