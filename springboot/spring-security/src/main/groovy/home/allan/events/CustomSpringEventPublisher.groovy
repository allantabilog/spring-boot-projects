package home.allan.events

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.ApplicationEventPublisher

@SpringBootConfiguration
class CustomSpringEventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher

    void doStuffAndPublishEvent(final String message) {
        println "Publishing custom event ${message}"
        CustomSpringEvent customEvent = new CustomSpringEvent(this, message)
        publisher.publishEvent(customEvent)

    }
}
