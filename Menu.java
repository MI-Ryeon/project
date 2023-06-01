package Project;

import java.util.Scanner;

public class Menu {
    // 메뉴판 생성 -> 번호 입력 시 해당 메뉴판으로 이동
    // 이름, 설명 필드를 갖는 클래스
    private String name;
    private String desc;
    public Menu(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void showMenu(){
        System.out.printf("%-20s | %s", name, desc);
    }
}
