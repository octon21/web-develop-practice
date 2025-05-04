package learning.web.server.controller;

import learning.web.server.model.Stock;
import learning.web.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public String list(Model model){
        List<Stock> stocks = stockService.listAll ();
        model.addAttribute ("stocks", stocks);
        return "stocks/list";
    }

    @GetMapping("/new")
    public String inputForm(Model model){
        model.addAttribute ("input", new StockInputDto ());
        return "stocks/input";
    }


}

