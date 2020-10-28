package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    //увеличиваем громкость
    @Test
    public void testRadioUpVolume() {

        Radio radio = new Radio();

        for (int i = 1; i < 100; i++) {
            radio.increaseSound();
        }
        assertEquals(99, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(100, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не приводит, значение остается прежним
        radio.increaseSound();
        assertEquals(100, radio.getCurrentSound());
    }

    //уменьшаем громкость
    @Test
    public void testRadioDownVolume() {

        Radio radio = new Radio();

        //  т.к у нас значение 0 по умолчанию, я сначала увеличиваю на пару пунктов, а потом уменьшаю громкость
        // и делаю нужную проверку
        radio.increaseSound();
        assertEquals(1, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(2, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(1, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(0, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не приводит, значение остается прежним
        radio.decreaseSound();
        assertEquals(0, radio.getCurrentSound());
    }

    //переключаем радиостанцию на следующую c конструктором
    @Test
    public void testRadioNextStationWithConstructor() {

        Radio radio = new Radio(8, 9);

        radio.nextStation();
        assertEquals(9, radio.getStationNumber());

        radio.nextStation();
        assertEquals(0, radio.getStationNumber());
    }

    //переключаем радиостанцию на предыдущую
    @Test
    public void testRadioPreviousStation() {

        Radio radio = new Radio();

        radio.prevStation();
        assertEquals(9, radio.getStationNumber());

        radio.prevStation();
        assertEquals(8, radio.getStationNumber());

        radio.prevStation();
        assertEquals(7, radio.getStationNumber());

        radio.prevStation();
        assertEquals(6, radio.getStationNumber());
    }
    // выставляем станцию с цифрового пульта
    @Test
    public void testInstallRadioStation () {

        Radio radio2 = new Radio();

        radio2.setStation(3);
        assertEquals(3,radio2.getStationNumber());

    }
}
