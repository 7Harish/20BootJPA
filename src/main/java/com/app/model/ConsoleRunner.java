package com.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product("A",2.2));
		repo.save(new Product("B",3.3));
		Product p=repo.save(new Product("c",4.4));
		System.out.println(p.getProdCode());
		System.out.println(repo.getClass().getName());
	}

}
