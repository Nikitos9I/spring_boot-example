package com.zdravstvuyderevo.hackathon.controller;

import com.zdravstvuyderevo.hackathon.entity.TransactionMock;
import com.zdravstvuyderevo.hackathon.service.TransactionMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.zdravstvuyderevo.hackathon.entity.TransactionMock.TransactionType.GET;
import static com.zdravstvuyderevo.hackathon.entity.TransactionMock.TransactionType.SEND;

/**
 * 2019-09-14 : 18:19
 *
 * @author Nikita Savinov
 */

@Controller
public class TransactionMockController {

    private final TransactionMockService transactionMockService;

    @Autowired
    public TransactionMockController(TransactionMockService transactionMockService) {
        this.transactionMockService = transactionMockService;
    }

    @GetMapping("/get_transaction")
    public void getTransaction(@RequestParam(name = "title") String title,
                               @RequestParam(name = "sum") Long sum) {
        TransactionMock transactionMock = new TransactionMock();
        transactionMock.setTitle(title);
        transactionMock.setSum(sum);
        transactionMock.setType(GET);
        transactionMockService.save(transactionMock);
        transactionMockService.validateTransaction(transactionMock);
    }

    @PostMapping("/send_transaction")
    public void sendTransaction(@RequestParam(name = "title") String title,
                                @RequestParam(name = "sum") Long sum) {
        TransactionMock transactionMock = new TransactionMock();
        transactionMock.setTitle(title);
        transactionMock.setSum(sum);
        transactionMock.setType(SEND);
        transactionMockService.save(transactionMock);
        transactionMockService.validateTransaction(transactionMock);
    }

}
