package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductItem {
    Employee emp = new Employee();
    Scanner sc = new Scanner(System.in);
    ArrayList<Menu> mainMenu = new ArrayList<Menu>();
    ArrayList<Menu> optionMenu = new ArrayList<Menu>();
    ArrayList<Product> bugerMenu = new ArrayList<Product>();
    ArrayList<Product> custardMenu = new ArrayList<Product>();
    ArrayList<Product> drinksMenu = new ArrayList<Product>();
    ArrayList<Product> beersMenu = new ArrayList<Product>();

    void setmainMenu() {
        Menu mainMenu1 = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
        Menu mainMenu2 = new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        Menu mainMenu3 = new Menu("Drinks", "매장에서 직접 만드는 음료");
        Menu mainMenu4 = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        mainMenu.add(mainMenu1);
        mainMenu.add(mainMenu2);
        mainMenu.add(mainMenu3);
        mainMenu.add(mainMenu4);
    }

    void setoptionMenu() {
        Menu optionMenu1 = new Menu("Orders", "장바구니 확인 후 주문합니다.");
        Menu optionMenu2 = new Menu("Cancel", "진행중인 주문을 취소합니다.");
        optionMenu.add(optionMenu1);
        optionMenu.add(optionMenu2);
    }

    void setbugerMenu() {
        Product buger1 = new Product("ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        Product buger2 = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        Product buger3 = new Product("Shroom Buger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        Product buger4 = new Product("Cheesebuger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        Product buger5 = new Product("Hambuger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        bugerMenu.add(buger1);
        bugerMenu.add(buger2);
        bugerMenu.add(buger3);
        bugerMenu.add(buger4);
        bugerMenu.add(buger5);
    }

    void setCustardMenu() {
        Product custard1 = new Product("Shakes", "바닐라, 초콜렛, 솔티드, 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9);
        Product custard2 = new Product("Cups & Cones", "바닐라, 초콜렛, Flavor of the Week", 4.9);
        Product custard3 = new Product("Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5.9);
        custardMenu.add(custard1);
        custardMenu.add(custard2);
        custardMenu.add(custard3);
    }

    void setDrinksMenu() {
        Product drink1 = new Product("Shack-mode Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3.9);
        Product drink2 = new Product("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.4);
        Product drink3 = new Product("Fitty/Fitty", "레몬에이드와 아이스티의 만남", 3.5);
        Product drink4 = new Product("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2.7);
        Product drink5 = new Product("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4);
        Product drink6 = new Product("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1.0);
        drinksMenu.add(drink1);
        drinksMenu.add(drink2);
        drinksMenu.add(drink3);
        drinksMenu.add(drink4);
        drinksMenu.add(drink5);
        drinksMenu.add(drink6);
    }

    void setBeersMenu() {
        Product beer1 = new Product("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루머리에서 특별히 양조한 에일 맥주", 9.8);
        Product beer2 = new Product("Magpie Brewing Co.", "-", 6.8);
        beersMenu.add(beer1);
        beersMenu.add(beer2);
    }
    public void showKiosk(){
        int orderNumber;
        int a = 1;
        emp.sayMain();
        for(Menu item : mainMenu){
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
        System.out.println(" [ ORDER MENU ] ");
        for(Menu item : optionMenu){
            System.out.println(a + ". ");
            a++;
            item.showMenu();
        }
        orderNumber = sc.nextInt();
    }
}
