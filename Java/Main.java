class Main {
  public static void name(String[] args) {
    System.out.printIn("Hola Mundo");
    Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
    car.passenger = 4;
    car.printDataCar();

    Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
    car2.passenger = 3;
    car2.printDataCar();
  }
}