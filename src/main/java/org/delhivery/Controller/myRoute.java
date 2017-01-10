package org.delhivery.Controller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class myRoute extends SpringRouteBuilder {

    private myProcessor processor = new myProcessor();
    @Override
    public void configure() throws Exception {
        from("direct:formatX")
                .bean(processor,"xToY")
                .setHeader("Content-Type",constant("application/json"))
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("");
                    }
                })
                .marshal().json(JsonLibrary.Jackson)
                .log("${body}")
                .to("http://localhost:8080/test/postY");
    }
}
