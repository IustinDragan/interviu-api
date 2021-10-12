package com.p1.interviu.service;

import com.p1.interviu.repository.adapost.AdapostAnimale;
import com.p1.interviu.repository.adapost.AdapostAnimaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//Flow aplicatie: Controller (preia request-ul http pe care il facem noi si face call catre ->
//Service (acesta, in interiorul lui, are o dependinta catre Repository(in functie de ce are nvoie) pe care o injecteaza



@Service
public class AdapostAnimaleService
{
    private final AdapostAnimaleRepository adapostAnimaleRepository;

    public AdapostAnimaleService(AdapostAnimaleRepository adapostAnimaleRepository)
    {
     this.adapostAnimaleRepository = adapostAnimaleRepository;
    }



    public List<AdapostAnimale> findAll() {
        return adapostAnimaleRepository.findAll();
    }
    public AdapostAnimale createAdapost (AdapostAnimale adapostAnimale){
        return adapostAnimaleRepository.save(adapostAnimale);
    }
    public AdapostAnimale updateAdapost(Integer id, AdapostAnimale adapostAnimale) {
        return adapostAnimaleRepository.save(adapostAnimale);
    }
    //tema: facem pt dog repository, si un service si scriem un script care sa interogheze

    //Am ramas la cursul 4, min 47. Urmeaza sa facem delete pe AnimalShelter

}
