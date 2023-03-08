/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Mar 7, 2023
 */
package vet.beans;

import jakarta.persistence.Embeddable;

/**
 * @author riley
 *
 */
@Embeddable
public class Pets {
	private String petName;
	private int age;
	private String species;
	
	public Pets() {
		super();
	}
	
	public Pets(String petName, int age, String species) {
		super();
		this.petName = petName;
		this.age = age;
		this.species = species;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Pets [petName=" + petName + ", age=" + age + ", species=" + species + "]";
	}
	
	
}
