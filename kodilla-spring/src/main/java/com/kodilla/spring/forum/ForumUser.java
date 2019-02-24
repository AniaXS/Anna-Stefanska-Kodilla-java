package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public final class ForumUser {
    final String userName;

    public ForumUser() {
        userName = "John Smith";
    }
}
