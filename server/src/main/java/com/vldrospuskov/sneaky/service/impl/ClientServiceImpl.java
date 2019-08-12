package com.vldrospuskov.sneaky.service.impl;

import com.vldrospuskov.sneaky.dto.ClientDto;
import com.vldrospuskov.sneaky.entity.Client;
import com.vldrospuskov.sneaky.entity.Role;
import com.vldrospuskov.sneaky.repository.ClientRepository;
import com.vldrospuskov.sneaky.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient() {
        Client client = new Client();
        List<Role> roleList = new ArrayList<>();
        roleList.add(Role.ADMIN);
        client.setRoles(roleList);
        client.setFirstName("Vlad");
        clientRepository.save(client);
        return client;
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).get();
    }
}
