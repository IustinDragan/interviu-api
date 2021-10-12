package com.p1.interviu.repository.animale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    Optional<Animal> findByNumeAndPoza(String nume, String Poza);

    @Query("select a.id, a.nume, a.poza from Animal a where a.nume = :nume")
    Optional<Animal> getByNume(@Param("nume") String nume);

}
