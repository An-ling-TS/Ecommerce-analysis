package net.suncaper.ecommerceanalysis.domain;

public class UvDetailWk {
    private String week;
    private  int total;

    public int getTotal() {
        return total;
    }

    public String getWeek() {
        return week;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
