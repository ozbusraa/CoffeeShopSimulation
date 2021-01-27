import java.util.ArrayList;

public interface CustomerDal {
	public void register(Customer customer);

	public void updateInfo(Customer customer);

	public void deleteCustomer(Customer customer);

	public ArrayList<Customer> getCustomers();

	public boolean checkCustomer(Customer customer);

	public void updateShopingInfo(int coffeeCount, Customer customer);
}
