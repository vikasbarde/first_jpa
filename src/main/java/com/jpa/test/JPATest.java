package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Address;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		Address address = new Address();
		address.setCity("Dhaka");
		address.setCountry("Bangladesh");
		address.setPostcode("1000");
		address.setStreet("Poribagh");
		em.getTransaction().begin();
		em.persist(address);
		em.getTransaction().commit();
		em.close();
		emFactory.close();

	}

}
