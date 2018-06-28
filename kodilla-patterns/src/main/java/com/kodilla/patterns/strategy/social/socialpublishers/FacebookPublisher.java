package com.kodilla.patterns.strategy.social.socialpublishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "shares post on Facebook";
    }
}
