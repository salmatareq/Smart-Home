package smarthome;

import java.util.*;

public class SmartHome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeController controller = new HomeController();

       boolean flag=false;
        while (true) {
            System.out.println("\n===== Smart Home Menu =====");
            System.out.println("1. Add Device");
            System.out.println("2. Control Device");
            System.out.println("3. List Devices");
            System.out.println("4. Remove Device");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

               
                case 1 :{
                    System.out.print("Enter device name: ");
                   
                     String name ;
                    while(true){
                       name = sc.nextLine();
                        SmartDevice device = controller.findDevice(name);


                    if (device == null) {
                        
                        break;
                    }
                    else System.out.println("The name already exists");
                    }
                   
                    System.out.print("Device type (1-Light, 2-Thermostat, 3-Camera): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    switch (type) {
                        case 1 :{ controller.addDevice(new SmartLight(name));break;}
                        case 2 :{ controller.addDevice(new Thermostat(name));break;}
                        case 3 : {controller.addDevice(new SecurityCamera(name));break;}
                        default : System.out.println("Invalid type");
                    }
                    System.out.println("Device added successfully!");
                    break;
                }

               
                case 2 :{
                    System.out.print("Enter device name to control: ");
                    String name = sc.nextLine();
                    SmartDevice device = controller.findDevice(name);


                    if (device == null) {
                        System.out.println(" Device not found.");
                        break;
                    }

                    System.out.println("\nDevice found: " + device.name);
                    System.out.println("Status: " + device.getStatus());

                    if (device instanceof SmartLight) {
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Adjust Brightness");
                        System.out.print("Choose action: ");
                        int act = sc.nextInt();
                        if (act == 1) device.turnOn();
                        else if (act == 2) device.turnOff();
                        else if (act == 3) {
                            System.out.print("Enter new brightness (0–100): ");
                            int val = sc.nextInt();
                            device.executeCommand("adjust", val);
                        } else System.out.println(" Invalid action.");
                    }

                    else if (device instanceof Thermostat) {
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Adjust Temperature");
                        System.out.print("Choose action: ");
                        int act = sc.nextInt();
                        if (act == 1) device.turnOn();
                        else if (act == 2) device.turnOff();
                        else if (act == 3) {
                            System.out.print("Enter new temperature: ");
                            int val = sc.nextInt();
                            device.executeCommand("adjust", val);
                        } else System.out.println(" Invalid action.");
                    }

                    else if (device instanceof SecurityCamera) {
                        System.out.println("1. Turn On");
                        System.out.println("2. Turn Off");
                        System.out.println("3. Start Recording");
                        System.out.println("4. Stop Recording");
                        System.out.print("Choose action: ");
                        int act = sc.nextInt();
                        switch (act) {
                            case 1 :{ device.turnOn();break;}
                            case 2 : {device.turnOff();break;}
                            case 3 : {device.executeCommand("startRecording", 0);break;}
                            case 4 : {device.executeCommand("stopRecording", 0);break;}
                            default :{ System.out.println(" Invalid action.");break;}
                        }
                    }
                    break;
                }

              
                case 3 : {
                    if (controller.DevicesList.isEmpty()) {
                        System.out.println("No devices found.");
                    } else {
                        System.out.println("\nCurrent Devices:");
                        for (SmartDevice d : controller.DevicesList) {
                            System.out.println("• " + d.name + " → " + d.getStatus());
                        }
                    }break;
                }

               
                case 4 : {
                    System.out.print("Enter device name to remove: ");
                    String name = sc.nextLine();
                   boolean removed = controller.removeDevice(name);

                    if (removed)
                        System.out.println("Device removed successfully.");
                    else
                        System.out.println(" Device not found.");
                    break;
                }

                
                case 5 :{
   System.out.println("Exiting Smart Home System...");
   flag=true;
                    break;}
                

                default : System.out.println("Invalid option. Please try again.");
            }if(flag)break;
        }
    }
}