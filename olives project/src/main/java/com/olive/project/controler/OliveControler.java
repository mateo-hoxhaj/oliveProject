package com.olive.project.controler;

import com.olive.project.model.Olive;
import com.olive.project.model.Working;
import com.olive.project.service.OliveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/olive")
public class OliveControler {

    private final OliveService oliveService;

    @Autowired
    public OliveControler(OliveService oliveService){
        this.oliveService = oliveService;
    }


    //This service returns the list of all olives
    @GetMapping
    public List<Olive> getAllOlives() {
        return oliveService.getAllOlives();
    }

    //This service insert a new olive in db
    @PostMapping
    public void registerNewOlive(@RequestBody Olive olive){
        oliveService.addNewOlive(olive);

        }

    @PutMapping(path="{oliveId}")
    public void changeOlivePricePerKg(
            @PathVariable Long oliveId,
            @RequestParam Double pricePerKg){
        oliveService.changeOlivePricePerkg(oliveId, pricePerKg);
    }


    @GetMapping(path="workingTime/{oliveId}")
    public Working getOliveWorkingTime(@PathVariable Long oliveId) {
        return oliveService.getOliveWorkingTime(oliveId);
    }

}
