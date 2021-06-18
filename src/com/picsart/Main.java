package com.picsart;

import com.picsart.Model.Timer;

public class Main {
    public static void main(String[] args) {
        Thread t3 = new Thread(new Timer());
        t3.start();
    }
}
