package ru.netology.oop;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation != maxStation) {
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
            currentStation = maxStation;
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

