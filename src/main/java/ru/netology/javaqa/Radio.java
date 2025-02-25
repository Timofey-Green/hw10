package ru.netology.javaqa;

public class Radio {


    private int quantityStation = 10;
    private int maxStation = 9;
    private  int minStation = 0;
    private int station;
    private  int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

    public  Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public int getQuantityStation() {
        return  quantityStation;
    }

    //НАСТРОЙКА РАДИОСТАНЦИИ.
    //ГЕТТЕР СТАНЦИИ

    public int getStation() {
        return station;
    }


    // Установили максимальные границы ввода.

    //СЕТТЕР СТАНЦИИ
    public void setStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        station = newStation;
    }

    // Установили шаги переключения станций.

    public void nextStation() {
        if (station < maxStation) {
            station = station + 1;
        } else {
            station = minStation;
        }


    }


    public void prevStation() {
        if (station > minStation) {
            station = station - 1;
        } else {
            station = maxStation;
        }

    }


    //НАСТРОЙКА ГРОМКОСТИ
    //ГЕТТЕР ГРОМКОСТИ
    public int getVolume() {
        return volume;
    }


    // Установили верхнюю и нижнюю границу громкости.
    //СЕТТЕР ГРОМКОСТИ
    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    // Устанавливаем шаги прибавления и убавления громкости

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }

    }


}