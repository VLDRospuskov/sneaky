package com.vldrospuskov.sneaky.api;

import com.vldrospuskov.sneaky.dto.ClientDto;
import com.vldrospuskov.sneaky.entity.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/client")
public interface ClientApi {

    @PostMapping("/profile")
    Client createClient();

    @GetMapping("/profile/{id}")
    ClientDto getClientById(@PathVariable("id") Long id);

}
