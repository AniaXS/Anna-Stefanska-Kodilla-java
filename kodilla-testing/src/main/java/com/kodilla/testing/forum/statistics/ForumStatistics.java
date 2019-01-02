package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers != 0) {
            avgPostsPerUser = (double) numberOfPosts / numberOfUsers;
            avgCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }

        if (numberOfPosts > 0) {
            avgCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Statistics of the Forum:");
        System.out.println("- number of the forum users: " + getNumberOfUsers());
        System.out.println("- number of the posts: " + getNumberOfPosts());
        System.out.println("- number of the comments: " + getNumberOfComments());
        System.out.println("- average of the posts per user: " + getAvgPostsPerUser());
        System.out.println("- average of the comments per user: " + getAvgCommentsPerUser());
        System.out.println("- average of the post per user: " + getAvgCommentsPerPost());
    }
}