package com.example.docker.services;

import com.example.docker.dtos.ComputerDTO;
import com.example.docker.models.CPU;
import com.example.docker.models.Computer;
import com.example.docker.repositories.ComputerRepository;
import com.example.docker.utils.Utilities;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    ModelMapper modelMapper = Utilities.mapper();

    public List<ComputerDTO> getAllComputers() {
        List<Computer> computers = computerRepository.findAll();
        List<ComputerDTO> result = new ArrayList<>();
        for(Computer computer : computers)
            result.add(modelMapper.map(computer, ComputerDTO.class));
        return result;
    }

    public void AddComputer(String computerName, CPU cpu){
        Computer computer = new Computer(computerName, cpu);
        computerRepository.save(computer);
    }
}
