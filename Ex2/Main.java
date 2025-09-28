import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SatelliteCommandSystem system = SatelliteCommandSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satellite Command System");
        System.out.println("Commands: rotate [N/S/E/W], activatePanels, deactivatePanels, collectData, state, exit");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                String[] parts = input.split(" ");
                String command = parts[0];

                switch (command.toLowerCase()) {
                    case "rotate":
                        if (parts.length == 2) {
                            system.executeCommand(new RotateCommand(parts[1]));
                        } else {
                            System.err.println("Usage: rotate [N/S/E/W]");
                        }
                        break;
                    case "activatepanels":
                        system.executeCommand(new ActivatePanelsCommand());
                        break;
                    case "deactivatepanels":
                        system.executeCommand(new DeactivatePanelsCommand());
                        break;
                    case "collectdata":
                        system.executeCommand(new CollectDataCommand());
                        break;
                    case "state":
                        system.printState();
                        break;
                    default:
                        System.err.println("Unknown command: " + command);
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Exiting Satellite Command System.");
    }
}
