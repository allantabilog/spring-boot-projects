package au.com.redenergy.data.service

import au.com.redenergy.data.Customer

interface CustomerService {
    List<Customer> findAll()
    Optional<Customer> findByName(String name)
}