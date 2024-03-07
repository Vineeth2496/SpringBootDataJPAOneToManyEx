package com.SpringBootJDataJPA.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Model;
import com.SpringBootJDataJPA.model.Product;
import com.SpringBootJDataJPA.repo.ModelRepository;
import com.SpringBootJDataJPA.repo.ProductRepository;
@Component
public class TestDataInsertRunner implements CommandLineRunner {
	@Autowired
	private ModelRepository mrepo;
	@Autowired
	private ProductRepository prepo;
	@Override
	public void run(String... args) throws Exception {
		Model m1=new Model(105, "M34", "RED", 5200.00);
		Model m2=new Model(106, "K45", "BLUE", 5400.00);
		Model m3=new Model(107, "YT9", "PINK", 5900.00);
		
		mrepo.save(m1);
		mrepo.save(m2);
		mrepo.save(m3);
		
		Product p1=new Product(10, "S-MOBILE", "SANUI", Set.of(m1, m2, m3));
		
		prepo.save(p1);
		
	}

}
