package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialpublishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
//        Given
        User user1 = new YGeneration("Ann");
        User user2 = new Millenials("Mike");
        User user3 = new ZGeneration("Miranda");

//        When
        System.out.println(user1.getName() + " " + user1.sharePost());
        System.out.println(user2.getName()  + " " + user2.sharePost());
        System.out.println(user3.getName()  + " " + user3.sharePost());

//        Then
        Assert.assertEquals("shares post on Snapchat" , user1.sharePost());
        Assert.assertEquals("shares post on Facebook", user2.sharePost());
        Assert.assertEquals("shares post on Twitter", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
//        Given
        User user1 = new YGeneration("Ann");

//        When
        System.out.println(user1.getName() + " " + user1.sharePost());
        user1.setSocialPublisher(new TwitterPublisher());
        System.out.println("After change " + user1.getName() + " " + user1.sharePost());

//        Then
        Assert.assertEquals("shares post on Twitter", user1.sharePost());
    }
}
