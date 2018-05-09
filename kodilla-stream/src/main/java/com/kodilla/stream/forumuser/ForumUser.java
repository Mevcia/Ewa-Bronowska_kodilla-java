package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueId;
    private final String userName;
    private final Gender gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int uniqueId, final String userName, final Gender gender, final int dayOfBirth, final int monthOfBirth, final int yearOfBirth, final int numberOfPosts) {
        this.uniqueId = uniqueId;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getUserName() {
        return userName;
    }

    public Gender getSex() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueId=" + uniqueId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
