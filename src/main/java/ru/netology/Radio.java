package ru.netology;
public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;

    }
    public void setMaxVolume() {
        currentVolume = 10;
    }
    public void setMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setMaxStation() {

        currentStation = 9;
    }
    public void setMinStation() {

        currentStation = 0;
    }
    public void next(int newCurrentStation) {

        if (newCurrentStation > 9) {
            currentStation = 0;
        }
        if (newCurrentStation >= 0) {
            currentStation = currentStation + 1;
        }
    }
    public void prev(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = currentStation - 1;
        }
        if (newCurrentStation < 0) {
            currentStation = 9;
        }
    }
}
