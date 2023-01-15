package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int personId;
	@Column(nullable = false,unique = true,length = 30)
	private String personName;
	@Column(nullable = false,unique = true,length = 30)
	private String fatherName;
	@Column(nullable = false,length = 30)
	private String Address;
	@Column(nullable = false,length = 30)
	private String contactNumber;
	@OneToOne(mappedBy = "person")
	private PanCard panCard;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public PanCard getPanCard() {
		return panCard;
	}
	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", fatherName=" + fatherName
				+ ", Address=" + Address + ", contactNumber=" + contactNumber + ", panCard=" + panCard + "]";
	}
	public Person() {
		super();

	}
	
	
}
