public class Item {

    private String code; // item code
    private String name; // item name
    private double price; // unit price before tax

    public Item (String c, String n, double p){
        code = c;
        name = n;
        price = p;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
