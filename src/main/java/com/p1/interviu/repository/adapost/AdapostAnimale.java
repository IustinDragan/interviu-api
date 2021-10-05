package com.p1.interviu.repository.adapost;

import com.p1.interviu.repository.pisici.Pisica;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AdapostAnimale
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String nume;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "adapost_id")
    private List<Pisica> pisici = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public AdapostAnimale setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNume() {
        return nume;
    }

    public AdapostAnimale setNume(String nume) {
        this.nume = nume;
        return this;
    }
}
