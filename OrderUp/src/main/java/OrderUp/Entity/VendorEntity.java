package OrderUp.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblowner")
public class VendorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int owner_id;
	
	@Column(name = "fname")
	private String firstname;
	
	@Column(name = "lname")
	private String lastname;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
    
	public VendorEntity() {
		super();
	}


	public VendorEntity(int owner_id, String firstname, String lastname, String location, String password,
			String email) {
		super();
		this.owner_id = owner_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.password = password;
		this.email = email;
	}


	public int getOwner_id() {
		return owner_id;
	}


	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
