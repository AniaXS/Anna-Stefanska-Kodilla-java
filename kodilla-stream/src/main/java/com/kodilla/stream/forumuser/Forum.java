package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(265, "Black Widow", 'F', LocalDate.of(1998, 7, 1), 1));
        theForumUserList.add(new ForumUser(123, "Josef K.", 'M', LocalDate.of(2000, 4, 13), 53));
        theForumUserList.add(new ForumUser(25, "Super Mario", 'M', LocalDate.of(1995, 1, 11), 0));
        theForumUserList.add(new ForumUser(757, "User", 'M', LocalDate.of(1992, 8, 29), 8));
        theForumUserList.add(new ForumUser(1, "Miss Marple", 'F', LocalDate.of(1999, 1, 13), 42));
        theForumUserList.add(new ForumUser(40, "Lilith", 'F', LocalDate.of(1993, 3, 17), 10));
        theForumUserList.add(new ForumUser(33, "Lord Vader.", 'M', LocalDate.of(1999, 1, 15), 6));
        theForumUserList.add(new ForumUser(62, "Smurfette", 'F', LocalDate.of(1994, 6, 22), 0));
        theForumUserList.add(new ForumUser(81, "Rincewind", 'M', LocalDate.of(2002,9,30), 1));
        theForumUserList.add(new ForumUser(3, "Venus", 'F', LocalDate.of(1990, 2,14), 317));
        theForumUserList.add(new ForumUser(7, "Alice", 'F', LocalDate.of(1994, 5, 27), 92));
        theForumUserList.add(new ForumUser(84, "Sherlock", 'M', LocalDate.of(1996,11, 3), 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
