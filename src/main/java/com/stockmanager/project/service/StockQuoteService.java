package com.stockmanager.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import com.stockmanager.project.model.StockQuote;
import com.stockmanager.project.repository.StockQuoteRepository;

public class StockQuoteService {
	private StockQuoteRepository stockQuotePersistence;	
	
	public StockQuote create(StockQuote stockQuote) {
		Optional<StockQuote> quote = stockQuotePersistence.findById(stockQuote.getId());
		if(!quote.isEmpty()) {
			throw new EntityExistsException("ID " + stockQuote.getId() + " already exists.");
		}
		return stockQuotePersistence.save(stockQuote);
	}
	
	public StockQuote findById(String id) {
		return stockQuotePersistence.findById(id).orElseThrow(() -> 
				new EntityNotFoundException("Stock Quote not found with id: " + id));
	}
	
	public List<StockQuote> findAll(){
		List<StockQuote> stockQuoteList = new ArrayList<>();
		Iterator<StockQuote> it = stockQuotePersistence.findAll().iterator();
		it.forEachRemaining(stockQuoteList::add);
		return stockQuoteList;
	}
	
	public void delete(StockQuote stockQuote) {
		stockQuotePersistence.delete(stockQuote);
	}
}
