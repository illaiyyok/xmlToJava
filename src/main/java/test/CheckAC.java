package test;

import javax.xml.bind.annotation.XmlElement;

public class CheckAC {

    protected String acctNbr;
    protected String acctStatus;
    protected String availBalance;
    protected String balance;
    protected String dateOpened;
    protected String type;

    public CheckAC() {}

    public CheckAC(String acctNbr, String acctStatus, String availBalance, String balance, String dateOpened,
            String type) {
        super();
        this.acctNbr = acctNbr;
        this.acctStatus = acctStatus;
        this.availBalance = availBalance;
        this.balance = balance;
        this.dateOpened = dateOpened;
        this.type = type;
    }

    @XmlElement(name="acctNbr")
    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    @XmlElement(name="dateOpened")
    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    @XmlElement(name="acctStatus")
    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    @XmlElement(name="balance")
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @XmlElement(name="availBalance")
    public String getAvailBalance() {
        return availBalance;
    }

    public void setAvailBalance(String availBalance) {
        this.availBalance = availBalance;
    }

    @XmlElement(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}