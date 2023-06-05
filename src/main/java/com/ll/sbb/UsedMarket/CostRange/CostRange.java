package com.ll.sbb.UsedMarket.CostRange;

import jakarta.persistence.*;

@Entity
public class CostRange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer costRange;

}
