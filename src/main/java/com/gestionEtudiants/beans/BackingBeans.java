package com.gestionEtudiants.beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gestionEtudiants.DAO.InscriptionsUsers;
import com.gestionEtudiants.DAO.MethodeDAO;


@RequestScoped
@Named
public class BackingBeans implements Serializable {

	private static final long serialVersionUID = 6439204785829420537L;
	
	private Random rand = new Random();
	private int mat = rand.nextInt(8888);
	private int idSup = 9;


	private InscriptionsUsers infosInscription = new InscriptionsUsers();
	
	@Inject
	private MethodeDAO etudiantsMethodes = new MethodeDAO() ;
	
	
	public InscriptionsUsers getInfosInscription() {
		return infosInscription;
	}

	public void setInfosInscription(InscriptionsUsers infosInscription) {
		this.infosInscription = infosInscription;
	}

	public MethodeDAO getEtudiantsMethodes() {
		return etudiantsMethodes;
	}

	public void setEtudiantsMethodes(MethodeDAO etudiantsMethodes) {
		this.etudiantsMethodes = etudiantsMethodes;
	}
	
	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getIdSup() {
		return idSup;
	}

	public void setIdSup(int idSup) {
		this.idSup = idSup;
	}

	public void Validation() {
//		infosInscription.setMatricule(mat);
	//	etudiantsMethodes.createUsers(infosInscription);
		
		System.out.println("sa marche=============================================================");

	}

	public void essaie(int matricule) {
		etudiantsMethodes.deleteUsers(matricule);

	}

}
