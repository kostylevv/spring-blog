package com.vkostylev.yp.mjd.springblog.controller;

import com.vkostylev.yp.mjd.springblog.dto.PostDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    public String getPosts(Model model) {
        return "posts";
    }

    @GetMapping("/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        return "post";
    }

    @GetMapping("/addPost")
    public String addPost() {
        return "addPost";
    }

    @PostMapping("/addPost")
    public String savePost(@ModelAttribute PostDto postDto) {
        return "redirect:/posts";
    }

}
