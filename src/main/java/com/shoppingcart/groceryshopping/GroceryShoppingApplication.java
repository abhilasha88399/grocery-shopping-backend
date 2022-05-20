package com.shoppingcart.groceryshopping;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shoppingcart.groceryshopping.model.Category;
import com.shoppingcart.groceryshopping.model.Product;
import com.shoppingcart.groceryshopping.repository.CategoryRepository;
import com.shoppingcart.groceryshopping.repository.ProductRepository;

@SpringBootApplication
public class GroceryShoppingApplication  {
   /* @Autowired
    private CategoryRepository catRepo;
    @Autowired
    private ProductRepository proRepo;
    */
	public static void main(String[] args) {
		SpringApplication.run(GroceryShoppingApplication.class, args);
	}
	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category category1 = new Category(1, "Salt");
		Category category2 =  new Category(2,"Pulses");
		Category category3 =  new Category(3,"Rice");
		Category category4 =  new Category(4,"Fast Food");
		Category category5 =  new Category(5,"Oil");
		catRepo.save(category1);
		catRepo.save(category2);
		catRepo.save(category3);
		catRepo.save(category4);
		catRepo.save(category5);
		
		Product product1 = new Product(1,"Pink Salt","Himalayan",50,"assets/pink salt.jpeg","1 kg");
		product1.setCategory(category1);
		Product product2 = new Product(2,"White Salt","Tata",50,"assets/white salt.jpeg","1 kg");
		product2.setCategory(category1);
		Product product3 = new Product(3,"Rock Salt","Tata",50,"assets/rock salt.jpeg","1 kg");
		product3.setCategory(category1);
		Product product4 = new Product(4,"Toor Dal","Tata",150,"assets/Toor Dal.jpg","1 kg");
		product4.setCategory(category2);
		Product product5 = new Product(5,"Urad Dal","Tata samapan",150,"assets/urad dal.jpeg","1 kg");
		product5.setCategory(category2);
		Product product6 = new Product(6,"Chana Dal", "Aashirvaad",150,"assets/chana dal.jpeg","1 kg");
		product6.setCategory(category2);
		Product product7 = new Product(7,"Soyabean oil", "Fortune",180,"assets/oil/jpg","1 kg");
		product7.setCategory(category5);
		Product product8 = new Product(8,"Mustard oil","Fortune",180, "assets/oil.jpg","1 kg");
		product8.setCategory(category5);
		Product product9 = new Product(9,"Groundnut oil", "Hathmic", 180,"assests/oil.jpg","5 L");
		product9.setCategory(category5);
		Product product10 = new Product(10,"Basmati rice regular", "India gate", 100,"assets/regular rice.jpg","1 kg");
		product10.setCategory(category3);
		Product product11 = new Product(11,"Basmati rice", "India gate", 100, "assets/basmati rice.jpg", "1 kg");
		product11.setCategory(category3);
		Product product12 = new Product(12,"Maggi", "India gate", 10,"assets/maggi.jpeg","100g");
		product12.setCategory(category4);
		
		proRepo.save(product1);
		proRepo.save(product2);
		proRepo.save(product3);
		proRepo.save(product4);
		proRepo.save(product5);
		proRepo.save(product6);
		proRepo.save(product7);
		proRepo.save(product8);
		proRepo.save(product9);
		proRepo.save(product10);
		proRepo.save(product11);
		proRepo.save(product12);
}
*/	
     
	
}
