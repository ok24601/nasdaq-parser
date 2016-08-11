package oleg.homework.security;
import org.springframework.web.bind.annotation.*;
import javax.inject.Inject;
import java.io.IOException;


@RestController
@RequestMapping(value = "/")
public class SecurityController {

    private SecurityService securityService;

    @RequestMapping(value = "/{company}", method = RequestMethod.GET)
    public String getSecurity(@PathVariable(value = "company") String company)
            throws IOException {
        return securityService.getSecurity(company).toString();
    }

    @Inject
    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }
}
