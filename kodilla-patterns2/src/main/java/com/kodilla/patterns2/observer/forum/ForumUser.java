package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String userame;
    private int updateCount;

    public ForumUser(String userame) {
        this.userame = userame;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userame + ": New message in topic " + forumTopic.getName() + "\n (total: " +
                forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUserame() {
        return userame;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
