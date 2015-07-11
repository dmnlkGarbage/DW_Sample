package com.dmnlk.sample;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dmnlk
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public SampleResource(String template, String defaultName, AtomicLong counter) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = counter;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name")Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return  new Saying(counter.incrementAndGet(), value);
    }

}
