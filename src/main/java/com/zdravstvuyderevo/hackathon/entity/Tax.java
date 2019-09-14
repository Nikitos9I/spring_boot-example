package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 2019-09-14 : 16:45
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "tax")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tax {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty
    @Column
    private String title;

    @OneToMany(mappedBy = "taxInfoFieldList")
    private List<InfoField> infoFieldList;

    @OneToOne(mappedBy = "tax")
    private CardBusinessInfo tax;

}
