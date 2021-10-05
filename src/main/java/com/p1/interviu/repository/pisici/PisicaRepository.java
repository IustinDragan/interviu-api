package com.p1.interviu.repository.pisici;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisicaRepository extends JpaRepository<Pisica, Integer>
{

}
