package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getDoubleShouldReturnDoubledInput() throws Exception{

        int input = 27;

//      Object returnedObject = restTemplate.getForObject("http://localhost:" + port + "/double?number=" + input, Integer.class);
//      System.out.println(returnedObject);
        //assertThat(restTemplate.getForObject("http://localhost:" + port + "/double?input=" + input, String.class).contains("54"));

        //assertThat(result).isEqualTo(54);

        assertThat(restTemplate.getForObject("http://localhost:" + port + "/double?number=" + input, Integer.class).equals(54));
    }
}
