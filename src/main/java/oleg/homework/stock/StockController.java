package oleg.homework.stock;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;


@RestController
@RequestMapping(value = "/")
public class StockController {

    private StockService stockService;

    @Inject
    public void setSecurityService(StockService securityService) {
        this.stockService = securityService;
    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/{company}"
            , method = RequestMethod.GET)
    public Stock getStock(@PathVariable(value = "company") String company)
            throws Exception {
        return stockService.getStock(company).get();
    }

    @ExceptionHandler
    public String exceptionHandler(Exception exc) {
        return (exc instanceof NullPointerException) ? "Not Found!" : "Exception";
    }


}
