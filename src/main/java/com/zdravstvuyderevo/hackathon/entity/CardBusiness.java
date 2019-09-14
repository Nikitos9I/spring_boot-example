package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 2019-09-14 : 13:27
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "cart_business")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardBusiness implements Comparable<CardBusiness> {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    @NotEmpty
    private String cardName;

    @Column
    @NotEmpty
    private String template;

    @OneToOne
    @JoinColumn(name = "card_business_info_id", referencedColumnName = "id")
    private CardBusinessInfo cardBusinessInfo;

    // This is dirty shit
    // This is necessary for transaction mock. In real transaction definition it have to be rewritten to compare by transaction sending id
    @Override
    public int compareTo(CardBusiness o) {
        return this.getCardName().equals(o.getCardName())? 0 : -1;
    }
}
