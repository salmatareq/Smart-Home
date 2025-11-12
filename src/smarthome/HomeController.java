
package smarthome;

import java.util.*;


public class HomeController {
 public   List<SmartDevice> DevicesList=new ArrayList();
 void   addDevice(SmartDevice device){
 
 DevicesList.add(device);
 
 
 }
public SmartDevice findDevice(String name) {
    for (SmartDevice d : DevicesList) {
        if (d.name.equalsIgnoreCase(name))
            return d;
    }
    return null;
}
public boolean removeDevice(String name) {
 for (SmartDevice d : new ArrayList<>(DevicesList)) { 
        if (d.name.equalsIgnoreCase(name)) {
            DevicesList.remove(d);
            return true;
        }
    }
    return false;
 
}}
