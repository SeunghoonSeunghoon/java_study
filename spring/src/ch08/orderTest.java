package ch08;

public class orderTest {
    public static void main(String[] args) {
        order Tomas = new order();
        Tomas.orderNumber = "202011020003";
        Tomas.orderPhone = "01023450001";
        Tomas.orderAddress = "서울시 강남구 역삼동 111-333";
        Tomas.orderDate = 20201102;
        Tomas.orderTime = "130258";
        Tomas.orderPrice = "35000";
        Tomas.menuNumber = "0003";

        Tomas.showOrderInfo();
    }
}
