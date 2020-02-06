public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(167000, 2003, "Daniel", "Collier");
        myCar.drive();
        System.out.println(myCar.toString());

        Rectangle myRect = new Rectangle(17, 9);
        System.out.println(myRect.getArea());
        System.out.println(myRect.getDiagonal());
        System.out.println(myRect.isSquare());
    }
}
