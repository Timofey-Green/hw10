package ru.netology.javaqa;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    // ТЕСТИРУЕМ ПЕРКЛЮЧЕНИЕ РАДИОСТАНЦИИ
    // Проверяем ввод валидного значения, нижней границы, верхней границы
    // и неваличных значений по двум границам.


    @Test //Устанавливаем

    public void shouldStation () {
        Radio rad = new Radio();

        rad.setStation(5);

        int expected = 5;
        int actual = rad.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void theLowerLimit() {
        Radio rad = new Radio();

        rad.setStation(1);

        int expected = 1;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theUpperLimit() {
        Radio rad = new Radio();

        rad.setStation(9);

        int expected = 9;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMaxValue() {
        Radio rad = new Radio();

        rad.setStation(10);

        int expected = 0;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidMinValue() {
        Radio rad = new Radio();

        rad.setStation(-1);

        int expected = 0;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    // Проверяем переключение станций с 0 на 9 радиостанцию и с 9 на 0 радиостанцию.

    @Test
    public void switchingFrom0To9() {
        Radio rad = new Radio();

        rad.setStation(0);

        rad.prevStation();

        int expected = 9;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test



    public void switchingFrom9To0 () {
        Radio rad = new Radio();
        rad.setStation(9);

        rad.nextStation();

        int expected = 0;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingFrom4To5 () {
        Radio rad = new Radio();
        rad.setStation(4);

        rad.nextStation();

        int expected = 5;
        int actual =rad.getStation();
        Assertions.assertEquals(expected, actual);
    }

}
