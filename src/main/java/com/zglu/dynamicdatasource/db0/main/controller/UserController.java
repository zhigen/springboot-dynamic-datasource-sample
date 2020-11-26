package com.zglu.dynamicdatasource.db0.main.controller;

import com.zglu.dynamicdatasource.db0.main.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("")
    public Long transactional(String name, String code) {
        return userService.transactional(name, code);
    }

    @GetMapping("/global")
    public Long globalTransactional(String name, String code) {
        return userService.globalTransactional(name, code);
    }

}
