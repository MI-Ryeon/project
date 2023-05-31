package Project;

public class Goods {
    String name;
    String desc;
    double price;

    String[][] bugerMenu = new String[][]{
            {"ShackBuger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
            {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
            {"Shroom Buger", "9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"},
            {"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
            {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"}
    };

    public void addMenu(String name, String desc, double price){
        System.out.printf("%-15s | %s | %s\n",name, "W " + price, desc);
    }
}
