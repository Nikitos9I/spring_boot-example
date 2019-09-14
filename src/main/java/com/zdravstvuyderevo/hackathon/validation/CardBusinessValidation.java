package com.zdravstvuyderevo.hackathon.validation;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 2019-09-14 : 14:15
 *
 * @author Nikita Savinov
 */

public class CardBusinessValidation {

    @Size(min = 3, max = 16)
    @Pattern(regexp = "[A-zА-я()_]+", message = "expected Latin or Russian letters, brackets or underline")
    private String cardTitle;

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

}
