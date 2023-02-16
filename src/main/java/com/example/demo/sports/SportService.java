package com.example.demo.sports;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportService {
    private final SportServiceFactoryImpl sportServiceFactoryImpl;

    public SportService(SportServiceFactoryImpl sportServiceFactoryImpl) {
        this.sportServiceFactoryImpl = sportServiceFactoryImpl;
    }

    public List<String> listAllActions(int sportId) {
        SportServiceFactory sportServiceFactory = sportServiceFactoryImpl.get(sportId);
        if (sportServiceFactory != null) {
            return sportServiceFactory.listActions();
        }
        return sportServiceFactoryImpl.get(0).listActions();
    }

    public void insertActions(int sportId) {
        SportServiceFactory sportServiceFactory = sportServiceFactoryImpl.get(sportId);
        if (sportServiceFactory != null) {
            sportServiceFactory.insertAction();
        } else {
            sportServiceFactoryImpl.get(0).insertAction();
        }
    }
}
