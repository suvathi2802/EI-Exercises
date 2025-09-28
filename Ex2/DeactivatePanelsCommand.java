public class DeactivatePanelsCommand implements Command {
    @Override
    public void execute(SatelliteState state) {
        state.setSolarPanels("Inactive");
        System.out.println("Solar panels deactivated.");
    }
}
