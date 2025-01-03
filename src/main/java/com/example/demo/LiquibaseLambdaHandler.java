package com.example.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class LiquibaseLambdaHandler implements RequestHandler<Object, String> {

    private ConfigurableApplicationContext context;

    @Override
    public String handleRequest(Object input, Context lambdaContext) {
        if (context == null) {
            context = SpringApplication.run(LiquibaseDemoApplication.class);
        }
        return "Liquibase migration executed successfully!";
    }
}
