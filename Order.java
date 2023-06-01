package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    // 주문
    // 상품 객체를 담을 수 있도록
    int waiting = 0; // 주문번호
    ArrayList<Product> shopping = new ArrayList<Product>(); // 장바구니
    Employee emp = new Employee(); // 대사 일일이 노가다 대체 가능
    Scanner sc = new Scanner(System.in);
    void addShopping(Product product){  // 장바구니 추가
        product.showMenu();
        emp.sayOrder();
        if(sc.nextInt()==1){
            System.out.println(product.getName() + " 가 장바구니에 추가되었습니다.");
            shopping.add(product);
        } else{
            System.out.println("주문을 취소합니다.");
        }
    }
    void productOrder() throws InterruptedException {   // 주문
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println(" [ Orders ] ");
        shoppingList();
        System.out.println(" [ Total ] ");
        System.out.println("W "+shoppingPrice());
        System.out.println();
        System.out.printf("%-10s %s\n", "1. 주문", "2. 메뉴판");
        if(sc.nextInt()==1){
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [ "+ shoppingNumber() +" ] 번 입니다.");
            System.out.println("3초후 메뉴판으로 돌아갑니다.");
            Thread.sleep(3000);
        }
    }
    void shoppingList(){    // 쇼핑 리스트 출력
        for(Product item : shopping){
            item.showMenu();
        }
    }
    double shoppingPrice(){ // 주문 금액의 총 합
        double total = 0;
        for (Product item : shopping){
            total += item.getPrice();
        }
        return total;
    }
    int shoppingNumber(){// 대기 번호
        shopping.clear();
        waiting++;
        return waiting;
    }
    void shoppingCancel(){  // 주문 취소
        for (Product item : shopping){
            item.showMenu();
        }
        emp.sayCancel();
        if(sc.nextInt()==1){
            shopping.clear();
            System.out.println("주문이 취소되었습니다.");
        } else{
            System.out.println("메인메뉴로 돌아갑니다.");
        }
    }
}
