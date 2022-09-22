package oop1;

public class CorporateCustomer extends Customer {   //kurumsal müþteri
	private String companyName;
	private String taxNumbaer;   //vergi numarasý

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
