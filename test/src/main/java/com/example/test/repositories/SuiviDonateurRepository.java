package com.example.test.repositories;


import com.example.test.entities.Donateur;
import com.example.test.entities.SuiviDonateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuiviDonateurRepository extends JpaRepository<SuiviDonateur, Long> {
    List<SuiviDonateur> findByCampagne(Donateur campagne);
}
