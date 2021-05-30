package com.stockmanager.project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stockmanager.project.model.StockQuote;
import com.stockmanager.project.service.StockQuoteService;

@RestController
@RequestMapping({"/stockquote"})
public class StockQuoteController {
	StockQuoteService stockQuoteService;
	
	public StockQuoteController() {
		stockQuoteService = new StockQuoteService();
	}
	
	@GetMapping
	public List<StockQuote> findAll() {
		return stockQuoteService.findAll();
	}
	
	@GetMapping(path = {"/{id}"})
	public StockQuote findById(@PathVariable String id) {
		return stockQuoteService.findById(id);
	}
	
	@PostMapping
	public StockQuote create(@RequestBody StockQuote stockQuote) {
		return stockQuoteService.create(stockQuote);
	}
}
