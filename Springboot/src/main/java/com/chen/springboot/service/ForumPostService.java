package com.chen.springboot.service;

import com.chen.springboot.entity.ForumPost;
import com.chen.springboot.mapper.ForumPostsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumPostService {

    @Autowired
    private ForumPostsMapper forumPostsMapper;

    public List<ForumPost> getAllForumPosts() {
        return forumPostsMapper.getAllForumPosts();
    }

    public ForumPost getForumPostById(int postId) {
        return forumPostsMapper.getForumPostById(postId);
    }

    public void createForumPost(ForumPost forumPost) {
        forumPostsMapper.createForumPost(forumPost);
    }

    public void updateForumPost(ForumPost forumPost) {
        forumPostsMapper.updateForumPost(forumPost);
    }

    public void deleteForumPost(int postId) {
        forumPostsMapper.deleteForumPost(postId);
    }
}



