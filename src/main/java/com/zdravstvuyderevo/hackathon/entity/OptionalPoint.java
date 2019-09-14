package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 2019-09-14 : 15:02
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "card_business_info_impl")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OptionalPoint {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    @NotEmpty
    private String title;

    @OneToMany(mappedBy = "cardBusinessInfo")
    private List<InfoField> infoFieldList;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "card_business_info_id")
    private CardBusinessInfo cardBusinessInfo;

}
