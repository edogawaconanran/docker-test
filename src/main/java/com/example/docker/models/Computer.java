package com.example.docker.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "computers")
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long computerId;

    @Column(name = "computer_name")
    String computerName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cpu_id")
    CPU cpu;

    public Computer(String computerName, CPU cpu) {
        this.computerName = computerName;
        this.cpu = cpu;
    }

    public Computer() {
    }
}
