package com.example.fixture.network;

public class ApiClient {
    public interface Listener {
        void onSuccess(String body);

        void onError(int code);
    }

    public void fetch(String path, final Listener listener) {
        if (path == null) {
            listener.onError(400);
            return;
        }
        listener.onSuccess("ok:" + path);
    }

    public void fetchDefault() {
        fetch("/ping", new Listener() {
            @Override
            public void onSuccess(String body) {
                System.out.println(body);
            }

            @Override
            public void onError(int code) {
                System.out.println("error " + code);
            }
        });
    }
}
