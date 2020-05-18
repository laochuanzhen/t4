package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/18 22:11
 * @version: ${VERSION}
 * @modified By:
 */
public abstract class Transports{
    private String id;
    private String price;
    private String ownership;
    private String GPSPosition;
    private String dateOfPurchase;

    public abstract void driveMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();

    public Transports() {
    }

    public Transports(String id) {
        this.id = id;
    }

    public Transports(String id, String price, String ownership, String GPSPosition, String dateOfPurchase) {
        this.id = id;
        this.price = price;
        this.ownership = ownership;
        this.GPSPosition = GPSPosition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
