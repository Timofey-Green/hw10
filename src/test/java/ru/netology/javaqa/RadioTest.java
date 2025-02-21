package ru.netology.javaqa;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    // ТЕСТИРУЕМ ПЕРКЛЮЧЕНИЕ РАДИОСТАНЦИИ
    // Проверяем ввод валидного значения, нижней границы, верхней границы
    // и неваличных значений по двум границам.


    @Test //Устанавливаем валидное значение станции

    public void shouldStation() {
        Radio rad = new Radio();

        rad.setStation(5);

        int expected = 5;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Устанавливаем нижнее граничное значение станции

    public void theLowerLimit() {
        Radio rad = new Radio();

        rad.setStation(0);

        int expected = 0;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Устанавливаем верхнее граничное значение

    public void theUpperLimit() {
        Radio rad = new Radio();

        rad.setStation(9);

        int expected = 9;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Устанавливаем верхнее невалидное значение

    public void invalidMaxValue() {
        Radio rad = new Radio();

        rad.setStation(10);

        int expected = 0;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Устанавливаем нижнее невалидное значение

    public void invalidMinValue() {
        Radio rad = new Radio();

        rad.setStation(-1);

        int expected = 0;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test  //Проверяем переключение станции с - на 9.

    public void switchingFrom0To9() {
        Radio rad = new Radio();

        rad.setStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Проверяем переключение станции с 9 на 0.

    public void switchingFrom9To0() {
        Radio rad = new Radio();
        rad.setStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Проверяем переключение станции с 4 на 5. (кнопка next)

    public void switchingFrom4To5() {
        Radio rad = new Radio();
        rad.setStation(4);

        rad.nextStation();

        int expected = 5;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Проверяем переключение станции с 5 на 4. (кнопка prev)

    public void switchingFrom5To4() {
        Radio rad = new Radio();

        rad.setStation(5);

        rad.prevStation();

        int expected = 4;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);
    }


    // ТЕСТИРУЕМ РЕГУЛИРОВКУ ГРОМКОСТИ

    @Test  //Установили валидное значение громкости

    public void shouldVolume() {
        Radio rad = new Radio();

        rad.setVolume(50);

        int expected = 50;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test  //Установили верхнее граничное значение громкости

    public void shoulMaxVolume() {    //Установили валидное значение громкости
        Radio rad = new Radio();

        rad.setVolume(100);

        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Установили нижнее граничное значение громкости

    public void shoulMinVolume() {    //Установили валидное значение громкости
        Radio rad = new Radio();

        rad.setVolume(0);

        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Устанавливаем верхнее невалидное граничное значение

    public void InvalidMaxVolume() {    //Установили валидное значение громкости
        Radio rad = new Radio();

        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test  //Устанавливаем нижнее невалидное граничное значение

    public void InvalidMinVolume() {    //Установили валидное значение громкости
        Radio rad = new Radio();

        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //Проверяем переключсение громкости с 50 на 51. (кнопка увеличения громкости)

    public void volumeFrom50To51() {
        Radio rad = new Radio();

        rad.setVolume(50);

        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Проверяем переключение громкости со 100 на 101.

    public void volumeFrom100() {
        Radio rad = new Radio();

        rad.setVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Проверяем переключение громкости с 40 на 39 (кнопка уменьшения громкости).

    public void volumeFrom40To39() {
        Radio rad = new Radio();

        rad.setVolume(40);

        rad.decreaseVolume();

        int expected = 39;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test  //Проверяем переключение громкости с 0 на -1
    
    public void volumeFrom0() {
        Radio rad = new Radio();

        rad.setVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

}



