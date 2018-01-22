package home.allan.events

import org.springframework.context.ApplicationEvent

class CustomSpringEvent extends ApplicationEvent {
    String message

    CustomSpringEvent(Object source, String message) {
        super(source)
        this.message = message
    }
}
