package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        // new 가 생성자 호출
        Car myCar = new Car();

        System.out.println("자동차회사 : "+ myCar.company);
        System.out.println("모델명 : "+ myCar.model);
        System.out.println("최대속도 : "+ myCar.maxSpeed);
        System.out.println("현재속도 : "+ myCar.speed);
        myCar.speed=20;
        System.out.println("현재속도 : "+ myCar.speed);
    }
}
