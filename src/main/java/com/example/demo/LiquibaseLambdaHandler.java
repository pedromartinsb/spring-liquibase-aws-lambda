package com.example.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LiquibaseLambdaHandler implements RequestHandler<String, String> {

    private final AnnotationConfigApplicationContext context;

    public LiquibaseLambdaHandler() {
        context = new AnnotationConfigApplicationContext(LiquibaseDemoApplication.class);
    }

    @Override
    public String handleRequest(String input, Context context) {
        return "Hello, " + input + "!";
    }
}
