package com.example.demo.sports;

import com.example.demo.sports.all.DefaultSportsAction;
import com.example.demo.sports.cricket.CricketAction;
import com.example.demo.sports.football.FootBallAction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SportServiceFactoryImplTest {

    @Autowired
    private SportServiceFactoryImpl sportServiceFactory;

    @Test
    void testGetSportServiceFactory() {
        SportServiceFactory defaultSportsService = sportServiceFactory.get(0);
        SportServiceFactory cricketService = sportServiceFactory.get(201);
        SportServiceFactory football = sportServiceFactory.get(101);

        assertNotNull(defaultSportsService);
        assertEquals(DefaultSportsAction.class, defaultSportsService.getClass());

        assertNotNull(cricketService);
        assertEquals(CricketAction.class, cricketService.getClass());

        assertNotNull(football);
        assertEquals(FootBallAction.class, football.getClass());
    }
}
