package com.zdravstvuyderevo.hackathon.service;

import com.zdravstvuyderevo.hackathon.entity.Cash;
import com.zdravstvuyderevo.hackathon.repository.CardBusinessInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

/**
 * 2019-09-14 : 16:31
 *
 * @author Nikita Savinov
 */

@Service
public class CardBusinessInfoService {

    private final CardBusinessInfoRepository cardBusinessInfoRepository;
    private final Logger log = LoggerFactory.getLogger(CardBusinessInfoService.class);

    @Autowired
    public CardBusinessInfoService(CardBusinessInfoRepository cardBusinessInfoRepository) {
        this.cardBusinessInfoRepository = cardBusinessInfoRepository;
    }

    public Cash getCashIn(Long businessInfoId) {
        Cash cash = null;
        try {
            cash = businessInfoId == null ? null : cardBusinessInfoRepository.findById(businessInfoId)
                    .orElseThrow().getCardBusinessInfo().getCashIn();
        } catch (NoSuchElementException ex) {
            log.error("No needed business info row in db: " + ex.getMessage());
        }

        return cash;
    }

    public Cash getCashOut(Long businessInfoId) {
        Cash cash = null;
        try {
            cash = businessInfoId == null ? null : cardBusinessInfoRepository.findById(businessInfoId)
                    .orElseThrow().getCardBusinessInfo().getCashOut();
        } catch (NoSuchElementException ex) {
            log.error("No needed business info row in db: " + ex.getMessage());
        }

        return cash;
    }
}
