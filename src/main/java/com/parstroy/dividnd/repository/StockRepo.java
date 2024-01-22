package com.parstroy.dividnd.repository;

import com.parstroy.dividnd.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Long> {
    Stock findByTicker(String ticker);
    Stock findByCompany(String company);
}
