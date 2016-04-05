package com.book.bus.busbooking;

/**
 * Created by Choudhary on 07-Dec-15.
 */
public class WTcashModel {

    String amount;
    String mode;
    public WTcashModel(String amount, String mode){
        this.amount = amount;
        this.mode = mode;

    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }






}
