package com.vldrospuskov.sneaky.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vldrospuskov.sneaky.api.ClientApi;
import com.vldrospuskov.sneaky.dto.ClientDto;
import com.vldrospuskov.sneaky.entity.Client;
import com.vldrospuskov.sneaky.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController implements ClientApi {

    @Autowired
    ClientService clientService;

    @Autowired
    ObjectMapper mapper;

    public Client createClient() {
        return clientService.createClient();
    }

    public ClientDto getClientById(Long id) {
        Client client = clientService.getClientById(id);
        return mapper.convertValue(client, ClientDto.class);
    }

}
