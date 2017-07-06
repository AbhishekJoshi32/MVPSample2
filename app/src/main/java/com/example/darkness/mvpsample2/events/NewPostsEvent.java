package com.example.darkness.mvpsample2.events;



import com.example.darkness.mvpsample2.model.pojo.Post;

import java.util.List;

public class NewPostsEvent {
    List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public NewPostsEvent(List<Post> posts) {
        this.posts = posts;
    }
}
