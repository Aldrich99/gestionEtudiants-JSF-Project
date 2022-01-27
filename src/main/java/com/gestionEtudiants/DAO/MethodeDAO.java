package com.gestionEtudiants.DAO;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@RequestScoped
public class MethodeDAO implements Serializable, DAOImplementations{

	private static final long serialVersionUID = 9123157693117217959L;

	@Override
	public void createUsers(InscriptionsUsers etudiants) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEtudiants");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(etudiants);
		em.getTransaction().commit();
		em.close();
		emf.close();
			
	}

	@Override
	public List<InscriptionsUsers> searcheUsers(int matricule) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEtudiants");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT item FROM InscriptionsUsers item WHERE item.matricule=:matricule");
		query.setParameter("matricule", matricule);
		
		List<InscriptionsUsers> utilisateurFind =query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return utilisateurFind;
		
	}

	@Override
	public void updateUsers(int matricule) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void deleteUsers(int matricule) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEtudiants");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();		
		em.remove(matricule);		
		em.getTransaction().commit(); 
		em.close();
		emf.close();

	}

	@Override
	public List<InscriptionsUsers>  allUsers() {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionEtudiants");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT item FROM InscriptionsUsers item ");
		
		List<InscriptionsUsers> utilisateurs = query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return utilisateurs;
	}



}
