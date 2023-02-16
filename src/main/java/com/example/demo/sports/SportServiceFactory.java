package com.example.demo.sports;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

public interface SportServiceFactory {

    int getSportId();

    void insertAction();

    List<String> listActions();
}
