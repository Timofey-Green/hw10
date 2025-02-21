package ru.netology.javaqa;

public class Radio {

    public int station;
    public int volume;

    //НАСТРОЙКА РАДИОСТАНЦИИ.

    public int getStation() {
        return station;
    }


    // Установили максимальные границы ввода.

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    // Установили шаги переключения станций.

    public void nextStation() {
        if (station < 9) {
            station = station + 1;
        } else {
            station = 0;
        }


    }


    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else {
            station = 9;
        }

    }



    //НАСТРОЙКА ГРОМКОСТИ

    public int getVolume() {
        return volume;
    }



    // Установили верхнюю и нижнюю границу громкости.

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    // Устанавливаем шаги прибавления и убавления громкости

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }

    }


}