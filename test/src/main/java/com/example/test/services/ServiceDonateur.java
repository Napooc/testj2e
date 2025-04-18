package com.example.test.services;

import com.example.test.Projection.DonateurResume;
import com.example.test.entities.Donateur;
import com.example.test.repositories.DonateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class ServiceDonateur {

    @Autowired
    private DonateurRepository donateurRepository;

    public List<DonateurResume> getDonateursActifs() {
        LocalDate today = LocalDate.now();
        return donateurRepository.findByDateDebutBeforeAndDateFinAfter(today, today);
    }
    public Donateur getDonateurByEmail(String email) {
        return donateurRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Aucun donateur trouvé avec l'email : " + email));
    }
}
