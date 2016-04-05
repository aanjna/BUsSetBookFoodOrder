package com.book.bus.busbooking;

/**
 * Created by Choudhary on 30-Dec-15.
 */
public class RoutflowModel {
    String routnumber;
    String rout;
    String via;

    public RoutflowModel(String rout, String via, String routnumber) {
        this.rout = rout;
        this.via = via;
        this.routnumber = routnumber;
    }


    public String getRoutnumber() {
        return routnumber;
    }

    public void setRoutnumber(String routnumber) {
        this.routnumber = routnumber;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }


}
