package oleg.homework.log;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ParserLogger {

    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    @Pointcut("execution(* oleg.homework.stock.StockController.getStock(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void logBefore() {
        log.info("start parsing");
    }

    @After("pointcut()")
    public void logAfter() {
        log.info("end parsing");
    }

}
