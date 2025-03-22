package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {
    
    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> loginForm) {
        // 这里简单实现，实际应用中需要加入真实的用户验证逻辑
        String username = loginForm.get("username");
        String password = loginForm.get("password");
        
        // 示例：用户名为 admin，密码为 123456
        return "admin".equals(username) && "123456".equals(password);
    }
} 