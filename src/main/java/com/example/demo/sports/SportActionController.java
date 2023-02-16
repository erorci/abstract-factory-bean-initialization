package com.example.demo.sports;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class SportActionController {
    private final SportService sportService;

    public SportActionController(SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping(value = "/sports/{sportId}/actions")
    ResponseEntity<List<String>> getActions(@PathVariable int sportId) {
        List<String> objects = sportService.listAllActions(sportId);
        return ResponseEntity.ok(objects);
    }

    @PostMapping(value = "/sports/{sportId}/actions")
    ResponseEntity<String> postActions(@PathVariable int sportId) throws URISyntaxException {
        sportService.insertActions(sportId);
        return ResponseEntity.created(URI.create("http://localhost:8082/sports/" + sportId + "/actions")).build();
    }
}
