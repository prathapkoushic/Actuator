package com.spring.zipkin;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator
{

    @Override
    public Health health()
    {
        int errorCode = check();
        if (errorCode != 0) 
            Health.down().withDetail("Error Code", errorCode).build();
       
        return Health.up().build();
    }

    private int check()
    {
        return 500;
    }

}