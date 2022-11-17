package com.example.tpmagasin.Service;

import com.example.tpmagasin.entity.Client;

public interface IClientService {
    public List<Client> retrieveAllClients();
    public Client addClient (Client c);
    public Client updateClient (Client c);
    public Client retrieveClient(int idClient);

    void removeClient(int idClient);
}
