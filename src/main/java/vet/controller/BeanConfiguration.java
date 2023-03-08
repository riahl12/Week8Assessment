/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Mar 7, 2023
 */
package vet.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vet.beans.Owner;
import vet.beans.Pets;

/**
 * @author riley
 *
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Owner owner() {
		Owner bean = new Owner("John Smith");
		//bean.setName("John");
		//bean.setPhone("555-343-9987");
		//bean.setEmail("johnb@yahoo.com");
		return bean;
	}
	@Bean
	public Pets pets() {
		Pets bean = new Pets("Sally", 3, "Cat");
		return bean;
	}
}
