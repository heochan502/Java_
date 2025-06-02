package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;
    // 오버로딩 (Overloading) 똑같은 이름의 매소드를 여러개 만들 수 있다.(파라메터가 무조간 달라야한다)
    // 조건은 파라미터가 타입의 순서와 갯수가 달라야한다.
    public Car(){

    }
    // 아래는 기본 생성자가 없고 아래와 같은 생성자가 없을 시 자동으로 기본 생성자를 넣는다.

    public Car(String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
    public Car(String model, int start, int speed){
        this.model = model;
       // this.start = start;
        this.speed = speed;
    }
}
