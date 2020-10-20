package netology;

public class Radio {

    private int currentStation;
    final int minStationNumber = 0;
    final int maxStationNumber;
    final int minSound = 0;
    final int maxSound = 100;
    private int currentSound;


    // конструкторы
    public Radio (){
        this.maxStationNumber = 10;
        this.currentStation = 10;
    }

    public Radio (int currentStation, int maxStationNumber){
        this.currentStation =currentStation;
        this.maxStationNumber = maxStationNumber;
    }


    public int getStationNumber() {
        return currentStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    //увеличиваем громкость
    public void increaseSound() {
        this.currentSound++;
        if (currentSound >= maxSound) {
            currentSound = maxSound;
        }
    }

    //уменьшаем громкость
    public void decreaseSound() {
        this.currentSound--;
        if (currentSound <= minSound) {
            currentSound = minSound;
        }
    }

    //переключаем радиостанцию на следующую.
    public void nextStation() {
        this.currentStation++;
        if (currentStation > maxStationNumber) {
            currentStation = minStationNumber;
        }
    }

    //переключаем радиостанцию на предыдущую
    public void prevStation() {
        this.currentStation--;
        if (currentStation < minStationNumber) {
            currentStation = maxStationNumber;

        }
    }

    // выставляем станцию с цифрового пульта
    public void setStation(int stationNumber) {
        if (stationNumber > maxStationNumber || stationNumber < minStationNumber) {
            System.out.println("Такой станции не существует");
        } else {
            currentStation = stationNumber;
        }
    }
}


