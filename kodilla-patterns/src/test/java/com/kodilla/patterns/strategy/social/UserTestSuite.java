package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Monica Smith");
        User user2 = new YGeneration("Kim Novak");
        User user3 = new ZGeneration("Tom Collins");

        //When
        String user1SharePosts = user1.sharePosts();
        System.out.println(user1.getName() + ": " + user1SharePosts);
        String user2SharePosts = user2.sharePosts();
        System.out.println(user2.getName() + ": " + user2SharePosts);
        String user3SharePosts = user3.sharePosts();
        System.out.println(user3.getName() + ": " + user3SharePosts);

        //Then
        Assert.assertEquals("uses Facebook to publish posts", user1SharePosts);
        Assert.assertEquals("uses Twitter to publish posts", user2SharePosts);
        Assert.assertEquals("uses Snapchat to publish posts", user3SharePosts);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user3 = new ZGeneration("Tom Collins");

        //When
        String user3SharePosts = user3.sharePosts();
        System.out.println(user3.getName() + ": " + user3SharePosts);
        user3.setSocialPublisher(new FacebookPublisher());
        user3SharePosts = user3.sharePosts();
        System.out.println("Now " + user3.getName() + ": " + user3SharePosts);

        //Then
        Assert.assertEquals("uses Facebook to publish posts", user3SharePosts);
    }
}
