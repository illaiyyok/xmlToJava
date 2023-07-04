package test;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

    public static void main(String[] args) throws JAXBException {

        File file = new File("/Users/irajamo/Documents/workspace/xmlToJava/src/main/resources/myXmlFile.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Account.class);  

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Account acc = (Account) jaxbUnmarshaller.unmarshal(file); 

        // List of checking accounts
        List<CheckAC> checkingACList = acc.getCheckingAccts().getCheckingAcctsList();
        for(CheckAC checkAC : checkingACList)  
            System.out.println("A/C No: " + checkAC.getAcctNbr() + " ,A/C Status: " 
                    + checkAC.getAcctStatus() + " ,Available Balance: " + checkAC.getAvailBalance() + " ,Date Opened: " + checkAC.getDateOpened()
                    + " ,Type: " + checkAC.getType() + " ,Balance: " + checkAC.getBalance());  

    }
}