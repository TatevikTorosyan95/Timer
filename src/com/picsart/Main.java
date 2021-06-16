package com.picsart;

import com.picsart.Model.Timer;

public class Main {
    public static void main(String[] args) {
//        Service service = new Service();
//        Timer t = service.create();
        Thread t3 = new Thread(new Timer());
        t3.start();
    }
}
