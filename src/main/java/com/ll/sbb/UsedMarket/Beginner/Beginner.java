package com.ll.sbb.UsedMarket.Beginner;

import jakarta.persistence.*;

@Entity
public class Beginner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String subject;
}
