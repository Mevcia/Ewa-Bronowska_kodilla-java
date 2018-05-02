package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsCalculator() {
    }
    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(statistics.usersNames().size() !=0) {
            averagePostsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        if(statistics.usersNames().size() !=0) {
            averageCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        if(statistics.postsCount() !=0) {
            averageCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }
    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    @Override
    public String toString() {
        return "Forum's statistics{" +
                "number of users= " + numberOfUsers +
                ", number of posts= " + numberOfPosts +
                ", number of comments= " + numberOfComments +
                ", average posts per user= " + averagePostsPerUser +
                ", average comments per user= " + averageCommentsPerUser +
                ", average comments per post= " + averageCommentsPerPost +
                '}';
    }
}