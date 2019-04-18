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
        // code missing
    }

    // calculateBill() - this method returns the bill (total value of the items consumed for a particular table)

    public void addFoodItem(FoodItem food){
        int a = 0;
        while (fi[a] != null){
            a++;
        }
        fi[a] = food;
    }

}
