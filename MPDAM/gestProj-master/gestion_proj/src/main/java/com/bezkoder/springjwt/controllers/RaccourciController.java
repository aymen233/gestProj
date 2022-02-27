package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.Projet;
import com.bezkoder.springjwt.models.Raccourci;
import com.bezkoder.springjwt.models.UserStory;
import com.bezkoder.springjwt.services.RaccourciService;
import com.bezkoder.springjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class RaccourciController {
//Controller raccourci
    @Autowired
    private RaccourciService raccourciService;

    @PostMapping("/addRaccourci")
    public void addproject(@RequestBody Raccourci raccourci) {
        raccourciService.addRaccourci(raccourci);
    }


    @GetMapping("/ListRaccourci/{idProjet}")
    public List<Raccourci> GetRaccourci(@PathVariable Integer idProjet) {
        return raccourciService.getRaccourciByIdProjet(idProjet);
    }
    @DeleteMapping("/Raccourci/{id}")
    public void deleteRaccourci(@PathVariable Integer id) {
        raccourciService.deleteRaccourci(id);
    }
    @PutMapping("/updateRaccourci/{id}")
    public void updateRaccourci(@PathVariable Integer id, @RequestBody Raccourci raccourci) {
        raccourciService.updateRaccourci(id,raccourci);
    }

}
