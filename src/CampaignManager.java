import java.util.ArrayList;

public class CampaignManager {

	CampaignDal campaignDal;

	public CampaignManager(Company company) {
		this.campaignDal = company.getCampaignDal();
	};

	public void add(Campaign campaign) {
		campaignDal.add(campaign);
	};

	public void delete(Campaign campaign) {
		campaignDal.delete(campaign);
	};

	public void update(Campaign campaign,Campaign campaign2) {
		campaignDal.update(campaign, campaign2);
	};

	public void applyCampaign(Campaign campaign) {
		System.out.println("Kampanya uygulandý: " + campaign.getCampaignName());

	};
	
	public ArrayList<Campaign> getCampaigns() {
	
		return campaignDal.getCampaigns();
	}

	
}
