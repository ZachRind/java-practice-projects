public class Droid{

String name;
int batteryLevel;

public String toString(){
return "This droid's name is " + name; 
}

public void performTask(String task){
  System.out.println(name + " is performing task: " + task);
}

public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
}

public static void main(String[] args){
  Droid droid = new Droid("Codey");
  System.out.println(droid);
  droid.performTask("run");
}

}