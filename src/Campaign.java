
public class Campaign {
	private String campaignName;
	private String campaignConditions;
	private int startYear;
	private int endYear;
	
	
	public Campaign(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public String getCampaignConditions() {
		return campaignConditions;
	}


	public void setCampaignConditions(String campaignConditions) {
		this.campaignConditions = campaignConditions;
	}


	public int getStartYear() {
		return startYear;
	}


	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}


	public int getEndYear() {
		return endYear;
	}


	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	
	
}
