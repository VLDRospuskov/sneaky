package com.vldrospuskov.sneaky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    @ElementCollection(targetClass=Role.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name="client_roles")
    @Column(name="role")
    private List<Role> roles;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private Set<Message> messages;

}
