package oop1;

public class CorporateCustomer extends Customer {   //kurumsal m��teri
	private String companyName;
	private String taxNumbaer;   //vergi numaras�

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumbaer() {
		return taxNumbaer;
	}

	public void setTaxNumbaer(String taxNumbaer) {
		this.taxNumbaer = taxNumbaer;
	}

}
