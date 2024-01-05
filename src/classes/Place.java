package classes;

public abstract class Place {
    private final String name;
    private Direction direction;

    public static enum Direction {
        RIGHT ("слева от"),
        LEFT ("слева от"),
        CENTER ("в центре"),
        FRONT ("перед"),
        BEHIND ("позади");

        private String value;

        private Direction(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Place(String name, Direction direction) {
        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction.getValue();
    }
}
