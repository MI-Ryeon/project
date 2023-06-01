package Project;
public class Product extends Menu {
    // 이름, 가격 필드는 메뉴 클래스에서 상속받는 구조
    // 이름, 가격, 설명 필드를 가짐
    private double price;
    public Product(String name, String desc, double price){
        super(name, desc);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public void showMenu(){
        System.out.printf("%-20s | \"W %s\" | %s",getName(),price,getDesc());
    }
}
