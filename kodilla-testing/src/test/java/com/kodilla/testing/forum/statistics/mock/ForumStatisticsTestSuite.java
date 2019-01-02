package com.kodilla.testing.forum.statistics.mock;


import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
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
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsForZeroPosts() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Kowalska");
        usersList.add("Nowak");
        usersList.add("Wiśniewski");

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(0);
        when(statisticZeroPosts.commentsCount()).thenReturn(20);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(3, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(20, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(6.667, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsForThousandPosts() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Kowalska");
        usersList.add("Nowak");
        usersList.add("Wiśniewski");

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(1000);
        when(statisticZeroPosts.commentsCount()).thenReturn(20);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(3, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(20, forumStatistics.getNumberOfComments());
        Assert.assertEquals(333.333, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(6.667, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0.02, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsForZeroComments() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Kowalska");
        usersList.add("Nowak");
        usersList.add("Wiśniewski");

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(256);
        when(statisticZeroPosts.commentsCount()).thenReturn(0);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(3, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(256, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(85.333, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsForMoreCommentsThanPosts() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("Kowalska");
        usersList.add("Nowak");
        usersList.add("Wiśniewski");

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(256);
        when(statisticZeroPosts.commentsCount()).thenReturn(978);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(3, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(256, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(978, forumStatistics.getNumberOfComments());
        Assert.assertEquals(85.333, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(326, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(3.820, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsForZeroUsers() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(256);
        when(statisticZeroPosts.commentsCount()).thenReturn(67);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(256, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(67, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0.262, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsForHundredUsers() {
        //Given
        Statistics statisticZeroPosts = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("Kowalska");
        }

        when(statisticZeroPosts.usersNames()).thenReturn(usersList);
        when(statisticZeroPosts.postsCount()).thenReturn(256);
        when(statisticZeroPosts.commentsCount()).thenReturn(256);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticZeroPosts);

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(256, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(256, forumStatistics.getNumberOfComments());
        Assert.assertEquals(2.56, forumStatistics.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(2.56, forumStatistics.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(1, forumStatistics.getAvgCommentsPerPost(), 0.001);
    }
}
