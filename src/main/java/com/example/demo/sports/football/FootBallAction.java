package com.example.demo.sports.football;

import com.example.demo.sports.SportServiceFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FootBallAction implements SportServiceFactory {
    @Override
    public int getSportId() {
        return 101;
    }

    @Override
    public void insertAction() {
        System.out.println("Inserting Action for Football");
    }

    @Override
    public List<String> listActions() {
        return Arrays.asList("football action one", "football action two");
    }
}
