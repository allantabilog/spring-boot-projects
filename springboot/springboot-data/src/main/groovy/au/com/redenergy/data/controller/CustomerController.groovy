package au.com.redenergy.data.controller

import au.com.redenergy.data.Customer
import au.com.redenergy.data.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @Autowired
    CustomerService customerService

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<Customer> findAll(){
        return customerService.findAll()
    }
}
