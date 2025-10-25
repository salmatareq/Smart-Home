
package smarthome;


public abstract class SmartDevice {
    String name;
    boolean isOn;
    public SmartDevice(String str){
   isOn=false;
   name=str;
    }
    abstract void turnOn();
    abstract void turnOff();
    abstract String getStatus();
   
     
     
     abstract boolean isAdjustable();
     abstract boolean isRecordable();
     abstract void executeCommand(String command, int value);
     
     
     
     
     
     
     
     
     
}
