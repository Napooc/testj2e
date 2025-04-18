package com.example.test.repositories;
import com.example.test.Projection.DonateurResume;
import com.example.test.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.time.LocalDate;
import java.util.List;


public interface DonateurRepository extends JpaRepository<Donateur, Long> {
    List<DonateurResume> findByDateDebutBeforeAndDateFinAfter(LocalDate startDate, LocalDate endDate);


}
