package DESIGN_PATTERNS.CREATIONAL;

public class BuilderPattern { // as computer class

    private final String ram;
    private final String ssd;

    // optional params
    private final String graphicsCard;
    private final String bluetooth;

    private BuilderPattern(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;

    };

    public static class ComputerBuilder {

        private final String ram;
        private final String ssd;

        // optional params
        private String graphicsCard;
        private String bluetooth;

        public ComputerBuilder(String ram, String ssd) {

            this.ram = ram;
            this.ssd = ssd;

        }

        public ComputerBuilder enableGraphicsCard(String name) {

            this.graphicsCard = name;
            return this;
        }

        public ComputerBuilder enableBluetooth(String name) {

            this.bluetooth = name;
            return this;
        }

        public BuilderPattern build() {

            return new BuilderPattern(this);
        }

    }

    @Override
    public String toString() {
        return "computer >>>> " + ram + ", " + ssd + ", " + graphicsCard + ", " + bluetooth;
    }

}

// public static void main(String[] args) {
// BuilderPattern computer = new BuilderPattern.ComputerBuilder("WD",
// "SONY").enableBluetooth("SAMSUNG").build();

// System.out.println(computer);
// }