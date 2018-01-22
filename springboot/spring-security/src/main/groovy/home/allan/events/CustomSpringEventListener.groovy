package home.allan.events

import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    void onApplicationEvent(CustomSpringEvent event) {
        println "Received event: " + event.message
    }
}
