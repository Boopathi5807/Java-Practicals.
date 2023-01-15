package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	private int panCard;
	@Column(unique = true,nullable = false)
	private String panCardNumber;
	@OneToOne
	@JoinColumn(name="personId")
	private Person person;
	public int getPanCard() {
		return panCard;
	}
	public void setPanCard(int panCard) {
		this.panCard = panCard;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "PanCard [panCard=" + panCard + ", panCardNumber=" + panCardNumber + ", person=" + person + "]";
	}
	public PanCard() {
		super();

	}
	
	
}
