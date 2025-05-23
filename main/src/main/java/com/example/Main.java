
package com.example;


/**
 *
 * @author amera mohsen
 */
// 6. Main class to test everything
public class Main {
    public static void main(String[] args) {


System.out.println("\n=========== Vehicle Management System =============");
        System.out.println("1.\n");
        // 1. Builder + Factory + Prototype
        VehicleBuilder builder = new VehicleBuilder()
            .setType("car")
            .setSpec("Model S");
        Vehicle car = builder.build();

        VehicleBuilder builder2 = new VehicleBuilder()
            .setType("drone")
            .setSpec("Nano SkyEye");
        Vehicle drone = builder2.build();

                VehicleBuilder Tbuilder = new VehicleBuilder()
            .setType("truck")
            .setSpec("Amirah Truck");
        Vehicle truck = Tbuilder.build();




System.out.println("\n2.\n");
        // Register prototype
        VehicleRegistry registry = new VehicleRegistry();
        registry.register("tesla", car);
        
        registry.register("Nano", drone);
        
        registry.register("Amirah Truck", truck);





        // Clone prototype mean copy 
        Vehicle clone = registry.get("tesla");
        Vehicle clone2 = registry.get("Nano");
        Vehicle Tclone = registry.get("Amirah Truck");
        



System.out.println("\n3. drive the cloned vehicles \n");

        // 2. Singleton Manager
        VehicleManager manager = VehicleManager.INSTANCE;
        manager.manage(clone);
        manager.manage(clone2);
        manager.manage(Tclone);



System.out.println("\n4. Facade interacte with subsystems\n");

        // 3. Facade for subsystems
        CommunicationFacade facade = new CommunicationFacade();
        facade.prepareForTrip("Tesla Car");
        
        CommunicationFacade facade2 = new CommunicationFacade();
        facade2.prepareForTrip("Nano Drone");

        CommunicationFacade Tfacade = new CommunicationFacade();
        Tfacade.prepareForTrip("Amirah Truck");




System.out.println("\n5. Bridge for separate rendering \n");

        // 4. Bridge rendering
        Renderer renderer = new AsciiRenderer();
        renderer.render("Rendering vehicle: Tesla Car");
        renderer.render("Rendering vehicle: Nano Drone");
        renderer.render("Rendering vehicle: Amirah Truck");
        




System.out.println("\n6.Proxy for access control ");

        // 5. Proxy with restricted access
        Vehicle proxy = new RemoteVehicleProxy(clone, false); // not authorized
        proxy.drive(); // Will print "Access Denied."

         Vehicle proxy2 = new RemoteVehicleProxy(clone2, true); //  authorized
        proxy2.drive(); // Will print "Access ."

        Vehicle Tproxy = new RemoteVehicleProxy(Tclone, true); // Authorized
        Tproxy.drive(); // Will print "Access ."

        Vehicle Tproxy2 = new RemoteVehicleProxy(Tclone, false); // Authorized
        Tproxy2.drive(); // Will print "Access ."



System.out.println("\n7. Adapter for intergrate with legacy hardware \n");

        // 6. Adapter to connect legacy sensor
        Sensor sensor = new SensorAdapter(new LagecySensor());
        sensor.read("Tesla Car");
        
        Sensor sensor2 = new SensorAdapter(new LagecySensor());
        sensor2.read("Nano Drone");

        Sensor Tsensor = new SensorAdapter(new LagecySensor());
        Tsensor.read("Amirah Truck");
        


    }
}

