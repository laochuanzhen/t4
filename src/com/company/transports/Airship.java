package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:35
 * @version: ${VERSION}
 * @modified By:
 */
public class Airship extends AirTransport{
    public Airship(String id) {
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
        System.out.println("drive airship");
    }

}