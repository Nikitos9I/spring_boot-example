package com.zdravstvuyderevo.hackathon.service;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import com.zdravstvuyderevo.hackathon.repository.CardBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.zdravstvuyderevo.hackathon.constants.CardBusinessConstants.OTHER_CARD_TEMPLATE;
import static com.zdravstvuyderevo.hackathon.constants.CardBusinessConstants.OTHER_CARD_TITLE;

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

    List<CardBusiness> getAll() {
        return cardBusinessRepository.findAll();
    }

    void putCardBusinessForOtherTransactions(String title) {
        if (cardBusinessRepository.findByCardTitle(title) == null) {
            CardBusiness cardBusiness = new CardBusiness();
            cardBusiness.setCardName(OTHER_CARD_TITLE);
            cardBusiness.setTemplate(OTHER_CARD_TEMPLATE);
            //TODO: cardBusiness.setBusinessCardInfo
            cardBusinessRepository.save(cardBusiness);
        }
    }

}
