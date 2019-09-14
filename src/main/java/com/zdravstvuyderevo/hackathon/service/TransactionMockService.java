package com.zdravstvuyderevo.hackathon.service;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import com.zdravstvuyderevo.hackathon.entity.TransactionMock;
import com.zdravstvuyderevo.hackathon.repository.TransactionMockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.zdravstvuyderevo.hackathon.constants.CardBusinessConstants.OTHER_CARD_TITLE;

/**
 * 2019-09-14 : 18:27
 *
 * @author Nikita Savinov
 */

@Service
public class TransactionMockService {

    private final CardBusinessService cardBusinessService;
    private final TransactionMockRepository transactionMockRepository;

    @Autowired
    public TransactionMockService(CardBusinessService cardBusinessService, TransactionMockRepository transactionMockRepository) {
        this.cardBusinessService = cardBusinessService;
        this.transactionMockRepository = transactionMockRepository;
    }

    public void validateTransaction(TransactionMock transactionMock) {
        List<CardBusiness> cardBusinessList = cardBusinessService.getAll();
        List<CardBusiness> cardBusinessFilteredList = cardBusinessList.stream()
                .filter(e -> e.getCardName().matches(transactionMock.getTitle()))
                .collect(Collectors.toList());

        if (cardBusinessFilteredList.size() > 0) {
            // modify cash value in needed card
        } else {
            cardBusinessService.putCardBusinessForOtherTransactions(OTHER_CARD_TITLE);
        }
    }

    public void save(TransactionMock transactionMock) {
        transactionMockRepository.save(transactionMock);
    }
}
