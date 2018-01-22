package home.allan.events

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.security.authentication.event.AuthenticationSuccessEvent
import org.springframework.stereotype.Component

@Component
class AuthSuccessListener implements ApplicationListener<AuthenticationSuccessEvent> {

    def logger = LoggerFactory.getLogger(AuthSuccessListener)

    @Override
    void onApplicationEvent(AuthenticationSuccessEvent event) {
        println "Successful authentication. Details: ${event}"
        logger.info("Successful authentication. Details: ${event}")
    }
}
