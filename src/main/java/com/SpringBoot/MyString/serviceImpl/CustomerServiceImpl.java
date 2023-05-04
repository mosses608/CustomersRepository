package com.SpringBoot.MyString.serviceImpl;

import com.SpringBoot.MyString.entity.Customer;
import com.SpringBoot.MyString.repository.CustomerRepository;
import com.SpringBoot.MyString.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer=customerRepository.findById(customerId);
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customer1=customerRepository.findById(customer.getId()).get();
        customer1.setCustomerName(customer.getCustomerName());
        customer1.setCustomerEmail(customer.getCustomerEmail());
        customer1.setItems(customer.getItems());
        customer1.setPrice(customer.getPrice());
        Customer updatedCustomer=customerRepository.save(customer1);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }
}
