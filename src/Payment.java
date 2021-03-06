public class Payment {

    private FoodItem[] fi = new FoodItem[100];
    private int fiCount;
    private static double foodTax = 0.2; // 20% sales tax is added to all prices

    private DrinkItem[] di = new DrinkItem[100];
    private int diCount;
    private static double drinkTax = 0.1; // 10% sales tax is added to all prices

    public Payment(){
        this.fiCount = 0;
        this.diCount = 0;
    }

    public DrinkItem getDi(int x){
        return di[x];
    }

    public static double findPrice(Item[] pl, String c){
        double price = 0;
        for(int a = 0; a < pl.length; a++){
            if (pl[a].getCode().equals(c)){
                price = pl[a].getPrice();
            }
        }
        return price;
    }

    public double calculateBill(Item[] pl) { // this method returns the bill (total value of the items consumed for a particular table)
        double total = 0;
        for (int a = 0; a < fiCount; a++){
            String code = fi[a].getItemCode();
            double price = findPrice(pl, code);
            total += price * (1 + foodTax);
        }
        for (int b = 0; b < diCount; b++){
            String code = di[b].getItemCode();
            double price = findPrice(pl, code);
            total += price * (1 + drinkTax);
        }
        return total;
    }

    public void addFoodItem(FoodItem food){
        int a = 0;
        while (fi[a] != null){
            a++;
        }
        fi[a] = food;
    }

}
