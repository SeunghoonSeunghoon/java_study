package ch15;

public class personTest {
    public static void main(String[] args) {
        person personE = new person("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        personE.takeTaxi(taxi);

        personE.showinfo();
        taxi.showTaxiInfo();
    }

}
