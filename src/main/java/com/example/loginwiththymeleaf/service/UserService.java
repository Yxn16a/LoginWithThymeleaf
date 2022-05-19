package com.example.loginwiththymeleaf.service;

import com.example.loginwiththymeleaf.domain.User;
import com.example.loginwiththymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User Save(UserRegistrationDto userRegistrationDto);

}
