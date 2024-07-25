package Advanced_OOP;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String customer_name;
    private List<Account> accountsType;

    public User(String customer_name) {
        this.customer_name = customer_name;
        this.accountsType = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accountsType.add(account); //add() coming from ArrayList
    }

    public Account seeAccount(int index) {
        if (index >= 0 && index < accountsType.size()) {
            return accountsType.get(index);
        } else {
            System.out.println("Account NOT found");
            return null;
        }
    }


}
