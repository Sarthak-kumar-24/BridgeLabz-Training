package com.homenest;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* HomeNest – Smart Home Device Manager
 * 
 * Device base class: deviceId, status, energyUsage.
 * Subclasses: Light, Camera, Thermostat, Lock.
 *  Interface IControllable: turnOn(), turnOff(), reset().
 * Use constructors to register devices with user.
 *  Encapsulation: device status cannot be modified externally.
 *  Polymorphism: reset() behavior varies by device.
 *  
 *  
 */
public class HomeNest {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Device> devices = new ArrayList<>();

        while (true) {
            System.out.println("\n======  HOMENEST MENU ======");
            System.out.println("1. Register Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Reset Device");
            System.out.println("5. Show All Devices");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select Device Type: 1.Light 2.Camera 3.Thermostat 4.Lock");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Device ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter User Name: ");
                    String user = sc.nextLine();

                    Device device = null;
                    if (type == 1) device = new Light(id, user);
                    else if (type == 2) device = new Camera(id, user);
                    else if (type == 3) device = new Thermostat(id, user);
                    else if (type == 4) device = new Lock(id, user);

                    if (device != null) {
                        devices.add(device);
                        System.out.println(" Device registered");
                    }
                    break;

                case 2:
                case 3:
                case 4:
                    System.out.print("Enter Device ID: ");
                    int did = sc.nextInt();

                    for (Device d : devices) {
                        if (d.deviceId == did) {
                            if (choice == 2) d.turnOn();
                            else if (choice == 3) d.turnOff();
                            else d.reset();
                            System.out.println(" Operation successful");
                        }
                    }
                    break;

                case 5:
                    for (Device d : devices)
                        d.showInfo();
                    break;

                case 6:
                    System.out.println(" Exiting HomeNest");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
