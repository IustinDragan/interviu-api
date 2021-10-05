package com.p1.interviu.service;

import com.p1.interviu.repository.adapost.AdapostAnimaleRepository;
import org.springframework.stereotype.Service;
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

    //tema: facem pt dog repository, si un service si scriem un script care sa interogheze

}
