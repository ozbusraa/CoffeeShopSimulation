
public abstract class SellingService {

	CampaignManager campaignManager;
	SellingDal sellingDal;
	CustomerDal customerDal;

	public SellingService(CampaignManager campaignManager, Company company) {
		this.campaignManager = campaignManager;
		this.sellingDal = company.getSellingDal();
		this.customerDal = company.getCustomerDal();
	}

	public void createStock(int coffeeCount) {
		sellingDal.createStock(coffeeCount);
	}

	public boolean checkStocks(int coffeeCount) {
		int count = sellingDal.getStockCount();

		if (count >= coffeeCount) {
			return true;
		} 
		else {
			if (count > 0) {
				System.out.println("Malesef stokta sadece " + count + " tane kahve kald�.");		
			}
			return false;
		}
	}

	public void sellCoffee(Customer customer, int coffeeCount, Campaign campaign) {

		if (checkStocks(coffeeCount)) {

			campaignManager.applyCampaign(campaign);

			if (customerDal.checkCustomer(customer)) {
				customerDal.updateShopingInfo(coffeeCount, customer);
			}

			System.out.println("Kahve sat��� yap�ld�");
			sellingDal.updateStock(coffeeCount);

		} else {
			System.out.println("Yeterli stok bulunmad���ndan kahve sat��� yap�lamad�");
		}

	}

	public void sellCoffee(Customer customer, int coffeeCount) {

		if (checkStocks(coffeeCount)) {

			if (customerDal.checkCustomer(customer)) {
				customerDal.updateShopingInfo(coffeeCount, customer);
			}
			System.out.println("Kahve sat��� yap�ld�");
			sellingDal.updateStock(coffeeCount);
		} else {
			System.out.println("Yeterli stok bulunmad���ndan kahve sat��� yap�lamad�");
		}

	}
}
