package net.suncaper.ecommerceanalysis.domain;

public class User_log {
    private int user_id;
    private int item_id;
    private int cat_id;
    private int merchant_id;
    private int brand_id;
    private int action;
    private String month;
    private String day;
    private String province;
    private int gender;
    private int age_range;


    public int getUser_id() {
        return user_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public int getAction() {
        return action;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getProvince() {
        return province;
    }

    public int getGender() {
        return gender;
    }

    public int getAge_range() {
        return age_range;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge_range(int age_range) {
        this.age_range = age_range;
    }
}
