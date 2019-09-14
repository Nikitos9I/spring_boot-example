package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 2019-09-14 : 16:42
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "cash")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cash {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column
    private long sum;

    @NotNull
    @NotEmpty
    @Column
    private String title;

    @OneToOne(mappedBy = "cashIn")
    private CardBusinessInfo cashIn;

    @OneToOne(mappedBy = "cashOut")
    private CardBusinessInfo cashOut;

    @OneToMany(mappedBy = "cashInfoFieldList")
    private List<InfoField> infoFieldList;

}
