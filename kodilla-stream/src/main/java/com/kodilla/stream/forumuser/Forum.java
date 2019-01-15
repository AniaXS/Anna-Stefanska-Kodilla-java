package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(265, "Black Widow", 'F', 1998, 7, 11, 1));
        theForumUserList.add(new ForumUser(123, "Josef K.", 'M', 2000, 4, 13, 53));
        theForumUserList.add(new ForumUser(25, "Super Mario", 'M', 1995, 1, 1, 0));
        theForumUserList.add(new ForumUser(757, "User", 'M', 1992,8, 29, 8));
        theForumUserList.add(new ForumUser(1, "Miss Marple", 'F', 1999, 01,13, 42));
        theForumUserList.add(new ForumUser(40, "Lilith", 'F', 1993, 3, 17, 10));
        theForumUserList.add(new ForumUser(33, "Lord Vader.", 'M', 1999, 1, 15, 6));
        theForumUserList.add(new ForumUser(62, "Smurfette", 'F', 1994, 6, 22, 0));
        theForumUserList.add(new ForumUser(81, "Rincewind", 'M', 2002,9,30, 1));
        theForumUserList.add(new ForumUser(3, "Venus", 'F', 1990, 2,14, 317));
        theForumUserList.add(new ForumUser(7, "Alice", 'F', 1994, 5, 27, 92));
        theForumUserList.add(new ForumUser(84, "Sherlock", 'M', 1996,11, 3, 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
