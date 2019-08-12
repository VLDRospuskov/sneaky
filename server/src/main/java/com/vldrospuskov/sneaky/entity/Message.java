package com.vldrospuskov.sneaky.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Client client;

    private String content;

}
