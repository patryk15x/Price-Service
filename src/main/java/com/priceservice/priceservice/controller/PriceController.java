package com.priceservice.priceservice.controller;

import com.priceservice.priceservice.repo.PriceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price-api")
@RequiredArgsConstructor
public class PriceController {

    private final PriceRepo repo;


}
