package hello.core.singleton;

public class StatefulService {
    // private int price; // 상태 유지하는 필드 (문제 발생)

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        // this.price = price; // 다른 사용자 요청 시 값이 덮어씌워짐
        return price; // 필드를 사용하지 않고, 주문한 금액을 반환
    }
}