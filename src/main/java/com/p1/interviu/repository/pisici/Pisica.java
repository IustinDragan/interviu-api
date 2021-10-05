package com.p1.interviu.repository.pisici;

import com.p1.interviu.repository.adapost.AdapostAnimale;
import com.p1.interviu.repository.animale.Animal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pisica extends Animal
{
//    @ManyToOne
//    @JoinColumn(name = "adapost_id")
//    private AdapostAnimale adapost;

}
