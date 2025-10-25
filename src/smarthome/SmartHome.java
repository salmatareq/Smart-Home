
package smarthome;

public class SmartHome {

    
    public static void main(String[] args) {
       
        
        
        
        
               HomeController controller = new HomeController();

       
        controller.addDevice(new SmartLight("Living Room Light"));
        controller.addDevice(new Thermostat("Bedroom Thermostat"));
        controller.addDevice(new SecurityCamera("Front Door Camera"));

       
        controller.executeCommand("Living Room Light", "adjust", 120);
        controller.executeCommand("Bedroom Thermostat", "adjust", 25);
        controller.executeCommand("Front Door Camera", "startRecording", 0);
    }
        
        
        
        
 
    }
    

