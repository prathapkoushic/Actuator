package com.spring.zipkin;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;

import org.springframework.stereotype.Component;


@Component
public class MyBean 
{
	
    public MyBean(MeterRegistry registry) 
    {
       registry.gauge("TotalLogins",Tags.of("exam", "SCOR"), 7);
    }

}

