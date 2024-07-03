// HealthRecord.java
public class HealthRecord {
    // TODO: Add fields
    private String Fname;
    private String Lname;
    private int age;
    private int height;
    private int weight;
    private int bloodPressure;
    private int heartRate;


    // TODO: Add constructor
    public HealthRecord(String Fname, String Lname, int age, int height, int weight, int bloodPressure, int heartRate){
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
    }
    // TODO: Add getter methods
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public int getBloodPressure(){
        return bloodPressure;
    }
    public int getHeartRate(){
        return heartRate;
    }

  }