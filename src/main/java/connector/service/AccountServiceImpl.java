package connector.service;


import connector.dao.AccountDAO;
import connector.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl {

    @Autowired
    private AccountDAO accountDAO;

    public List<Account> findAll() {
        return accountDAO.findAll();
    }
}
