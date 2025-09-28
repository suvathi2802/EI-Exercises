public class ActivatePanelsCommand implements Command {
    @Override
    public void execute(SatelliteState state) {
        state.setSolarPanels("Active");
        System.out.println("Solar panels activated.");
    }
}
