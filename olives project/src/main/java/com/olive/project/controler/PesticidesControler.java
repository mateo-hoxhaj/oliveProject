package com.olive.project.controler;

import com.olive.project.service.FertilizerService;
import com.olive.project.service.PesticidesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "api/olive/pesticides")
public class PesticidesControler {


    @Autowired
    PesticidesService pesticidesService;

    @GetMapping(path="pesticides/{oliveId}")
    public String insertPesticide(@PathVariable Long oliveId) {
        return pesticidesService.insertPesticide(oliveId);
    }

}
