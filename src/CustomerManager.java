import java.util.ArrayList;

public abstract class CustomerManager {

	CustomerDal customerDal;

	public CustomerManager(Company company) {
		this.customerDal = company.getCustomerDal();
	}

	public void register(Customer customer) {
		if (!customerDal.checkCustomer(customer)) {
		customerDal.register(customer);
		}
		else {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+ " zaten sistemde kayýtlý, yeni kayýt oluþturulmadý.");
		}
	};

	public void updateInfo(Customer customer) {
		
		customerDal.updateInfo(customer);
	}

	public void deleteCustomer(Customer customer) {
		customerDal.deleteCustomer(customer);
	}
	
	public ArrayList<Customer> getCustomers() {
		return customerDal.getCustomers();
	}
	
}
