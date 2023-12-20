package com.example.docker.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cpus")
public class CPU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long cpuId;

    @Column(name = "cpu_name")
    String cpuName;

    @OneToMany(mappedBy = "cpu")
    List<Computer> computers;
}
