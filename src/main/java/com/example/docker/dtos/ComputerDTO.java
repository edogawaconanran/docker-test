package com.example.docker.dtos;

import lombok.Data;

@Data
public class ComputerDTO {
    String computerName;
    CpuDTO cpu;
}
