package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:41
 * @version: ${VERSION}
 * @modified By:
 */
public class Steamship extends SeaTransport{
    public Steamship(String id) {
        super(id);
    }

    public void driveMethod(){
        System.out.println("drive steamship");
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

}
