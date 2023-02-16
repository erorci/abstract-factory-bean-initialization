package com.example.demo.sports.cricket;

import com.example.demo.sports.SportServiceFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CricketAction implements SportServiceFactory {

    @Override
    public int getSportId() {
        return 201;
    }

    public void insertAction() {
        System.out.println("Inserting Action for Cricket");
    }

    @Override
    public List<String> listActions() {
        return Arrays.asList("cricket action one", "cricket action two");
    }
}
