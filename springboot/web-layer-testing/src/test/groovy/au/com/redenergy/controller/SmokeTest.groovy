package au.com.redenergy.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class SmokeTest {

    @Autowired
    HomeController controller

    @Test
    void contextLoads() throws Exception {
        !controller
    }

}
