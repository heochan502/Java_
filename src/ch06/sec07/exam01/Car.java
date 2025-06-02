package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;
    // 아래는 기본 생성자가 없고 아래와 같은 생성자가 없을 시 자동으로 기본 생성자를 넣는다.
    // 아래는
    public Car(String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
