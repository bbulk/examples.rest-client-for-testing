package dev.bbulk.rest_client_for_testing;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRestClientTest {

    private static MyRestClient restClient;

    @BeforeAll
    public static void init() {
        restClient = RestClientBuilder.newBuilder()
                .baseUri(URI.create("https://example.com/"))
                .build(MyRestClient.class);
    }

    @Test
    public void testMyService() {
        // given
        restClient.createSomeInformation("myTestData");

        // when
        String information = restClient.getSomeInformation();

        // then
        assertEquals("myTestData", information);
    }

}
