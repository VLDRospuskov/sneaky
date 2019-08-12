package com.vldrospuskov.sneaky.service;

import com.vldrospuskov.sneaky.entity.Client;

public interface ClientService {

    Client createClient();

    Client getClientById(Long id);

}
