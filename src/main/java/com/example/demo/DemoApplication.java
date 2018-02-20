package com.example.demo;

import com.example.demo.models.PlantInventoryEntry;
import com.example.demo.repositories.CustomPlantInventoryEntryRepository;
import com.example.demo.repositories.PlantInventoryEntryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		PlantInventoryEntry entry = new PlantInventoryEntry();

		entry.setName("Machine");
		entry.setDescription("In good shape");
		entry.setPrice(new BigDecimal(200));

		PlantInventoryEntryRepository repo = context.getBean(PlantInventoryEntryRepository.class);
		repo.save(entry);

		entry = new PlantInventoryEntry();

		entry.setName("Caterpillar");
		entry.setDescription("In good shape also");
		entry.setPrice(new BigDecimal(900));
		repo.save(entry);

		System.out.println(repo.findMethod("Ca%"));
	}
}
