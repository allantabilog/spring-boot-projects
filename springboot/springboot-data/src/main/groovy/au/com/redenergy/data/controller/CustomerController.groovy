package au.com.redenergy.data.controller

import au.com.redenergy.data.Customer
import au.com.redenergy.data.service.CustomerService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping("/customers")
class CustomerController {

    @Autowired
    CustomerService customerService

    @GetMapping
    List<Customer> findAll(){
        List<Customer> results = customerService.findAll()
        log.info("Obtained results: ${results}")
        return results
    }

    @GetMapping("/{name}")
    Customer findByName(@PathVariable("name") String name){
        return customerService.findByName(name)
    }
}
