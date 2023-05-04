package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.Customer;
import com.SpringBoot.MyString.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStringApplication.class, args);
		Customer customer=new Customer();
		customer.setCustomerName("Mohammed");
		customer.setCustomerEmail("moha@gmail.com");
		customer.setItems("banana");
		customer.setPrice("TSH200");
		customerRepository.save(customer);
	}
	private static CustomerRepository customerRepository;

}
