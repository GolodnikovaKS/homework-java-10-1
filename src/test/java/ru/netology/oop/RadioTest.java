package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    /*---------setStationTests----------*/
    @Test
    public void setStationTestOnePossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(4);

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestMuchLessPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestLessPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestMinPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestMaxPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getMaxStation());

        int actual = radio.getCurrentStation();
        int expected = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestMorePossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getMaxStation() + 1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationTestMuchMorePossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getMaxStation() + 15);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setNextStationTests----------*/
    @Test
    public void setNextStationTestOnePossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(5);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationTestMinPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationTestMaxPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getMaxStation());
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setPrevStationTests----------*/
    @Test
    public void setPrevStationTestOnePossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(5);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationTestMinPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationTestMaxPossible() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getMaxStation());
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = radio.getMaxStation() - 1;
        Assertions.assertEquals(expected, actual);
    }

    /*---------setVolumeTests----------*/
    @Test
    public void setVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestMuchLessPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTestMuchMorePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    /*---------increaseVolumeTests----------*/
    @Test
    public void increaseVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    /*---------decreaseVolumeTests----------*/
    @Test
    public void decreaseVolumeTestOnePossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTestMinPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTestMaxPossible() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
}
