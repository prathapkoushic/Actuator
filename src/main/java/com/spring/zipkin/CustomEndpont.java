package com.spring.zipkin;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Endpoint(id="go")
public class CustomEndpont 
{
	@ReadOperation
    public WritePojo first()
    {
    	WritePojo w = new WritePojo();
    	w.setName("prathap");
		return w;
    }
}
