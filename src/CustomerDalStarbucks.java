import java.util.ArrayList;

public class CustomerDalStarbucks implements CustomerDal {

	// Normalde b�yle olu�turmayaca��z tabi DB'den gelecek, ben simule edebilmek i�in koydum
	private ArrayList<Customer> customers=new ArrayList<Customer>();
	
	@Override
	public void register(Customer customer) {
		customers.add(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" Starbucks veritaban�na kaydedildi.");
	}

	@Override
	public void updateInfo(Customer customer) {
		//bu �ekilde do�ru olmad���n�n fark�nday�m
		customers.remove(customer);
		customers.add(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" bilgileri Starbucks veritaban�nda g�ncellendi." );
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customers.remove(customer);
		System.out.println("DB: "+customer.getFirstName()+" "+customer.getLastName()+" Starbucks veritaban�ndan silindi." );
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
		System.out.println("DB: M��terinin Starbucks veritaban�ndaki al��veri� bilgisi g�ncellendi");

	}

}
