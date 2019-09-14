package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 2019-09-14 : 16:48
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "debit_card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DebitCard {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty
    @Column
    private String title;

    @OneToMany(mappedBy = "debitCardInfoFieldList")
    private List<InfoField> infoFieldList;

    @OneToOne(mappedBy = "debitCard")
    private CardBusinessInfo debitCard;

}
