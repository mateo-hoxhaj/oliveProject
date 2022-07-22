package com.olive.project.controler;

import com.olive.project.service.FertilizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "api/olive/fertilizer")
public class FertilizerControler {


    @Autowired
    FertilizerService fertilizerService;

    @GetMapping(path="fertilizertype/{oliveId}")
    public String getFertilizerTypeForOlive(@PathVariable Long oliveId) {
        return fertilizerService.getFertilizerTypeForOlive(oliveId);
    }

    @GetMapping(path="fertilizertime/{oliveId}")
    public Date getFertilizerTimeForOlive(@PathVariable Long oliveId) {
        return fertilizerService.getFertilizerTimeForOlive(oliveId);
    }
}
