
package smarthome;

import Actions.Adjustable;
import Exceptions.InvalidBrightnesslevel;
import Exceptions.InvlidOption;


public class SmartLight extends SmartDevice implements Adjustable {
     public   int brightness;

    public SmartLight(String str) {
        super(str);
        brightness=0;
    }
        
    @Override
    void turnOn() {
    try{
     if(isOn)
         throw new InvlidOption("Light is already on");
        
     else { isOn=true;
     
         System.out.println("Light has turned on");
     }
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }}

    @Override
    void turnOff() {
      try{
     if(isOn)
     { isOn=false;    System.out.println("Light has turned off");
     }
     else throw new InvlidOption("light is already off");
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    }
    }

    @Override
    String getStatus() {
      
       if(isOn)
       {  String s=String.valueOf(brightness);
            return ("Light is on and brightness level is "+s);}
       else  return ("Light is off ");
    }

    @Override
    public void adjust(int value) {
    try{
        if(value>=0&&value<=100)
            brightness=value;
        else throw new InvalidBrightnesslevel("Invalid level");
    }
    catch(InvalidBrightnesslevel e){
           
         System.out.println(e);
    }
    
}

    @Override
    boolean isAdjustable() {
   return true;
    }

    @Override
    boolean isRecordable() {
  return false;
    }

    @Override
    void executeCommand(String command, int value) {
       try{
        if (command.equalsIgnoreCase("adjust")) {
            adjust(value);
        }
        else if(command.equalsIgnoreCase("TurnOn"))
            turnOn();
        else if(command.equalsIgnoreCase("Turnoff"))
            turnOff();
    else   throw new InvlidOption("Invald Option l");
       }
       catch(InvlidOption e){
       System.out.println(e);
       }
        
    }
        
        
   
}