package com.tachyonlabs.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import com.tachyonlabs.builditbigger.javajokes.Joker;

import java.util.logging.Level;
import java.util.logging.Logger;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.tachyonlabs.com",
                ownerName = "backend.builditbigger.tachyonlabs.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    private static final Logger LOGGER = Logger.getLogger( MyEndpoint.class.getName() );

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }
    @ApiMethod(name = "getJoke")
    public MyBean getJoke(@Named("name") String name) {
        LOGGER.log( Level.FINE, "in MyEndpoint" );
        MyBean response = new MyBean();
        response.setData(Joker.getJoke());

        return response;
    }
}
