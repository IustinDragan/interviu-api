package com.p1.interviu.controllers;


import com.p1.interviu.repository.adapost.AdapostAnimale;
import com.p1.interviu.service.AdapostAnimaleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/adapost") //sa verific aici
public class AdapostAnimaleController {

    AdapostAnimaleService adapostAnimaleService;

    public AdapostAnimaleController(AdapostAnimaleService adapostAnimaleService){
        this.adapostAnimaleService = adapostAnimaleService;
    }

    @GetMapping() //Read
    public ResponseEntity<List<AdapostAnimale>> getAdapostAnimale(){
        return ResponseEntity.ok(adapostAnimaleService.findAll());
    }

    @PostMapping() //Create
    public ResponseEntity<AdapostAnimale> createAdapost(@RequestBody AdapostAnimale adapostAnimale) {
        return ResponseEntity.ok(adapostAnimaleService.createAdapost(adapostAnimale));
    }

    @PutMapping("/{id}") // Update
    public ResponseEntity<AdapostAnimale> updateAdapost(@PathVariable("id") Integer id, @RequestBody AdapostAnimale adapostAnimale){
        return ResponseEntity.ok(adapostAnimaleService.updateAdapost(id, adapostAnimale));
    }

}
