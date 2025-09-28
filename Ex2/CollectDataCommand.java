public class CollectDataCommand implements Command {
    @Override
    public void execute(SatelliteState state) {
        if (state.getSolarPanels().equals("Active")) {
            state.setDataCollected(state.getDataCollected() + 10);
            System.out.println("Data collected. Total: " + state.getDataCollected());
        } else {
            System.err.println("Cannot collect data: Solar panels are inactive.");
        }
    }
}
