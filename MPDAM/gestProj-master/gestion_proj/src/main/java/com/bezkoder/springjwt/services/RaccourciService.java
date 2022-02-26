package com.bezkoder.springjwt.services;

import com.bezkoder.springjwt.models.Projet;
import com.bezkoder.springjwt.models.Raccourci;
import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.repository.ProjetRepository;
import com.bezkoder.springjwt.repository.RaccourciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaccourciService {

    @Autowired
    private RaccourciRepository raccourciRepository;

    public void addRaccourci(Raccourci raccourci) {
        raccourciRepository.save(raccourci);
    }

    public List<Raccourci> getRaccourciByIdProjet(Integer id) {
        return  raccourciRepository.findRaccourciByIdProject(id);
    }
    public void deleteRaccourci(Integer id) {
        raccourciRepository.deleteById(id);
    }
    public void updateRaccourci(Integer id, Raccourci raccourci) {
        raccourciRepository.save(raccourci);
    }


}
