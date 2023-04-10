class Noodle {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    private String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        this.texture = "cooked";

    }

    public boolean isTasty() {

        return true;

    }

    public static void main(String[] args) {
        Pho phoChay = new Pho();
        System.out.println("Shape of the Pho Chay: " + phoChay.shape);

        Spaghetti mySpaghetti = new Spaghetti();
        System.out.println("Shape of the Spaghetti: " + mySpaghetti.shape);

        Ramen yasaiRamen = new Ramen();
        System.out.println("Ingredients of the yasai ramen: " + yasaiRamen.ingredients);
        System.out.println("Do yasai ramen taste good? Well, every noodle tastes good but here is the answer from the program: " + yasaiRamen.isTasty());

    }

}