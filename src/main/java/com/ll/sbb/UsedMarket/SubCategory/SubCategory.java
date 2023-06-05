package com.ll.sbb.UsedMarket.SubCategory;

import com.ll.sbb.Market.Market;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String subject;

    @Column(columnDefinition = "text")
    private String content;

    @ManyToOne
    private Market product;
}
