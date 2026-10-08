package com.example.fixture.data;

import com.example.fixture.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public interface Callback {
        void onResult(User user);
    }

    private final List<User> users = new ArrayList<>();

    public void add(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void load(final String id, final Callback callback) {
        callback.onResult(findById(id));
    }
}
