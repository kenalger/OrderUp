package OrderUp.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name ="tblcustomer")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@Column(name = "fname")
	private String name;
	
	@Column(name = "lname")
	private String lastname;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "username")
	private String username;

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(int customer_id, String name, String lastname, String location, String phonenumber,
			String password, String username) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.lastname = lastname;
		this.location = location;
		this.phonenumber = phonenumber;
		this.password = password;
		this.username = username;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}