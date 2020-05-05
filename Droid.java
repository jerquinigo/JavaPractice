public class Droid {
    int batteryLevel;
    String name;
  
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString(){
      return "Hello I'm the droid: " + name;
    }
  
    public void performTask(String task){
       System.out.println(name + " is performing the task: " + task);
       batteryLevel = batteryLevel - 10;
    }
  
    public static void main(String[] arg){
      Droid droid1 = new Droid("Corey");
      System.out.println(droid1);
      droid1.toString();
      System.out.println("battery status: " + batteryLevel);
      droid1.performTask("walking");
      System.out.println("battery status: " + batteryLevel);
    }
  }