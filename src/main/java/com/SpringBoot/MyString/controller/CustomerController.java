package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.Customer;
import com.SpringBoot.MyString.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/mycustomers")
public class CustomerController {
    private CustomerService customerService;

    ///buid create customer rest api
    //http://localhost:8080/api/user
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer savedCustomer=customerService.createCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    //create get customer by id rest api
    @GetMapping
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long customerId){
        Customer customer=customerService.getCustomerById(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    //create get all customers rest api
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers=customerService.getAllCustomers();
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }
    //create update customer rest api
    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") Long customerId){
        customer.setId(customerId);
        Customer updatedCustomer=customerService.updateCustomer(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    //create delete customer rest api
    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("customer deleted", HttpStatus.OK);
    }
}
