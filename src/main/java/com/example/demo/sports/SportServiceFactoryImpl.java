package com.example.demo.sports;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SportServiceFactoryImpl {
    private final Map<Integer, SportServiceFactory> sports;

    public SportServiceFactoryImpl(List<SportServiceFactory> sportsRegisteredServices) {
        this.sports = sportsRegisteredServices.stream().collect(
                Collectors.toMap(SportServiceFactory::getSportId, Function.identity())
        );
    }
    public SportServiceFactory get(Integer sportId) {
        return sports.get(sportId);
    }
}
