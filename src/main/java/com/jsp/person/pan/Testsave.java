package com.jsp.person.pan;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testsave {
	public static void main(String[] args) {
		
		
		

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sairaj"); 
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    
	    
	    
	    
	    
	    Person person=new Person();
	    person.setEmail("ewdjiqdi@gmail.com");
       person.setName("sdqjwndrajhd");
       
       
       
       Pan pan =new Pan();
       pan.setGst_number("sjhwdeiu23");
       pan.setPerson(person);
       
       
       entityTransaction.begin();
       entityManager.persist(person);
       entityManager.persist(pan);
       entityTransaction.commit();
		
	}

}
