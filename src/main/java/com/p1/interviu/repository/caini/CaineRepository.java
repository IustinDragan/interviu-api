package com.p1.interviu.repository.caini;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CaineRepository extends JpaRepository<Caine, Integer>
{

}
