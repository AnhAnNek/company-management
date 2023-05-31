package com.vanannek.companymanagement.controler;

import com.vanannek.companymanagement.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/get/{id}")
    public UserDTO getUser(@PathVariable Integer id) {
        UserDTO userDTO = webClientBuilder.build()
                .get()
                .uri("http://localhost:8081/user/get?id=" + id)
                .retrieve()
                .bodyToMono(UserDTO.class)
                .block();

        return userDTO;
    }
}
