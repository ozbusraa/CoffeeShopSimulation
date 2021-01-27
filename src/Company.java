
public class Company {

	public String companyName;
	CampaignDal campaignDal;
	CustomerDal customerDal;
	SellingDal sellingDal;

	public Company(String companyName, CampaignDal campaignDal, CustomerDal customerDal, SellingDal sellingDal) {
		this.companyName = companyName;
		this.campaignDal = campaignDal;
		this.customerDal = customerDal;
		this.sellingDal = sellingDal;
	}

	public SellingDal getSellingDal() {
		return sellingDal;
	}

	public void setSellingDal(SellingDal sellingDal) {
		this.sellingDal = sellingDal;
	}

	public CustomerDal getCustomerDal() {
		return customerDal;
	}

	public void setCustomerDal(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CampaignDal getCampaignDal() {
		return campaignDal;
	}

	public void setCampaignDal(CampaignDal campaignDal) {
		this.campaignDal = campaignDal;
	}

}
