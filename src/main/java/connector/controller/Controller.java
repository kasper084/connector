package connector.controller;

import connector.service.AccountServiceImpl;
import connector.service.ProfilesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AccountServiceImpl accountService;

    @Autowired
    ProfilesServiceImpl profilesService;

    
}
