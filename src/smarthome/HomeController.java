
package smarthome;

import java.util.*;


public class HomeController {
 public   List<SmartDevice> DevicesList=new ArrayList();
 void   addDevice(SmartDevice device){
 
 DevicesList.add(device);
 
 
 }
 void executeCommand(String deviceName, String command, int value){
 
for (SmartDevice device : DevicesList) {
   if(device.name==deviceName)
    device.executeCommand(command, value);
}
 
 }
 
}
