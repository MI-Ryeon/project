package Project;

public class Employee {
    public void sayMain() {
        System.out.println("\"SHAKESHACK BUGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println(" [ SHAKESHACK MENU ] ");
    }

    public void sayProduct() {
        System.out.println("\"SHAKESHACK BUGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
    }

    public void sayOrder() {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.printf("%-10s %s", "1. 확인", "2. 취소");
    }
}
