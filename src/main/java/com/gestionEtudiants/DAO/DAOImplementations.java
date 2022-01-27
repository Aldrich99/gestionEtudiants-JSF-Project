package com.gestionEtudiants.DAO;

import java.util.List;

 interface DAOImplementations {
	
	void createUsers(InscriptionsUsers users) ;
	List<InscriptionsUsers>  searcheUsers(int matricule);
	void updateUsers(int matricule);
	void deleteUsers(int matricule);
	List<InscriptionsUsers>  allUsers();
}
