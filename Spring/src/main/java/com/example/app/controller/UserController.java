package com.example.app.controller;

import com.example.app.model.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/list")
    public String list(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "user/list";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam String userId, Model model) {
        User user = userService.getUserByUserId(userId);
        model.addAttribute("user", user);
        return "user/detail";
    }

    @GetMapping("/myPage")
    public String myPage(HttpSession session, Model model) {
        String userId = (String) session.getAttribute("userId");
        User user = userService.getUserByUserId(userId);
        model.addAttribute("user", user);
        return "user/myPage";
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "user/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute User user) {
        userService.signUp(user);
        return "redirect:/user/list";
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userId, @RequestParam String password, HttpSession session, Model model) {
        User user = userService.getUserByUserId(userId);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            // 토큰 생성 및 세션 저장
            String token = java.util.UUID.randomUUID().toString();
            session.setAttribute("accessToken", token);
            session.setAttribute("id", user.getId());
            session.setAttribute("userId", user.getUserId());
            return "redirect:/user/list";
        } else {
            model.addAttribute("error", "아이디 또는 비밀번호가 잘못되었습니다.");
            return "user/login";
        }
    }

    @GetMapping("/update")
    public String update(HttpSession session, Model model) {
        String userId = (String) session.getAttribute("userId");
        if (userId == null) return "redirect:/user/login";
    	User user = userService.getUserByUserId(userId);
    	model.addAttribute("user", user);
        return "user/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/user/list";
    }

    @PostMapping("/delete")
    public String delete(HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        userService.deleteUser(userId);
        return "redirect:/user/list";
    }
}
