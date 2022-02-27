package com.bezkoder.springjwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Raccourci;
import com.bezkoder.springjwt.repository.RaccourciRepository;

@Service
public class RaccourciService {
	@Autowired
	private RaccourciRepository raccourciRepository;

	public void addRaccourci(Raccourci raccourci) {
		raccourciRepository.save(raccourci);
	}

	public List<Raccourci> getRaccourciByIdProjet(Integer id) {
		return raccourciRepository.findRaccourciByIdProject(id);
	}

	public void deleteRaccourci(Integer id) {
		raccourciRepository.deleteById(id);
	}

	public void updateRaccourci(Integer id, Raccourci raccourci) {
		raccourciRepository.save(raccourci);
	}
}
