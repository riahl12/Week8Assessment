/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Mar 7, 2023
 */
package vet.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author riley
 *
 */
@Data
@NoArgsConstructor
@Entity
public class Owner {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String email;
	@Autowired
	private Pets pets;
	
	/*public Owner() {
		super();
	}*/
	
	public Owner(String name) {
		super();
		this.name = name;
	}
	
	public Owner(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public Owner(long id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	/*public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pets getPets() {
		return pets;
	}

	public void setPets(Pets pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", pets=" + pets + "]";
	}*/

	
	
	
	
}
