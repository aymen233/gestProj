package com.bezkoder.springjwt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Projet;
import com.bezkoder.springjwt.repository.ProjetRepository;

@Service
public class ProjetService {
	@Autowired
	private ProjetRepository projetRepository;

	public void addProjet(Projet projet) {
		projetRepository.save(projet);
	}

	public List<Projet> getAllProjetUser(Long id) {
		return (List<Projet>) projetRepository.findByUserId(id);
	}

	public Optional<Projet> getProjet(Integer id) {
		return projetRepository.findById(id);
	}

	public void deleteProjet(Integer id) {
		projetRepository.deleteById(id);
	}

	public void updatePorojet(Integer id, Projet projet) {
		projetRepository.save(projet);
	}

}
