public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lenovo", "xelvo", 2032);
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


        car.setMake("nano");
        car.setModel("yelono");
        car.setYear(2030);

        System.out.println(car.getYear());

    }
}