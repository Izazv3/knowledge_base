import DESIGN_PATTERNS.CREATIONAL.BuilderPattern;

public class Main {

    public static void main(String[] args) {
        BuilderPattern computer = new BuilderPattern.ComputerBuilder("WD", "SONY").enableBluetooth("SAMSUNG").build();

        System.out.println(computer);
    }

}
