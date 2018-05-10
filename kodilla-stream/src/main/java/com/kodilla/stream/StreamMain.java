package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Gender;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getTheUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == Gender.MALE)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= 1998)
                .collect(Collectors.toMap(ForumUser::getUniqueId, forumUser -> forumUser));

        System.out.println("# of elements " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
