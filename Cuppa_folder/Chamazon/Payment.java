package com.company;
import java.util.Date;
public class Payment {
    private String id;
    private Date paid;
    private double total;
    private String details;
    private Account account;
    private static long idCounter = 0;

    /**Create a unique ID in 'some' order*/
    private static synchronized String createID(){
        return String.valueOf(idCounter++);
    }

    public Payment(Account a, double t, String d){
        id = createID();
        paid = new Date();
        total = t;
        details = d;
        account =a;
    }

    public String toString(){
        return "ID:" + id + ", Paid:" + paid + ",Total:" + total + " by" + account + " Details: "+ details;
    }
}
