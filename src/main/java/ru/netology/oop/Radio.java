package ru.netology.oop;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation != 9) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
            return;
        }
    }

    public void setPrevStation() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = 9;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
            return;
        } else return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
            return;
        } else return;
    }


}

