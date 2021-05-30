package com.stockmanager.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.stockmanager.project.model.StockQuote;

public interface StockQuoteRepository extends CrudRepository<StockQuote, String>{
}
