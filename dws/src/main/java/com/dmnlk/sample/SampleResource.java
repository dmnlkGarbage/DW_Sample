package com.dmnlk.sample;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author dmnlk
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
}
