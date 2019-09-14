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
public class CardBusiness {

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

}
