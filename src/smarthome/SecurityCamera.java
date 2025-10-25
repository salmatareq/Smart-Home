
package smarthome;



import Actions.Recordable;
import Exceptions.InvlidOption;


public class SecurityCamera extends SmartDevice implements Recordable {
boolean isRecording;

    public SecurityCamera(String str) {
        super(str);
        isRecording=false;
    }
    @Override
    void turnOn() {
        try{
     if(isOn)
         throw new InvlidOption("Camera is already on");
        
     else  {isOn=true;
         System.out.println("camera has turned on");
     }
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }
    }

    @Override
    void turnOff() {
        try{
     if(isOn)
     { isOn=false;
      System.out.println("camera has turned off");}
     else throw new InvlidOption("Camera is already off");
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }
    }

    @Override
    String getStatus() {
       if(this.isOn)
           return("Camera is On");
       else return "Camera is off";
    }

    @Override
    public void startRecording() {
       try{
     if(isRecording)
         throw new InvlidOption("Camera is already Recording");
        
     else { isRecording=true;
      System.out.println("camera is recording now");
     }
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }
    }

    @Override
    public void stopRecording() {
     try{
     if(isRecording)
     { isRecording=false;
      System.out.println("Recording has stoped");
     
     }
     else throw new InvlidOption("Recording is already Stoped");
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }}

    @Override
    boolean isAdjustable() {
  return false; }

    @Override
    boolean isRecordable() {
 return true;
    }

    @Override
    void executeCommand(String command, int value) {
    try{
        if (command.equalsIgnoreCase("startRecording")) {
             startRecording();
        }
        else if(command.equalsIgnoreCase("TurnOn"))
            turnOn();
        else if(command.equalsIgnoreCase("Turnoff"))
            turnOff();
        else if(command.equalsIgnoreCase("stopRecording"))
           stopRecording();
     else throw new InvlidOption("Invald Option");
       }
       catch(InvlidOption e){
       System.out.println(e);
       } }
    
}
