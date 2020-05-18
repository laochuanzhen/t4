package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:40
 * @version: ${VERSION}
 * @modified By:
 */
public class Motorcycle extends LandTransport {
    public Motorcycle(String id) {
        super(id);
    }
    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }

    @Override
    public void addGas() {

    }
    public void driveMethod(){
        System.out.println("drive motorcycle");
    }

}

