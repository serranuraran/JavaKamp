package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { // response request
		// i� kurallar�
		if (product.getUnitPrice() < 10) {
			throw new Exception("�r�n fiyat� 10 dan k���k olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {  //[db,file]
			logger.log(product.getName());
		}
	}
}
