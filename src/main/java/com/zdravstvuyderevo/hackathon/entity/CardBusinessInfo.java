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
    @JoinColumn(name = "cash_in_id", referencedColumnName = "id")
    private Cash cashIn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cash_out_id", referencedColumnName = "id")
    private Cash cashOut;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_id", referencedColumnName = "id")
    private Tax tax;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "debit_card_id")
    private DebitCard debitCard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recommendation_id")
    private Recommendation recommendation;

    @OneToMany(mappedBy = "cardBusinessInfo")
    private List<OptionalPoint> userFields;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cardBusinessInfo")
    private CardBusiness cardBusiness;

}
