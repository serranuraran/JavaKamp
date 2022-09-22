package oop1;

//classlar PascalCase isimlendirilir.
public class Product {
	private String name;
	// Fieldlar camelCase yazýlýr.
	private double unitPrice; // birim fiyatý
	private double discount; // indirim oraný
	private String imageUrl; // görselresmi
	// String[] imageUrls; //çok fotografý olabilir
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
