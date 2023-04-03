package dev.bbulk.rest_client_for_testing;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface MyRestClient {

    @POST
    void createSomeInformation(String information);

    @GET
    String getSomeInformation();

}
