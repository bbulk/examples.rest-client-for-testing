package dev.bbulk.rest_client_for_testing;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;

public class MyRestClientTest {

    @Test
    public void callSomeUrlTest() {
        MyRestClient restClient = RestClientBuilder.newBuilder()
                .baseUri(URI.create("https://example.com/"))
                .build(MyRestClient.class);

        String information = restClient.getSomeInformation();
        System.out.println(information);
    }

}
