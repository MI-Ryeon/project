package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    Employee emp = new Employee();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);
    ArrayList<Menu> mainMenu = new ArrayList<Menu>();
    ArrayList<Menu> optionMenu = new ArrayList<Menu>();
    ArrayList<Product> burgerMenu = new ArrayList<Product>();
    ArrayList<Product> custardMenu = new ArrayList<Product>();
    ArrayList<Product> drinkMenu = new ArrayList<Product>();
    ArrayList<Product> beerMenu = new ArrayList<Product>();
    void loadMenu() {
//        Menu mainMenu1 = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
//        Menu mainMenu2 = new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
//        Menu mainMenu3 = new Menu("Drinks", "매장에서 직접 만드는 음료");
//        Menu mainMenu4 = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        mainMenu.add(new Menu("Burgers","앵거스 비프 통살을 다져만든 버거"));
        mainMenu.add(new Menu("Frozen Custard","매장에서 신선하게 만드는 아이스크림"));
        mainMenu.add(new Menu("Drinks","매장에서 직접 만드는 음료"));
        mainMenu.add(new Menu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주"));
//        mainMenu.add(mainMenu1);
//        mainMenu.add(mainMenu2);
//        mainMenu.add(mainMenu3);
//        mainMenu.add(mainMenu4);
//        Menu optionMenu1 = new Menu("Order", "장바구니를 확인 후 주문합니다.");
//        Menu optionMenu2 = new Menu("Cancel", "진행중인 주문을 취소합니다.");
        optionMenu.add(new Menu("Order","장바구니를 확인 후 주문합니다."));
        optionMenu.add(new Menu("Cancel","진행중인 주문을 취소합니다."));
//        optionMenu.add(optionMenu1);
//        optionMenu.add(optionMenu2);
//        Product burger1 = new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
//        Product burger2 = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
//        Product burger3 = new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
//        Product burger4 = new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
//        Product burger5 = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        burgerMenu.add(new Product("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        burgerMenu.add(new Product("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9));
        burgerMenu.add(new Product("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4));
        burgerMenu.add(new Product("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9));
        burgerMenu.add(new Product("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거", 5.4));
//        burgerMenu.add(burger1);
//        burgerMenu.add(burger2);
//        burgerMenu.add(burger3);
//        burgerMenu.add(burger4);
//        burgerMenu.add(burger5);
//        Product custard1 = new Product("Shakes", "바닐라, 초콜렛, 솔티드, 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9);
//        Product custard2 = new Product("Cups & Cones", "바닐라, 초콜렛, Flavor of the Week", 4.9);
//        Product custard3 = new Product("Concretes", "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5.9);
        custardMenu.add(new Product("Shakes","바닐라, 초콜렛, 솔티드, 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9));
        custardMenu.add(new Product("Cups & Cones","바닐라, 초콜렛, Flavor of the Week", 4.9));
        custardMenu.add(new Product("Concretes","쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합", 5.9));
//        custardMenu.add(custard1);
//        custardMenu.add(custard2);
//        custardMenu.add(custard3);
//        Product drink1 = new Product("Shack-mode Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3.9);
//        Product drink2 = new Product("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.4);
//        Product drink3 = new Product("Fitty/Fitty", "레몬에이드와 아이스티의 만남", 3.5);
//        Product drink4 = new Product("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2.7);
//        Product drink5 = new Product("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4);
//        Product drink6 = new Product("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1.0);
        drinkMenu.add(new Product("Shack-mode Lemonade","매장에서 직접 만드는 상큼한 레몬에이드", 3.9));
        drinkMenu.add(new Product("Fresh Brewed Iced Tea","직접 유기농 홍차를 우려낸 아이스티", 3.4));
        drinkMenu.add(new Product("Fitty/Fitty","레몬에이드와 아이스티의 만남", 3.5));
        drinkMenu.add(new Product("Fountain Soda","코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2.7));
        drinkMenu.add(new Product("Abita Root Beer","청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4));
        drinkMenu.add(new Product("Bottled Water","지리산 암반대수층으로 만든 프리미엄 생수", 1.0));
//        drinkMenu.add(drink1);
//        drinkMenu.add(drink2);
//        drinkMenu.add(drink3);
//        drinkMenu.add(drink4);
//        drinkMenu.add(drink5);
//        drinkMenu.add(drink6);
//        Product beer1 = new Product("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루머리에서 특별히 양조한 에일 맥주", 9.8);
//        Product beer2 = new Product("Magpie Brewing Co.", "-", 6.8);
        beerMenu.add(new Product("ShackMeister Ale","쉐이크쉑 버거를 위해 뉴욕 브루클린 브루머리에서 특별히 양조한 에일 맥주", 9.8));
        beerMenu.add(new Product("Magpie Brewing Co.","-", 6.8));
//        beerMenu.add(beer1);
//        beerMenu.add(beer2);
    }
    void setmainMenu() {
        emp.sayMain();
        int a = 1;
        for (Menu item : mainMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
        System.out.println(" [ ORDER MENU ] ");
        for (Menu item : optionMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
    }
    void setbugerMenu() {
        emp.sayProduct();
        System.out.println(" [ Burgers MENU ] ");
        int a = 1;
        for (Menu item : burgerMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
    }

    void setcustardMenu() {
        emp.sayProduct();
        System.out.println(" [ Frozen Custard MENU ] ");
        int a = 1;
        for (Menu item : custardMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
    }

    void setdrinkMenu() {
        emp.sayProduct();
        System.out.println(" [ Drinks MENU ] ");
        int a = 1;
        for (Menu item : drinkMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
    }

    void setbeerMenu() {
        emp.sayProduct();
        System.out.println(" [ Beers MENU ] ");
        int a = 1;
        for (Menu item : beerMenu) {
            System.out.print(a + ". ");
            a++;
            item.showMenu();
        }
    }
//    void optionMenu(int a){
//        System.out.println(" [ ORDER MENU ] ");
//        System.out.printf(a+". %-20s | %);
//    }

    public void showKiosk() throws InterruptedException {
        loadMenu();
        int orderNumber;
        while(true){
            setmainMenu();
            orderNumber = sc.nextInt();
//            switch(orderNumber){
//                case 1 : case 2 : case 3 : case 4 :
//            }
            if (orderNumber == 1) {
                setbugerMenu();
                orderNumber = sc.nextInt();
                order.addShopping(burgerMenu.get(orderNumber-1));
                System.out.println();
            } else if (orderNumber == 2) {
                setcustardMenu();
                orderNumber = sc.nextInt();
                order.addShopping(custardMenu.get(orderNumber-1));
                System.out.println();
            } else if (orderNumber == 3) {
                setdrinkMenu();
                orderNumber = sc.nextInt();
                order.addShopping(drinkMenu.get(orderNumber-1));
                System.out.println();
            } else if (orderNumber == 4) {
                setbeerMenu();
                orderNumber = sc.nextInt();
                order.addShopping(beerMenu.get(orderNumber-1));
                System.out.println();
            } else if (orderNumber == 5){
                order.productOrder();
            } else if (orderNumber == 6){
                order.shoppingCancel();
            } else if (orderNumber == 7){
                break;
            }
        }
    }
}
