package com.example.fixture.ui;

import com.example.fixture.data.UserRepository;
import com.example.fixture.model.User;

public class UserViewModel {
    private final UserRepository repository;
    private String displayName;

    public UserViewModel(UserRepository repository) {
        this.repository = repository;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void loadUser(String id) {
        repository.load(id, new UserRepository.Callback() {
            @Override
            public void onResult(User user) {
                displayName = user != null ? user.getName() : "Unknown";
            }
        });
    }
}
