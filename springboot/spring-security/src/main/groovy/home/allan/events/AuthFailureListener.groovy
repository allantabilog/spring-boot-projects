package home.allan.events

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent
import org.springframework.stereotype.Component

@Component
class AuthFailureListener implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

    def logger = LoggerFactory.getLogger(AuthFailureListener)

    @Override
    void onApplicationEvent(AuthenticationFailureBadCredentialsEvent event) {
        logger.info("Failed authentication: ${event}")
    }
}
