public class CriticalIncident extends Incident {
    public CriticalIncident(String title) {
        super(title, "CRITICAL");
    }
    
    @Override
    public void escalate() {
        System.out.println("Escalating CRITICAL incident immediately to Site Lead and Dev Team!");
    }
}
