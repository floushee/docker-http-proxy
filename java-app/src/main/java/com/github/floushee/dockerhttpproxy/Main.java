package com.github.floushee.dockerhttpproxy;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main {

    public static void main(String[] args) throws Exception {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://jsonplaceholder.typicode.com/todos/1")
                .build();

       while(true) {
           Response response = client.newCall(request).execute();

           System.out.println("body: " + response.body().string());

           Thread.sleep(5000);
       }
    }
}
