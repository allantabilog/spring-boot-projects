package home.allan.events

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

import java.time.LocalDate

import static org.junit.Assert.assertNotNull


@RunWith(SpringRunner)
@SpringBootTest
class EventTester {

    @Autowired
    CustomSpringEventPublisher publisher

    @Test
    void contextLoads() {}

    @Test
    void shouldCreateEvents() {
        assertNotNull(publisher)
        publisher.doStuffAndPublishEvent(LocalDate.now().toString())
    }
}