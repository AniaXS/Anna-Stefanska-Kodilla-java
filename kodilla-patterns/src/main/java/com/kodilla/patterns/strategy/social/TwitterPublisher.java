package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "uses Twitter to publish posts";
    }
}