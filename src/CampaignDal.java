import java.util.ArrayList;

public interface CampaignDal {
	public void add(Campaign campaign);

	public void update(Campaign campaign1,Campaign campaign2);

	public void delete(Campaign campaign);
	
	public ArrayList<Campaign> getCampaigns();
}
