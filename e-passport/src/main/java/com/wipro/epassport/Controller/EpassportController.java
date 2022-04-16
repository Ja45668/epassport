package com.wipro.epassport.Controller;

import com.wipro.epassport.Model.Epassport;
import com.wipro.epassport.Service.EpassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpassportController {
    @Autowired
    private EpassportService epassportService;
    @PostMapping("/Epassport_registration")
    public String epassportRegistration(@RequestBody Epassport epassport)
    {
        epassportService.epassportRegistration(epassport);
        return "registered successfully";
    }
}
