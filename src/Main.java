import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Create Companies
		Company Starbucks = new Starbucks("Starbucks", new CampaignDalStarbucks(), new CustomerDalStarbucks(),new SellingDalStarbucks());
		Company Nero = new Nero("Nero", new CampaignDalNero(), new CustomerDalNero(), new SellingDalNero());

		//Create Customers
		Customer busra = new Customer("2781111", "Büþra", "Öz", "1996");
		Customer betul = new Customer("2781112", "Betül", "Öz", "1998");
		Customer ayse = new Customer("2781113", "Ayþe", "Öz", "1992");
		Customer bahtiyar = new Customer("2781114", "Bahtiyar", "Öz", "1962");
		Customer dilek = new Customer("2781115", "Dilek", "Öz", "1971");
		Customer buglem = new Customer("2781116", "Buðlem", "Evran", "2018");

		//Create Customer Managers
		CustomerManager customerManagerStarbucks = new CustomerManagerStarbucks(Starbucks);
		CustomerManager customerManagerNero = new CustomerManagerNero(Nero);

		//Customer Manager Ýþlemleri
		customerManagerStarbucks.register(busra);
		customerManagerStarbucks.register(betul);
		customerManagerStarbucks.register(dilek);
		customerManagerStarbucks.register(ayse);
		customerManagerStarbucks.register(dilek);
		System.out.println("Kayýtlý kiþi sayýsý:" +customerManagerStarbucks.getCustomers().size());
		customerManagerStarbucks.deleteCustomer(ayse);
		System.out.println("Kayýtlý kiþi sayýsý:" +customerManagerStarbucks.getCustomers().size());
		
		
		System.out.println("------------------------------------");
		
		
		customerManagerNero.register(busra);
		customerManagerNero.register(bahtiyar);
		customerManagerNero.register(buglem);
		customerManagerNero.register(betul);
		customerManagerNero.register(dilek);
		System.out.println("Kayýtlý kiþi sayýsý:" +customerManagerNero.getCustomers().size());
		
		buglem.setLastName("Öz");
		customerManagerNero.updateInfo(buglem);
		System.out.println("Kayýtlý kiþi sayýsý:" +customerManagerNero.getCustomers().size());
		
		
		System.out.println("------------------------------------");
		
		//Create Campaign
		Campaign campaign1 = new Campaign("StarbuckKampanya1");
		Campaign campaign2 = new Campaign("NeroKampanya1");
		
		//Create CampaignManager
		CampaignManager campaignManagerStarbucks = new CampaignManager(Starbucks);
		CampaignManager campaignManagerNero = new CampaignManager(Nero);

		//Campaign Manager Ýþlemleri
		campaignManagerStarbucks.add(campaign1);
		campaignManagerNero.add(campaign2);
		
		
		
		// Create Selling Service
		SellingService sellingServiceStarbucks = new SellingServiceStarbucks(campaignManagerStarbucks, Starbucks);
		SellingService sellingServiceNero = new SellingServiceNero(campaignManagerNero, Nero);

		
		//Selling Service Ýþlemleri
		System.out.println("------------------------------------");
		sellingServiceStarbucks.createStock(5);
		System.out.println("------------------------------------");
		ArrayList<Campaign> campaignsStarbucks=campaignManagerStarbucks.getCampaigns();
		//choose one campaign and use it
		sellingServiceStarbucks.sellCoffee(busra, 2, campaignsStarbucks.get(0));
		System.out.println("------------------------------------");
		sellingServiceStarbucks.sellCoffee(ayse, 1);
		System.out.println("------------------------------------");
		sellingServiceStarbucks.sellCoffee(betul, 3);
		System.out.println("------------------------------------");
		sellingServiceStarbucks.sellCoffee(betul, 2);
	

		System.out.println("------------------------------------");
		sellingServiceNero.createStock(12);
		System.out.println("------------------------------------");
		ArrayList<Campaign> campaignsNero=campaignManagerNero.getCampaigns();
		//choose one campaign and use it
		sellingServiceNero.sellCoffee(busra, 2, campaignsNero.get(0));
		System.out.println("------------------------------------");
		sellingServiceNero.sellCoffee(ayse, 1);
		System.out.println("------------------------------------");
		sellingServiceNero.sellCoffee(betul, 3);
		System.out.println("------------------------------------");
		sellingServiceNero.sellCoffee(betul, 2);
	}

}
