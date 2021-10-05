package com.p1.interviu.repository.animale;


import javax.persistence.*;


//Curs 3, min 28
//Table per class genereaza un tabel pt fiecare entitate
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nume;
    private String poza;



    public String getNume() {
        return nume;
    }

    public Animal setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getPoza() {
        return poza;
    }

    public Animal setPoza(String poza) {
        this.poza = poza;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Animal setId(Integer id) {
        this.id = id;
        return this;
    }
}
