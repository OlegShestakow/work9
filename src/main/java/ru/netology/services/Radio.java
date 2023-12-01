package ru.netology.services;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;

    }


    public void reduceVolume(int newReduceVolume) {
        if (newReduceVolume <= 100) {
            newReduceVolume = newReduceVolume - 1;
        }
        if (newReduceVolume < 0) {
            return;
        }
        if (newReduceVolume > 100) {
            return;
        }
        currentVolume = newReduceVolume;
    }


    public void setIncreaseStation(int newIncreaseStation) {
        if (newIncreaseStation < 9) {
            newIncreaseStation = newIncreaseStation + 1;
        }
        if (newIncreaseStation >= 9) {
            newIncreaseStation = 1;
        }
        if(newIncreaseStation < 0){
            return;
        }


        currentStation = newIncreaseStation;

    }


    public void reduceStation(int newReduceStation) {
        if (newReduceStation <= 9) {
            newReduceStation = newReduceStation - 1;
        }
        if (newReduceStation < 0) {
            newReduceStation = 9;
        }
        if(newReduceStation >9){
            return;
        }



        currentStation = newReduceStation;

    }
}