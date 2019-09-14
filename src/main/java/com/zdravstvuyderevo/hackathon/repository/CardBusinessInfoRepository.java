package com.zdravstvuyderevo.hackathon.repository;

import com.zdravstvuyderevo.hackathon.entity.OptionalPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 2019-09-14 : 16:30
 *
 * @author Nikita Savinov
 */

@Repository
public interface CardBusinessInfoRepository extends JpaRepository<OptionalPoint, Long> {
}
