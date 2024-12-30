package com.chen.springboot.controller;

import com.chen.springboot.entity.ForumPost;
import com.chen.springboot.service.ForumPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forum-posts")
public class ForumPostController {

    @Autowired
    private ForumPostService forumPostService;

    @GetMapping
    public List<ForumPost> getAllForumPosts() {
        return forumPostService.getAllForumPosts();
    }

    @GetMapping("/{postId}")
    public ForumPost getForumPostById(@PathVariable int postId) {
        return forumPostService.getForumPostById(postId);
    }

    @PostMapping
    public void createForumPost(@RequestBody ForumPost forumPost) {
        forumPostService.createForumPost(forumPost);
    }

    @PutMapping
    public void updateForumPost(@RequestBody ForumPost forumPost) {
        forumPostService.updateForumPost(forumPost);
    }

    @DeleteMapping("/{postId}")
    public void deleteForumPost(@PathVariable int postId) {
        forumPostService.deleteForumPost(postId);
    }
}



