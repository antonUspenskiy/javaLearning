public class Cat {
    String catName;
    int catAge;
    String catColor;

    public Cat(String catName, int catAge, String catColor) {
        this.catName = catName;
        this.catAge = catAge;
        this.catColor = catColor;
    }

    public void printCatInfo() {
        System.out.printf("Котика зовут %s, ему %d лет, и его окрас - %s\n", catName, catAge, catColor);
    }
    public void doMeow() {
        System.out.print("Meoow!\n");
    }
}
