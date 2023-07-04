package test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountObject")
public class Account {

    private String statusMessage;
    private CheckingAccount checkingAccts;
    private LoanAccts loanAccts;

    public Account() {}

    public Account(String statusMessage, CheckingAccount checkingAccts, LoanAccts loanAccts) {
        super();
        this.statusMessage = statusMessage;
        this.checkingAccts = checkingAccts;
        this.loanAccts = loanAccts;
    }

    @XmlElement(name="statusMessage")
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @XmlElement(name="checkingAccts")
    public CheckingAccount getCheckingAccts() {
        return checkingAccts;
    }

    public void setCheckingAccts(CheckingAccount checkingAccts) {
        this.checkingAccts = checkingAccts;
    }

    @XmlElement(name="loanAccts")
    public LoanAccts getLoanAccts() {
        return loanAccts;
    }

    public void setLoanAccts(LoanAccts loanAccts) {
        this.loanAccts = loanAccts;
    }

}