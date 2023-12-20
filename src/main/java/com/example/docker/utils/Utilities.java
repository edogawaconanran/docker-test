package com.example.docker.utils;

import org.modelmapper.ModelMapper;

public class Utilities {
    private static ModelMapper modelMapper = new ModelMapper();

    public static ModelMapper mapper(){
        return modelMapper;
    }
}
