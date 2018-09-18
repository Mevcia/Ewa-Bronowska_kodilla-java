package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser jS = new ForumUser("John Smith");
        ForumUser iE = new ForumUser("Ivone Escobar");
        ForumUser jP = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(jS);
        javaToolsForum.registerObserver(iE);
        javaHelpForum.registerObserver(jP);
        javaToolsForum.registerObserver(jP);

        javaHelpForum.addPost("Hi everyone!");
        javaHelpForum.addPost("Better try...");
        javaToolsForum.addPost("Help pls. with MySQL");
        javaHelpForum.addPost("Why while?");
        javaToolsForum.addPost("I get bad credentials message");

        assertEquals(3, jS.getUpdateCount());
        assertEquals(2, iE.getUpdateCount());
        assertEquals(5, jP.getUpdateCount());
    }
}
