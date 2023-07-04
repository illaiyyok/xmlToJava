package test;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class CheckingAccount {

    private List<CheckAC> checkingAcctsList;

    public CheckingAccount() {}

    public CheckingAccount(List<CheckAC> checkingAcctsList) {
        super();
        this.checkingAcctsList = checkingAcctsList;
    }

    @XmlElement(name="CheckingAccts")
    public List<CheckAC> getCheckingAcctsList() {
        return checkingAcctsList;
    }

    public void setCheckingAcctsList(List<CheckAC> checkingAcctsList) {
        this.checkingAcctsList = checkingAcctsList;
    }

}