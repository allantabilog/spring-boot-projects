package au.com.redenergy.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @LocalServerPort
    int port

    @Autowired
    TestRestTemplate restTemplate

    @Test
    void greetingReturnsDefaultMessage() throws Exception {

        restTemplate.getForObject("http://localhost:${port}", String).contains("Greetings")
    }
}
