package com.p1.interviu.repository.adapost;

import com.p1.interviu.repository.caini.Caine;
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

    private String locatie;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "adapost_id")
    private List<Pisica> pisici = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "adapost_id")
    private List<Caine> caini = new ArrayList<>();

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

    public List<Pisica> getPisici() {
        return pisici;
    }

    public AdapostAnimale setPisici(List<Pisica> pisici) {
        this.pisici = pisici;
        return this;
    }

    public List<Caine> getCaini() {
        return caini;
    }

    public AdapostAnimale setCaini(List<Caine> caini) {
        this.caini = caini;
        return this;
    }

    public String getLocatie() {
        return locatie;
    }

    public AdapostAnimale setLocatie(String locatie) {
        this.locatie = locatie;
        return this;
    }
}
