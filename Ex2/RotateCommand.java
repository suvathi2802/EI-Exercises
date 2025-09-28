public class RotateCommand implements Command {
    private final String direction;

    public RotateCommand(String direction) {
        this.direction = direction;
    }

    @Override
    public void execute(SatelliteState state) {
        if (direction.equalsIgnoreCase("North") ||
            direction.equalsIgnoreCase("South") ||
            direction.equalsIgnoreCase("East") ||
            direction.equalsIgnoreCase("West")) {
            state.setOrientation(direction);
            System.out.println("Rotated to: " + direction);
        } else {
            System.err.println("Invalid direction: " + direction);
        }
    }
}
