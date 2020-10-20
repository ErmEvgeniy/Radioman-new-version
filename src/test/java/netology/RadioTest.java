package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio();

        //увеличиваем громкость

        radio.increaseSound();
        assertEquals(97, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(98, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(99, radio.getCurrentSound());

        radio.increaseSound();
        assertEquals(100, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не привдит, значение остается прежним
        radio.increaseSound();
        assertEquals(100, radio.getCurrentSound());


        //уменьшаем громкость
        radio.decreaseSound();
        assertEquals(99, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(98, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(97, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(96, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(95, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(94, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(93, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(92, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(91, radio.getCurrentSound());

        radio.decreaseSound();
        assertEquals(90, radio.getCurrentSound());

        //дальнейшее нажатие ни к чему не привдит, значение остается прежним
//        radio.decreaseSound();
//        assertEquals(0, radio.getCurrentSound());


        //переключаем радиостанцию на следующую

        radio.nextStation();
        assertEquals(7, radio.getStationNumber());

        radio.nextStation();
        assertEquals(8, radio.getStationNumber());

        radio.nextStation();
        assertEquals(9, radio.getStationNumber());

        radio.nextStation();
        assertEquals(10, radio.getStationNumber());

        //Если текущая радиостанция - 10 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
        radio.nextStation();
        assertEquals(0, radio.getStationNumber());


        //переключаем радиостанцию на предыдущую
        radio.prevStation();
        assertEquals(10, radio.getStationNumber());

        radio.prevStation();
        assertEquals(9, radio.getStationNumber());

        radio.prevStation();
        assertEquals(8, radio.getStationNumber());

        radio.prevStation();
        assertEquals(7, radio.getStationNumber());


        // выставляем станцию с цифрового пульта

        radio.setStation(3);

    }
}