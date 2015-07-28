package com.dmnlk.sample;

import com.codahale.metrics.annotation.Timed;
import com.dmnlk.doma.dao.TAccountDao;
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
    private final TAccountDao tAccountDao;

    public SampleResource(String template, String defaultName, TAccountDao dao) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        this.tAccountDao = dao;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name")Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        Integer a = tAccountDao.findById(1);
        System.out.println(String.format("data is %s", a));
        return  new Saying(counter.incrementAndGet(), value);
    }

}
