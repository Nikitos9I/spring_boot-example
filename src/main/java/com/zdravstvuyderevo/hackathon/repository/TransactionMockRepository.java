package com.zdravstvuyderevo.hackathon.repository;

import com.zdravstvuyderevo.hackathon.entity.TransactionMock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 2019-09-14 : 18:57
 *
 * @author Nikita Savinov
 */

@Repository
public interface TransactionMockRepository extends JpaRepository<TransactionMock, Long> {
}
