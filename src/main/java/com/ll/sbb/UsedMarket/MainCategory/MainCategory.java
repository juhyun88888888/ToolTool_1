package com.ll.sbb.UsedMarket.MainCategory;

import com.ll.sbb.Market.Market;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MainCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String subject;

    @Column(columnDefinition = "text")
    private String content;

    @ManyToOne
    private Market product;






}
