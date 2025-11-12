
package smarthome;

import Actions.Adjustable;
import Exceptions.InvlidOption;

public class Thermostat extends SmartDevice implements Adjustable{
int temperature;

    public Thermostat(String str) {
        super(str);
        temperature=0;
    }
    @Override
    void turnOn() {
  try{
     if(isOn)
         throw new InvlidOption("Thermostat is already on");
        
     else  isOn=true;
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    } }

    @Override
    void turnOff() {
   try{
     if(isOn)
         isOn=false;
     else throw new InvlidOption("Thermostat is already off");
    }
     catch(InvlidOption e)
    {
        System.out.println(e);
    
    } }

    @Override
    String getStatus() {
   if(isOn)
       {  String s=String.valueOf(temperature);
            return ("Thermostat is on and temperature is "+s);}
       else  return ("Thermostat is off "); }

    @Override
    public void adjust(int value) {
    try{
        if(value<0||value>100)
         throw new InvlidOption("Invald value should be 0-100");
        temperature=value;
    }catch(InvlidOption e){
          System.out.println(e);
    }
    }

    @Override
    boolean isAdjustable() {
  return true; }

    @Override
    boolean isRecordable() {
  return false; }

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
     else  throw new InvlidOption("Invald Option");
       }
       catch(InvlidOption e){
       System.out.println(e);
       } }
    
}
