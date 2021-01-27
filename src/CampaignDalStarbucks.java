import java.util.ArrayList;

public class CampaignDalStarbucks implements CampaignDal {

	// Normalde böyle oluþturmayacaðýz tabi DB'den gelecek, ben simule edebilmek
	// için koydum
	ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println("DB: Starbucks'a yeni bir kampanya eklendi.");

	}

	@Override
	public void update(Campaign campaign1,Campaign campaign2) {
		campaigns.remove(campaign1);
		campaigns.add(campaign2);
		System.out.println("DB: Starbucks'daki kampanya güncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println("DB: Starbucks'dan kampanya silindi.");

	}
	
	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

}
