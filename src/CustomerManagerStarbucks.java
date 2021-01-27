
public class CustomerManagerStarbucks extends CustomerManager {

	public CustomerManagerStarbucks(Company company) {
		super(company);
	}

	public boolean checkEDevlet(Customer c) {		
		//return eDevletAPI.check(c.getIdentityNumber(),c.getFirstName(),c.getLastName(),c.getBirthYear());
		return true;

	}

	@Override
	public void register(Customer c) {
		if (!customerDal.checkCustomer(c)) {
			if (checkEDevlet(c)) {
				System.out.println("E-devlet kontrol� yap�ld�");
				customerDal.register(c);
			}
		}
		else {
		System.out.println(c.getFirstName()+" "+c.getLastName()+" zaten sistemde kay�tl�, yeni kay�t olu�turulmad�.");
		}
		
	
	}

}
