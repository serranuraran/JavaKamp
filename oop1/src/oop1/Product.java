package oop1;

//classlar PascalCase isimlendirilir.
public class Product {
	private String name;
	// Fieldlar camelCase yaz�l�r.
	private double unitPrice; // birim fiyat�
	private double discount; // indirim oran�
	private String imageUrl; // g�rselresmi
	// String[] imageUrls; //�ok fotograf� olabilir
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
