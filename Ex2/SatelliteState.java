public class SatelliteState {
    private String orientation;
    private String solarPanels;
    private int dataCollected;

    public SatelliteState() {
        this.orientation = "North";
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
    }

    // Getters and Setters
    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getSolarPanels() {
        return solarPanels;
    }

    public void setSolarPanels(String solarPanels) {
        this.solarPanels = solarPanels;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void setDataCollected(int dataCollected) {
        this.dataCollected = dataCollected;
    }

    @Override
    public String toString() {
        return String.format(
            "Orientation: %s\nSolar Panels: %s\nData Collected: %d",
            orientation, solarPanels, dataCollected
        );
    }
}
