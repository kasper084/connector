package connector.controller;

import connector.entity.Account;
import connector.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountServiceImpl accountService;

    @GetMapping("/")
    public List<Account> findAllAccounts() {
        return accountService.findAll();
    }

}
