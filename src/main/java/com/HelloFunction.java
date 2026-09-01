package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.IOException;

public class HelloFunction implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response)
            throws IOException {

        response.getWriter().write(
                "Hello from my Java Google Cloud Function!"
        );
    }
}
