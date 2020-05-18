package com.company.transports;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:39
 * @version: ${VERSION}
 * @modified By:
 */
public class Hovercraft extends SeaTransport{
    public Hovercraft(String id) {
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
        System.out.println("drive hovercraft");
    }


}