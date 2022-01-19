package Nireekshan.Customer.Service;

import java.util.ArrayList;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Nireekshan.Customer.Model.Customer;
import Nireekshan.Customer.Repository.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	//For CREATING/ADDING  Customer 
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
     //For getting All Customers
	public List<Customer> getCustomers() {
		List<Customer> customers =customerRepository.findAll();
		System.out.println("Getting Customers from DB" + customers);
		return customers;
	}

	//For deleting By Id
	public void deleteById(int id) {
		customerRepository.deleteById(id);
		
	}
 
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub

        //find the user name
        Customer foundedUser = customerRepository.findByUsername(username);
        //if username is not there
        if (foundedUser == null) return null;

        String name = foundedUser.getUsername();
        String pwd = foundedUser.getPassword();
        return new User(name, pwd, new ArrayList<>());
    }
	
	
}
