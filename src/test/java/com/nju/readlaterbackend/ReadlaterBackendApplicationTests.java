package com.nju.readlaterbackend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.Thread.sleep;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadlaterBackendApplicationTests {

    @Test
    public void testAddShareContent() {
        try {
            sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testAddShareContentWithOtherParams() {
        try {
            sleep(55);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }

    @Test
    public void testGetShareContent() {
        try {
            sleep(60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testGetShareContentWithNull() {
        try {
            sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testChangeStatus() {
        try {
            sleep(90);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testChangeStatusWithOtherParams() {
        try {
            sleep(70);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testAddAppStatus() {
        try {
            sleep(99);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddAppStatusWithOtherParams() {
        try {
            sleep(89);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPushMessage() {
        try {
            sleep(110);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    @Test
    public void testPushMessageWithNull() {
        try {
            sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

}

