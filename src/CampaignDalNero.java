import java.util.ArrayList;

public class CampaignDalNero implements CampaignDal {

	// Normalde b�yle olu�turmayaca��z tabi DB'den gelecek, ben simule edebilmek
	// i�in koydum
	ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println("DB: Nero'ya yeni bir kampanya eklendi.");

	}

	@Override
	public void update(Campaign campaign1,Campaign campaign2) {
		campaigns.remove(campaign1);
		campaigns.add(campaign2);
		System.out.println("DB: Nero'daki kampanya g�ncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println("DB: Nero'dan kampanya silindi.");

	}

	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	

}
