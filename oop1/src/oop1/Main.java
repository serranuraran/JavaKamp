package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraný";

		// String ve Product veri tipi
		// mesaj ve product1 deðiþken ismi 

		Product product1 = new Product();   //bir classa veri bu þekilde atanýr
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		                // deðer atama =set
		//product1.name = "Delonghi Kahve Makinesi";
		//product1.unitPrice = 7500;
		//product1.discount = 7;
		//product1.unitsInStock = 3;
		//product1.imageUrl = "bilmemne.jpg";

		                     // burda okuyorum = get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products= {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {         //git product'larý tek tek gez demek     //veri tipi:Product   product:takma isim
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroð");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("053333333");
		corporateCustomer.setTaxNumbaer("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
