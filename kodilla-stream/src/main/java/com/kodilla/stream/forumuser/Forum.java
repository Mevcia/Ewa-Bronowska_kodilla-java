package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(1, "Paolo", Gender.M, 30, 6, 1985, 0));
        theUsersList.add(new ForumUser(2, "Bianka", Gender.F, 15, 10, 1990, 10));
        theUsersList.add(new ForumUser(3, "Vader", Gender.M, 27, 2, 1999, 15));
        theUsersList.add(new ForumUser(4, "rosa", Gender.F, 1, 1, 2000, 0));
        theUsersList.add(new ForumUser(5, "ulla-la", Gender.M, 13, 9, 1995, 300));
    }

    public List<ForumUser> getTheUsersList() {
        return new ArrayList<>(theUsersList);
    }
}
