package com.olive.project.controler;

import com.olive.project.service.WorkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/olive/working")
public class WorkingControler {


    private final WorkingService workingService;

    @Autowired
    public WorkingControler(WorkingService workingService) {
        this.workingService = workingService;
    }

    @PutMapping(path = "/workingTime/{oliveId}")
    public int changeOliveWorkingTime(@PathVariable Long oliveId,
                                      @RequestParam Date workingTime) {
        return workingService.changeOliveWorkingTime(oliveId, workingTime);
    }

    @PutMapping(path = "/workingType/{oliveId}")
    public int changeOliveWorkingType(@PathVariable Long oliveId,
                                      @RequestParam String workingType) {
        return workingService.changeOliveWorkingType(oliveId, workingType);
    }

}
