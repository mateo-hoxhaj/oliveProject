package com.olive.project.controler;

import com.olive.project.service.OliveFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/olive/form")
public class OliveFormControler {


    @Autowired
    OliveFormService oliveFormService;

    @DeleteMapping(path="form/{oliveId}")
    public int deleteForm(@PathVariable Long oliveId) {
        return oliveFormService.deleteForm(oliveId);
    }

}
