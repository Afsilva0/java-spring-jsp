package com.personalsoft.afsilva.personalsoft.controller;

import com.personalsoft.afsilva.config.ServicePersonalSoftConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/personalSoft")
public class ServicePersonalSoftController {

    private ServicePersonalSoftConfiguration servicePersonalSoftConfiguration;

    public ServicePersonalSoftController(ServicePersonalSoftConfiguration servicePersonalSoftConfiguration) {
        this.servicePersonalSoftConfiguration = servicePersonalSoftConfiguration;
    }

    @GetMapping("/getInfo")
    public ResponseEntity<ServicePersonalSoftConfiguration> getInfo(){
        return ResponseEntity.ok().body(servicePersonalSoftConfiguration);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<String>> getList(){
        return ResponseEntity.ok().body(new ArrayList<>(Arrays.asList("Hola","Mundo")));
    }
}
