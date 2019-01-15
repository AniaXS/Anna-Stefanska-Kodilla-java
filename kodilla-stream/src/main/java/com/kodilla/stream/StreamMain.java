package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nBeautifying the text");
        poemBeautifier.beautify("Kodilla course", (textToDecorate) -> ">>" + textToDecorate + "<<");
        poemBeautifier.beautify("Kodilla course", (textToDecorate) -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("Kodilla course", (textToDecorate) -> "\033[1m" + textToDecorate + "\033[0m");
        poemBeautifier.beautify("Kodilla course", (textToDecorate) -> "\u001B[31m" + textToDecorate + "\u001B[0m");

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().plusDays(1).minusYears(20)))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        System.out.println("\n# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
