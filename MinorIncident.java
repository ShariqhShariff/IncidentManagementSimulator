public class MinorIncident extends Incident {
    public MinorIncident(String title) {
        super(title, "MINOR");
    }

    @Override
    public void escalate(){
        System.out.println("Logging MINOR incident for standard resolution within SLA.");
    }   
}
