public abstract class Incident {
    private static int counter = 1000;
    private static int incidentId;
    private String title;
    private String status;
    private String priority;

    public Incident(String title, String priority) {
        incidentId = counter++;
        this.title=title;
        this.priority=priority;
        this.status="OPEN";
    }

    public int getIncidentId() {
        return incidentId;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void escalate();

    @Override
    public String toString(){
        return "Incident [ID=" + incidentId + ", Title='" + title + "', Priority=" + priority + ", Status=" + status + "]";
    }
}
