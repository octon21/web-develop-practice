package learning.web.server.repository;

import learning.web.server.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StockRepository {
    private final DataClassRowMapper<Stock> mapper = new DataClassRowMapper<>(Stock.class);
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StockRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public List<Stock> listAll(){
        return this.jdbcTemplate.query ("SELECT * FROM stock", mapper);
    }

    public Stock register(Stock stock){
        return this.jdbcTemplate.query (
                "INSERT INTO stock(ticker, name, exchange_market, shares_issued VALUES (?, ?, ?, ?) RETURNING *)",
                mapper,
                stock.getTicker (),
                stock.getName (),
                stock.getExchangeMarket ().name (),
                stock.getSharesIssued ()
        ).get (0);
    }
}
