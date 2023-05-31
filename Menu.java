package Project;

import java.util.Scanner;

public class Menu {
    Employee emp = new Employee();
    Goods goods = new Goods();
    String name;
    String desc;

    Scanner scan = new Scanner(System.in);

    double selectMenu(){
        emp.sayMain();
        System.out.println(" [ SHAKESHACK MENU ] ");
        System.out.printf("%-20s | %s\n","1. Bugers", "앵거스 비프 통살을 다져만든 버거");
        System.out.printf("%-20s | %s\n","2. Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        System.out.printf("%-20s | %s\n","3. Drinks", "매장에서 직접 만드는 음료");
        System.out.printf("%-20s | %s\n","4. Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println(" [ ORDER MENU ]");
        System.out.printf("%-15s | %s\n","5. Orders", "장바구니 확인 후 주문합니다.");
        System.out.printf("%-15s | %s\n","6. Cancel", "진행중인 주문을 취소합니다.");
        String result = scan.nextLine();
        if(result.equals("1")){
            return selectBugers();
        } else if(result.equals("2")){
            return selectCustard();
        } else if(result.equals("3")){
            return selectDrinks();
        } else if(result.equals("4")){
            return selectBeers();
        } else if(result.equals("5")){
            return 0;
        } else {
            return 0;
        }
        // return Integer.parseInt(result);
    }

    double selectBugers(){
        emp.sayGood();
        System.out.println(" [ Bugers MENU ]");
        goods.addMenu("1. ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        goods.addMenu("2. SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        goods.addMenu("3. Shroom Buger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        goods.addMenu("4. Cheesebuger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        goods.addMenu("5. Hambuger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        // System.out.printf("%-15s | %s | %s\n","1. ShackBuger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n","2. SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n","3. Shroom Buger", "W 9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        // System.out.printf("%-15s | %s | %s\n","4. Cheesebuger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n","5. Hambuger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        String result = scan.nextLine();
        return Integer.parseInt(result);
    }

    double selectCustard() {
        emp.sayGood();
        System.out.println(" [ Custard MENU ]");
        goods.addMenu("1. ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        goods.addMenu("2. SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        goods.addMenu("3. Shroom Buger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        goods.addMenu("4. Cheesebuger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        goods.addMenu("5. Hambuger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        // System.out.printf("%-15s | %s | %s\n", "1. ShackBuger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "2. SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "3. Shroom Buger", "W 9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        // System.out.printf("%-15s | %s | %s\n", "4. Cheesebuger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "5. Hambuger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        String result = scan.nextLine();
        return Integer.parseInt(result);
    }

    double selectDrinks() {
        emp.sayGood();
        System.out.println(" [ Drinks MENU ]");
        goods.addMenu("1. ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        goods.addMenu("2. SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        goods.addMenu("3. Shroom Buger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        goods.addMenu("4. Cheesebuger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        goods.addMenu("5. Hambuger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        // System.out.printf("%-15s | %s | %s\n", "1. ShackBuger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "2. SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "3. Shroom Buger", "W 9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        // System.out.printf("%-15s | %s | %s\n", "4. Cheesebuger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "5. Hambuger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        String result = scan.nextLine();
        return Integer.parseInt(result);
    }
    
    double selectBeers() {
        emp.sayGood();
        System.out.println(" [ Beers MENU ]");
        goods.addMenu("1. ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        goods.addMenu("2. SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        goods.addMenu("3. Shroom Buger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        goods.addMenu("4. Cheesebuger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        goods.addMenu("5. Hambuger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
        // System.out.printf("%-15s | %s | %s\n", "1. ShackBuger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "2. SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "3. Shroom Buger", "W 9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        // System.out.printf("%-15s | %s | %s\n", "4. Cheesebuger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        // System.out.printf("%-15s | %s | %s\n", "5. Hambuger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        String result = scan.nextLine();
        return Integer.parseInt(result);
    }
}
