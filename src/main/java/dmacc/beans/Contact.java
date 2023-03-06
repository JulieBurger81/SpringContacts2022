/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 3, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//--Repo's imports
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;


@Entity
public class Contact {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;
	/**
	 * 
	 */
	public Contact() {
		super();
		setRelationship("spouse");
	}
	/**
	 * @param name
	 */
	public Contact(String name) {
		super();
		setName(name);
	}
	/**
	 * @param name
	 * @param phone
	 * @param relationship
	 */
	public Contact(String name, String phone, String relationship) {
		super();
		setName(name);
		setPhone(phone);
		setRelationship(relationship);
	}
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param relationship
	 */
	public Contact(long id, String name, String phone, String relationship) {
		super();
		setId(id);
		setName(name);
		setPhone(phone);
		setRelationship(relationship);
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", relationship=" + relationship
				+ ", address=" + address + "]";
	}
	
}
