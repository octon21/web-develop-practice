package learning.web.server.service;

import learning.web.server.model.Stock;
import learning.web.server.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockService {
    private final StockRepository stockRepository;
    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> listAll(){
        return stockRepository.listAll ();
    }

    public Stock register(Stock stock){
        return stockRepository.register (stock);
    }
}
