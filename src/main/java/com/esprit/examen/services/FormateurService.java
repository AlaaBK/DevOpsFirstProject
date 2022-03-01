package com.esprit.examen.services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Formateur;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.repositories.FormateurRepository;

@Service
public class FormateurService implements IFormateurService{

	@Autowired
	FormateurRepository formateurRepository;
	@Override
	public Long addFormateur(Formateur formateur) {
		formateurRepository.save(formateur);
		return null;
		//return formateur.getId();
	}

	@Override
	public Long modifierFormateur(Formateur formateur) {
		formateurRepository.save(formateur);
		return null;
		//return formateur.getId();
	}

	@Override
	public void supprimerFormateur(Long formateurId) {
		formateurRepository.deleteById(formateurId);
		
	}

	@Override
	public Long nombreFormateursImpliquesDansUnCours(TypeCours typeCours) {
		return null;
	//	return formateurRepository.nombreFormateursImpliquesDansUnCours(typeCours);
		
	}



	@Override
	public List<Formateur> listFormateurs() {
		return null;
		//return formateurRepository.findAll();
	}

}
