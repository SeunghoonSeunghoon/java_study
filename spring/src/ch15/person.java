package ch15;

public class person {
    String personName;
    int money;

    public person(String personName, int money){
        this.personName = personName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }
    public void showinfo(){
        System.out.println(personName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
