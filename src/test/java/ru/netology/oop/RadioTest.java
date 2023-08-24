package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    /*---------setStationTests----------*/
    @Test
    void setStationTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestMuchLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(-10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStationTestMuchMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setNextStationTests----------*/
    @Test
    void setNextStationTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextStationTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextStationTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setPrevStationTests----------*/
    @Test
    void setPrevStationTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStationTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStationTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setVolumeTests----------*/
    @Test
    void setVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestMuchLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeTestMuchMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------increaseVolumeTests----------*/
    @Test
    void increaseVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    /*---------decreaseVolumeTests----------*/
    @Test
    void decreaseVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
}
