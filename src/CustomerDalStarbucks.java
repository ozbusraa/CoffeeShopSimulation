import java.util.ArrayList;

public class CustomerDalStarbucks implements CustomerDal {

	// Normalde böyle oluþturmayacaðýz tabi DB'den gelecek, ben simule edebilmek için koydum
	private ArrayList<Customer> customers=new ArrayList<Customer>();
	
	@Override
	public void register(Customer customer) {
		customers.add(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" Starbucks veritabanýna kaydedildi.");
	}

	@Override
	public void updateInfo(Customer customer) {
		//bu þekilde doðru olmadýðýnýn farkýndayým
		customers.remove(customer);
		customers.add(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" bilgileri Starbucks veritabanýnda güncellendi." );
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customers.remove(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" Starbucks veritabanýndan silindi." );
	}

	@Override
	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	@Override
	public boolean checkCustomer(Customer customer) {
		
		return customers.contains(customer);
	}

	@Override
	public void updateShopingInfo(int coffeeCount, Customer customer) {
		System.out.println("DB: Müþterinin Starbucks veritabanýndaki alýþveriþ bilgisi güncellendi");

	}

}
