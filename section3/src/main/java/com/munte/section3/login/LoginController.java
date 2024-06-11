package com.munte.section3.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

//    private Logger logger = LoggerFactory.getLogger(getClass());

//    @RequestMapping("login")
//    public String goToLoginPage(@RequestParam String name, ModelMap model) {
//        model.put("name", name);
//        logger.debug("Request param is {}", name);
//        return "login";
//    }

    private final AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {

        if(authenticationService.authenticate(name, password)) {
            map.put("name", name);
            return "welcome";
        }

        map.put("errorMessage", "Invalid Credentials");
        return "login";
    }

}
