package com.yp.time;

import java.time.Clock;

/**
 * Created by yuan on 2017/12/25.
 */
public class CLockDemo {

    public static void main(String[] args) {
          Clock clock=Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }
}
