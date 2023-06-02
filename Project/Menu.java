package Project;

public class Menu {
    // 메뉴판 생성 -> 번호 입력 시 해당 메뉴판으로 이동
    // 이름, 설명 필드를 갖는 클래스
    private String name; // 이름 필드
    private String desc; // 설명 필드
    public Menu(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public void showMenu(){
        System.out.printf("%-20s | %s\n", name, desc); // 가격이 포함되지 않는 메인 메뉴 출력
    }
}
