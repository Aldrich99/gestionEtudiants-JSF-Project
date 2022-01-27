package com.operations;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.gestionEtudiants.DAO.InscriptionsUsers;

@SessionScoped
@Named
public class OperationDatasBase implements Serializable{

	private static final long serialVersionUID = 829576944681202968L;
	
	public void DatasBase(InscriptionsUsers users) {
		
	}
	

}
