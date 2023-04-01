package dev.bbulk.rest_client_for_testing;

import jakarta.ws.rs.GET;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface MyRestClient {

    @GET
    String getSomeInformation();

}
