// Main.java
public class Main {
    public static void main(String[] args) {
        HealthRecord Patient = new HealthRecord("John", "Doe", 25, 180, 80, 120, 80);

        System.out.println("First Name: " + Patient.getFname());
        System.out.println("Last Name: " + Patient.getLname());
        System.out.println("Age: " + Patient.getAge());
        System.out.println("Height: " + Patient.getHeight());
        System.out.println("Weight: " + Patient.getWeight());
        System.out.println("Blood Pressure: " + Patient.getBloodPressure());
        System.out.println("Heart Rate: " + Patient.getHeartRate());
    }
}