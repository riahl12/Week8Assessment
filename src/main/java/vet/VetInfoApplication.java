package vet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import vet.beans.Owner;
import vet.beans.Pets;
import vet.controller.BeanConfiguration;
import vet.repository.OwnerRepository;

@SpringBootApplication
public class VetInfoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VetInfoApplication.class, args);
	}
	@Autowired
	OwnerRepository repo;
	
	@Override
	public void run(String...args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Owner o = appContext.getBean("owner",Owner.class);
		o.setEmail("test@test.com");
		repo.save(o);
		
		Owner a = new Owner("Barb White", "555-654-7877", "bwhite@yahoo.com");
		Pets p = new Pets("Simon", 7, "Dog");
		a.setPets(p);
		repo.save(a);
		
		List<Owner> allMyOwners = repo.findAll();
		for(Owner own: allMyOwners) {
			System.out.println(own.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
