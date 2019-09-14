package com.zdravstvuyderevo.hackathon.service;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import com.zdravstvuyderevo.hackathon.repository.CardBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2019-09-14 : 13:48
 *
 * @author Nikita Savinov
 */

@Service
public class CardBusinessService {

    private final CardBusinessRepository cardBusinessRepository;

    @Autowired
    public CardBusinessService(CardBusinessRepository cardBusinessRepository) {
        this.cardBusinessRepository = cardBusinessRepository;
    }

    public void saveCardBusiness(CardBusiness cardBusiness) {
        cardBusinessRepository.save(cardBusiness);
    }
}
