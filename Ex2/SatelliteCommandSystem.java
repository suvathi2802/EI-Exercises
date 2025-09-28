import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SatelliteCommandSystem {
    private static SatelliteCommandSystem instance;
    private final SatelliteState state;
    private final List<Command> commandHistory;
    private static final Logger logger = Logger.getLogger(SatelliteCommandSystem.class.getName());

    private SatelliteCommandSystem() {
        this.state = new SatelliteState();
        this.commandHistory = new ArrayList<>();
    }

    public static synchronized SatelliteCommandSystem getInstance() {
        if (instance == null) {
            instance = new SatelliteCommandSystem();
        }
        return instance;
    }

    public void executeCommand(Command command) {
        command.execute(state);
        commandHistory.add(command);
        logger.info("Executed command: " + command.getClass().getSimpleName());
    }

    public void printState() {
        System.out.println(state);
    }
}
