package com.zdravstvuyderevo.hackathon.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 2019-09-14 : 15:12
 *
 * @author Nikita Savinov
 */

@Data
@Entity
@Table(name = "info_field")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfoField {

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
    private String description;

    @Column
    private Integer sum;

    @Column
    @CreationTimestamp
    private Date creationTime;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "card_business_info_impl_id")
    private OptionalPoint cardBusinessInfo;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "cash_info_list_id")
    private Cash cashInfoFieldList;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "tax_info_list_id")
    private Tax taxInfoFieldList;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "debit_card_info_list_id")
    private DebitCard debitCardInfoFieldList;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "recommendation_info_list_id")
    private Recommendation recommendationInfoFieldList;

}
