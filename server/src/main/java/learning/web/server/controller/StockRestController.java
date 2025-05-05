package learning.web.server.controller;

import learning.web.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockRestController {
    private final StockService stockService;
    @Autowired
    public StockRestController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public List<StockResponse> listAll(){
        return stockService.listAll ().stream ()
                .map (StockResponse::fromDomain)
                .toList ();
    }

    @PostMapping
    public void create(@RequestBody @Validated StockInputDto input){
        stockService.register (input.toStock ());
    }
}
