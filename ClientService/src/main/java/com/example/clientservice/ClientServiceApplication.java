package com.example.clientservice;

import com.example.clientservice.Entity.Client;
import com.example.clientservice.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication  implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client(null, "Ahmed","ahmed123@gmail.com"));
        clientRepository.save(new Client(null, "Mohammed","mohamed@gmail.com"));
        clientRepository.save(new Client(null, "Joury","joury@gmail.com"));
    }
}
