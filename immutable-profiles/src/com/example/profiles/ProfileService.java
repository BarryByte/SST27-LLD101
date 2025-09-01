package com.example.profiles;

public class ProfileService {

    // returns a fully built profile, immutable
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    // safer update: returns a *new* immutable instance
    public UserProfile withDisplayName(UserProfile existing, String displayName) {
        return new UserProfile.Builder(existing.getId(), existing.getEmail())
                .phone(existing.getPhone())
                .address(existing.getAddress())
                .marketingOptIn(existing.isMarketingOptIn())
                .twitter(existing.getTwitter())
                .github(existing.getGithub())
                .displayName(displayName)
                .build();
    }
}
