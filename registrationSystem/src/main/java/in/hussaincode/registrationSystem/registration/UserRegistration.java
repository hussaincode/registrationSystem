package in.hussaincode.registrationSystem.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.naming.ldap.PagedResultsControl;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class UserRegistration {

    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){

        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
