package com.example.fixture.util;

public class Logger {
    private static final String TAG = "Fixture";

    private final String scope;

    public Logger(String scope) {
        this.scope = scope;
    }

    public static Logger forScope(String scope) {
        return new Logger(scope);
    }

    public void info(String message) {
        System.out.println(TAG + "/" + scope + ": " + message);
    }
}
