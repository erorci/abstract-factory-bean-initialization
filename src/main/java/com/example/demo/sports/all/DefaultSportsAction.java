package com.example.demo.sports.all;

import com.example.demo.sports.SportServiceFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DefaultSportsAction implements SportServiceFactory {

    @Override
    public int getSportId() {
        return 0;
    }

    public void insertAction() {
        System.out.println("Inserting Action for Default Sports");
    }

    @Override
    public List<String> listActions() {
        return Arrays.asList("default sport action one", "default sport action two");
    }
}
