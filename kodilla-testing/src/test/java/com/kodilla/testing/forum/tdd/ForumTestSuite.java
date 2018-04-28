package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing test # " + testCounter);
    }
    @Test
    public void testAddPost() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        forumUser.addPost("JN", "Hallo, my first post!");
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        forumUser.addComment(thePost, "JN", "Thanks for warm welcome!");
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        forumUser.addPost(thePost.getPostAuthor(), thePost.getPostBody());
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        Assert.assertEquals(thePost, retrievedPost);
    }
    @Test
    public void testGetComment() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        ForumComment theComment = new ForumComment(thePost, "Thanks for warm welcome!", "JN");
        forumUser.addComment(thePost, theComment.getCommentAuthor(), theComment.getCommentBody());
        ForumComment retrievedComment;
        retrievedComment = forumUser.getComment(0);
        Assert.assertEquals(theComment, retrievedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        boolean result = forumUser.removePost(thePost);
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        ForumComment theComment = new ForumComment(thePost, "Thanks for warm welcome!", "JN");
        boolean result = forumUser.removeComment(theComment);
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        forumUser.addPost(thePost.getPostAuthor(), thePost.getPostBody());
        boolean result = forumUser.removePost(thePost);
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        ForumUser forumUser = new ForumUser("JN", "Jan Kowalski");
        ForumPost thePost = new ForumPost("Hallo, my first post!", "JN");
        ForumComment theComment = new ForumComment(thePost, "Thanks for warm welcome!", "JN");
        forumUser.addComment(thePost, theComment.getCommentAuthor(), theComment.getCommentBody());
        boolean result = forumUser.removeComment(theComment);
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}