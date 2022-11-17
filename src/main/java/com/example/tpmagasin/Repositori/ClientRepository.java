package com.example.tpmagasin.Repositori;
import  com.example.tpmagasin.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client,Integer> {
}
