package com.gmail.leejaewon264.postdatatoweb.controller;

import com.gmail.leejaewon264.postdatatoweb.entity.UserInfo;
import com.gmail.leejaewon264.postdatatoweb.repository.UserInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class UserInfoController {
    private final UserInfoRepository userInfoRepository;

    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @GetMapping("/")
    public String getAllUsers(Model model) {
        List<UserInfo> users = userInfoRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }
}

