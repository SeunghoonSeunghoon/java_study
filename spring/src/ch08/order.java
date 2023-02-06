package ch08;

public class order {
    public String orderNumber;
    public String orderPhone;
    public String orderAddress;
    public int orderDate;
    public String orderTime;
    public String orderPrice;
    public String menuNumber;

    public void showOrderInfo(){
        System.out.println("주문 접수 번호: " + orderNumber + "\n"
        + "주문 핸드폰 번호 : " + orderPhone + "\n"
        + "주문 집 주소 : " + orderAddress + "\n"
        + "주문 날짜 : " + orderDate + "\n"
        + "주문 시간 : " + orderTime + "\n"
        + "주문 가격 : " + orderPrice + "\n"
        + "메뉴 번호 : " + menuNumber);}
}

