package com.zdravstvuyderevo.hackathon.repository;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 2019-09-14 : 13:47
 *
 * @author Nikita Savinov
 */

@Repository
public interface CardBusinessRepository extends JpaRepository<CardBusiness, Integer> {

}
