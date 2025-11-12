# Smart Home System

A simple Java-based Smart Home system that allows users to **add, control, list, and remove smart devices** like lights, thermostats, and security cameras.

---

## **Project Features**

- Add new devices: `Light`, `Thermostat`, `Camera`
- Control devices:
  - Turn On / Turn Off
  - Adjust brightness (Light) or temperature (Thermostat)
  - Start / Stop recording (Camera)
- List all devices with their current status
- Remove devices
- Interactive menu-driven interface

---

## **Project Structure**

SmartHome/
│
├── Source Packages/
  ├── Actions/ # Device capability interfaces
    ├── Adjustable.java
    └── Recordable.java
   
  ├── Exceptions/ # Custom exception classes
    ├── InvalidBrightnesslevel.java
    └── InvlidOption.java
   
  └── smarthome/ # Core smart home classes
  ├── HomeController.java
  ├── SecurityCamera.java
  ├── SmartDevice.java
  ├── SmartHome.java
  ├── SmartLight.java
  └── Thermostat.java

  Example Run
===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 1
Enter device name: Bedroom Light
Device type (1-Light, 2-Thermostat, 3-Camera): 1
Device added successfully!

===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 2
Enter device name to control: Bedroom Light

Device found: Bedroom Light
Status: Light is off 
1. Turn On
2. Turn Off
3. Adjust Brightness
Choose action: 1
Light has turned on

===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 2
Enter device name to control: Bedroom Light

Device found: Bedroom Light
Status: Light is on and brightness level is 0
1. Turn On
2. Turn Off
3. Adjust Brightness
Choose action: 3
Enter new brightness (0–100): 75

===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 1
Enter device name: Bedroom Light
The name already exists
camera 1
Device type (1-Light, 2-Thermostat, 3-Camera): 3
Device added successfully!

===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 3

Current Devices:
• Bedroom Light → Light is on and brightness level is 75
• camera 1 → Camera is off

===== Smart Home Menu =====
1. Add Device
2. Control Device
3. List Devices
4. Remove Device
5. Exit
Choose an option: 5
Exiting Smart Home System...
