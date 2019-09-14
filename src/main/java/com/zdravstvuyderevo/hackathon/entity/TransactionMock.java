package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 2019-09-14 : 18:17
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "transaction_mock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionMock {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty
    @Column
    private String title;

    @NotNull
    @Column
    private Long sum;

    @NotNull
    @Column
    private TransactionType type;

    public enum TransactionType {
        GET,
        SEND
    }

}
