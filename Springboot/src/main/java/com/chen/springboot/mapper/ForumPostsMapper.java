package com.chen.springboot.mapper;

import com.chen.springboot.entity.ForumPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ForumPostsMapper {

    @Select("SELECT * FROM forum_posts")
    List<ForumPost> getAllForumPosts();

    @Select("SELECT * FROM forum_posts WHERE id = #{postId}")
    ForumPost getForumPostById(int postId);

    @Insert("INSERT INTO forum_posts(title, content, segment_name) VALUES(#{title}, #{content}, #{segmentName})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createForumPost(ForumPost forumPost);

    @Update("UPDATE forum_posts SET title = #{title}, content = #{content}, segment_name = #{segmentName} WHERE id = #{id}")
    void updateForumPost(ForumPost forumPost);

    @Delete("DELETE FROM forum_posts WHERE id = #{postId}")
    void deleteForumPost(int postId);
}



