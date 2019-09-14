package com.zdravstvuyderevo.hackathon.repository;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 2019-09-14 : 13:47
 *
 * @author Nikita Savinov
 */

@Repository
public interface CardBusinessRepository extends JpaRepository<CardBusiness, Long> {

    @Query(value = "SELECT * FROM card_business WHERE title=?1", nativeQuery = true)
    CardBusiness findByCardTitle(String cardBusinessTitle);

}
