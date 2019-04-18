public class DrinkItem {

    private String itemCode;
    private int quantity;

    public DrinkItem(String x, int y){
        itemCode = x;
        quantity = y;
    }

    public String getItemCode(){
        return itemCode;
    }

    public void setItemCode(String ic){
        itemCode = ic;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int q){
        quantity = q;
    }

}
