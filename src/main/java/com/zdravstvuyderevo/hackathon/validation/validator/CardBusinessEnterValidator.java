package com.zdravstvuyderevo.hackathon.validation.validator;

import com.zdravstvuyderevo.hackathon.entity.CardBusiness;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 2019-09-14 : 14:21
 *
 * @author Nikita Savinov
 */

public class CardBusinessEnterValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return CardBusiness.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
