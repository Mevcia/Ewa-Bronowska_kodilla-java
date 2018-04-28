package com.kodilla.testing.forum;

public class ForumPost {
    String postBody;
    String postAuthor;

    public ForumPost(String postBody, String postAuthor) {
        this.postBody = postBody;
        this.postAuthor = postAuthor;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postBody.equals(forumPost.postBody)) return false;
        return postAuthor.equals(forumPost.postAuthor);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + postAuthor.hashCode();
        return result;
    }
}
