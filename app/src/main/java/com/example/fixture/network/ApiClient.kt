package com.example.fixture.network

class ApiClient {
    interface Listener {
        fun onSuccess(body: String)

        fun onError(code: Int)
    }

    fun fetch(path: String?, listener: Listener) {
        if (path == null) {
            listener.onError(400)
            return
        }
        listener.onSuccess("ok:$path")
    }

    fun fetchDefault() {
        fetch("/ping", object : Listener {
            override fun onSuccess(body: String) {
                println(body)
            }

            override fun onError(code: Int) {
                println("error $code")
            }
        })
    }
}
