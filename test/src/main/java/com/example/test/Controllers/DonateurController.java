package com.example.test.Controllers;

import com.example.test.Projection.DonateurResume;
import com.example.test.entities.Donateur;
import com.example.test.services.ServiceDonateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/donateurs")
public class DonateurController {

    @Autowired
    private ServiceDonateur serviceDonateur;

    // Récupérer les donateurs actifs
    @GetMapping("/actifs")
    public List<DonateurResume> getDonateursActifs() {
        return serviceDonateur.getDonateursActifs();
    }

    // Recherche par email
    @GetMapping("/recherche")
    public Optional<Donateur> getDonateurByEmail(@RequestParam String email) {
        return Optional.ofNullable(serviceDonateur.getDonateurByEmail(email));
    }


}
