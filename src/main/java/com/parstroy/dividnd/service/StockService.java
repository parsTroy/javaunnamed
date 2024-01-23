package com.parstroy.dividnd.service;

import com.parstroy.dividnd.model.Stock;

import java.util.Collection;

public interface StockService {
    Stock create(Stock stock);
    Collection<Stock> list(int limit);
    Stock get(Long id);
    Stock update(Stock stock);
    Boolean delete(Long id);
}
