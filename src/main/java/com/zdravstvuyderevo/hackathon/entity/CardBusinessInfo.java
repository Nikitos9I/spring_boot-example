package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 2019-09-14 : 14:24
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "card_business_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardBusinessInfo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_business_info_impl_cashin_id")
    private CardBusinessInfoImpl cashIn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_business_info_impl_cashout_id")
    private CardBusinessInfoImpl cashOut;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_business_info_impl_tax_id")
    private CardBusinessInfoImpl tax;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_business_info_impl_debitcard_id")
    private CardBusinessInfoImpl debitCard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_business_info_impl_recommendation_id")
    private CardBusinessInfoImpl recommendation;

    @OneToMany(mappedBy = "cardBusinessInfoImpl")
    private List<CardBusinessInfoImpl> userFields;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cardBusinessInfo")
    private CardBusiness cardBusiness;

}
