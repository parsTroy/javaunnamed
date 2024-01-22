package com.parstroy.dividnd.model;

import com.parstroy.dividnd.enumeration.Sentiment;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "ticker cannot be empty or null")
    private String ticker;
    @Column(unique = true)
    private String company;
    private Long price;
    private String description;
    private String imageUrl;
    private Double percentageChange;
    private Sentiment sentiment;
}
