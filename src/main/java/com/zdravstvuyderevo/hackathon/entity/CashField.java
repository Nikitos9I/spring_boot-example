package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 2019-09-14 : 17:22
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "cash_field")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CashField {

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

    @NotNull
    @NotEmpty
    @Column
    private String description;

}
