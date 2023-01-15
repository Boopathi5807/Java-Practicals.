package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneApp {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		System.out.println("Hello World!");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		Person personobj = new Person();
		personobj.setPersonId(1);
		personobj.setPersonName("Dhurai Rajini");
		personobj.setAddress("MelOlakkur");
		personobj.setContactNumber("1234567890");
		personobj.setFatherName("Mani");
		PanCard panObj = new PanCard();
		panObj.setPanCard(101);
		panObj.setPanCardNumber("abc12345");
		panObj.setPerson(personobj);

		personobj.setPanCard(panObj);

		session.save(personobj);
		session.save(panObj);

		txt.commit();

	}
}
