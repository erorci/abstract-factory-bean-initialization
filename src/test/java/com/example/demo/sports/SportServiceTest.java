package com.example.demo.sports;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SportServiceTest {

    @InjectMocks
    private SportService sportService;
    @Mock
    private SportServiceFactory sportServiceFactory;
    @Mock
    private SportServiceFactoryImpl sportServiceFactoryImpl;

    @Test
    void whenSportIdIsFootballShouldReturnFootballAction() {
        when(sportServiceFactory.listActions()).thenReturn(Arrays.asList("football action one", "football action two"));
        when(sportServiceFactoryImpl.get(101)).thenReturn(sportServiceFactory);

        List<String> actions = sportService.listAllActions(101);
        assertEquals(2, actions.size());
        verify(sportServiceFactory, times(1)).listActions();
    }
}
