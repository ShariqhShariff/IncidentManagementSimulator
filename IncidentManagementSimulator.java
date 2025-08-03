import java.util.*;

public class IncidentManagementSimulator {
    private static final Map<Integer, Incident> incidentMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Incident Management Menu ---");
            System.out.println("1. Raise Incident");
            System.out.println("2. View All Incidents");
            System.out.println("3. Resolve Incident");
            System.out.println("4. Escalate Incident");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    //Use this switch in Java 14 or higher
                    case 1 -> raiseIncident();
                    case 2 -> viewIncidents();
                    case 3 -> resolveIncident();
                    case 4 -> escalateIncident();
                    case 5 -> running = false;
                    default -> System.out.println("Invalid option. Try again.");
                }
                /*Until Here, else use below switch case for Java 8 or 11
                    case 1:
                        raiseIncident();
                        break;
                    case 2:
                        viewIncidents();
                        break;
                    case 3:
                        resolveIncident();
                        break;
                    case 4:
                        escalateIncident();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                    System.out.println("Invalid option. Try again.");
                    break;
                }*/
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void raiseIncident() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter priority (CRITICAL/MINOR): ");
        String priority = scanner.nextLine().toUpperCase();

        Incident incident;
        if (priority.equals("CRITICAL")) {
            incident = new CriticalIncident(title);
        } else if (priority.equals("MINOR")) {
            incident = new MinorIncident(title);
        } else {
            System.out.println("Invalid priority. Must be CRITICAL or MINOR.");
            return;
        }

        incidentMap.put(incident.getIncidentId(), incident);
        System.out.println("Incident raised: " + incident);
    }

    private static void viewIncidents() {
        if (incidentMap.isEmpty()) {
            System.out.println("No incidents found.");
            return;
        }

        for (Incident inc : incidentMap.values()) {
            System.out.println(inc);
        }
    }

    private static void resolveIncident() {
        System.out.print("Enter incident ID to resolve: ");
        int id = Integer.parseInt(scanner.nextLine());

        Incident inc = incidentMap.get(id);
        if (inc != null) {
            inc.setStatus("RESOLVED");
            System.out.println("Incident resolved: " + inc);
        } else {
            System.out.println("Incident ID not found.");
        }
    }

    private static void escalateIncident() {
        System.out.print("Enter incident ID to escalate: ");
        int id = Integer.parseInt(scanner.nextLine());

        Incident inc = incidentMap.get(id);
        if (inc != null) {
            inc.escalate();
        } else {
            System.out.println("Incident ID not found.");
        }
    }
}
