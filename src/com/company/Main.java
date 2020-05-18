package com.company;

import com.company.human.Person;
import com.company.transports.HotAirBalloon;
import com.company.transports.Transports;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("225615", "sg");
        Transports hotAirBalloon = new HotAirBalloon("hotAirBalloon1");
        person.driveMethod(hotAirBalloon);
    }
}
