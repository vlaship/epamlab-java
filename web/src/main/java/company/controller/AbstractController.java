package company.controller;

import company.DAO.AccountDAO;
import org.springframework.ui.Model;
import static company.Constants.*;

public abstract class AbstractController {

    protected static Model accountForJSP(String login, Model model) {

        if (!login.isEmpty()) {
            model.addAttribute("currAccount", new AccountDAO().getAccountByLogin(login));
        }

        return model;
    }
}
