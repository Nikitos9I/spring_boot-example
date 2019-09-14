package com.zdravstvuyderevo.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2019-09-14 : 16:21
 *
 * @author Nikita Savinov
 */

@Controller
@RequestMapping("/cash")
public class CashController {

    @GetMapping("/get_cash")
    public void getCash() {

    }

}
