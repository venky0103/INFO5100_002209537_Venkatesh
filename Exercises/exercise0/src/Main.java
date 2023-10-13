class car{
    String Car_Type;
    int model;
    int price;
    String fuel_type;
    String transmission_type;
    String engine_manufacturer;
    int tyre_size;
    String bulb_type;

    car(String carType, String carType1, int model, int price, String fuelType, String transmissionType, String engineManufacturer, int tyreSize, String bulbType) {
        Car_Type = carType1;
        this.model = model;
        this.price = price;
        fuel_type = fuelType;
        transmission_type = transmissionType;
        engine_manufacturer = engineManufacturer;
        tyre_size = tyreSize;
        bulb_type = bulbType;
        System.out.println("Car Instance created");
    }

    public void drivingCar(){
        System.out.println("My car has "+bulb_type);
    }
    public void getCar(){

    }
    public void setCar(){

    }
     class EngineType {
        int horsePower;
        int cylinders;


         EngineType (int horsePower, int cylinders) {
             this.horsePower = horsePower;
             this.cylinders = cylinders;
             System.out.println("Nested class for Car created");
         }
     }

}




class table{

    String table_type;
    int length;
    int width;
    int height;
    String material;
    String type;
    String legs;



    table(String tableType, int length, int width, int height, String material, String type, String legs) {
        table_type = tableType;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.type = type;
        this.legs = legs;
        System.out.println("table Instance created");
    }

    public void tableLength(){
        System.out.println("My Table length is "+length);
    }
    public void getTable(){

    }
    public void setTable(){

    }
}

class bottle{

     String type;
     String material;
     boolean insulation;
     boolean recyclable;
     String color;
     String cap_type;
     double quantity;
     String finish;

    bottle(String type, String material, boolean insulation, boolean recyclable, String color, String capType, double quantity, String finish) {
        this.type = type;
        this.material = material;
        this.insulation = insulation;
        this.recyclable = recyclable;
        this.color = color;
        cap_type = capType;
        this.quantity = quantity;
        this.finish = finish;
        System.out.println("bottle Instance created");
    }

    public void bottleType(){
        System.out.println("My bottle color is "+color);
    }
    public void getBottle(){

    }
    public void setBottle(){

    }

}

class laptops{

    String brand;
    int ram;
    int hdd;
    int gpu;
    boolean touch_screen;
    String color;
    int Screen_resolution;
    int battery_health ;
    boolean keyboard_backlight;

    laptops(String brand, int ram, int hdd, int gpu, boolean touchScreen, String color, int screenResolution, int batteryHealth, boolean keyboardBacklight) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.gpu = gpu;
        touch_screen = touchScreen;
        this.color = color;
        Screen_resolution = screenResolution;
        battery_health = batteryHealth;
        keyboard_backlight = keyboardBacklight;
        System.out.println("laptops Instance created");
    }

    public void laptopBattery(){
        System.out.println("My battery health is "+battery_health);
    }
    public void getLaptop(){

    }
    public void setLaptop(){

    }


}

class phones {
    String brand;
    String memory;
    boolean wireless_charging;
    String Charging_port;
    String color;
    String Display_type;
    int battery_mah;
    String finish;

    phones(String brand, String memory, boolean wirelessCharging, String chargingPort, String color, String displayType, int batteryMah, String finish) {
        this.brand = brand;
        this.memory = memory;
        wireless_charging = wirelessCharging;
        Charging_port = chargingPort;
        this.color = color;
        Display_type = displayType;
        battery_mah = batteryMah;
        this.finish = finish;
        System.out.println("phones Instance created");
    }

    public void phone(){
        System.out.println("I'm using  "+brand);
    }
    public void getPhones(){

    }
    public void setPhones(){

    }


}



class fan{

    String material;
    String Size;
    boolean remote_connectivity;
    String color;
    int Number_of_blades;
    boolean High_speed;
    int power_source;
    int motor_speed;

    fan(String material, String size, boolean remoteConnectivity, String color, int numberOfBlades, boolean highSpeed, int powerSource, int motorSpeed) {
        this.material = material;
        Size = size;
        remote_connectivity = remoteConnectivity;
        this.color = color;
        Number_of_blades = numberOfBlades;
        High_speed = highSpeed;
        power_source = powerSource;
        motor_speed = motorSpeed;


        System.out.println("fan Instance created");

    }

    public void fans(){
        System.out.println("My fan has "+Number_of_blades);
    }
    public void getFan(){

    }
    public void setFan(){

    }

}

class chair{
    String material;
    String Size;
    boolean office_chair;
    String color;
    int legs;
    boolean arm_rest;
    String back_rest;

    chair(String material, String size, boolean officeChair, String color, int legs, boolean armRest, String backRest) {
        this.material = material;
        Size = size;
        office_chair = officeChair;
        this.color = color;
        this.legs = legs;
        arm_rest = armRest;
        back_rest = backRest;
        System.out.println("chair Instance created");
    }

    public void Chairs(){
        System.out.println("My chair has "+arm_rest);
    }
    public void getChair(){

    }
    public void setChair(){

    }

}

class Speaker {
    String Brand;
    int Power_rating;
    boolean Bluetooth_enabled;
    String color;
    int Volume_level;
    boolean Sub_woofers;
    double size;
    int warranty;

    Speaker(String brand, int powerRating, boolean bluetoothEnabled, String color, int volumeLevel, boolean subWoofers, double size, int warranty) {
        Brand = brand;
        Power_rating = powerRating;
        Bluetooth_enabled = bluetoothEnabled;
        this.color = color;
        Volume_level = volumeLevel;
        Sub_woofers = subWoofers;
        this.size = size;
        this.warranty = warranty;
        System.out.println("Speaker Instance created");
    }

    public void Speakers(){
        System.out.println("My Speaker size is "+size);
    }
    public void getSpeaker(){

    }
    public void setSpeaker(){

    }
}


class mattress {

    String Brand;
    boolean Spring_mattress;
    int Warranty;
    String color;
    boolean thickness;
    String material;
    String inStock;
    boolean firmness;


    mattress(String brand, boolean springMattress, int warranty, String color, boolean thickness, String material, String inStock, boolean firmness) {
        Brand = brand;
        Spring_mattress = springMattress;
        Warranty = warranty;
        this.color = color;
        this.thickness = thickness;
        this.material = material;
        this.inStock = inStock;
        this.firmness = firmness;
        System.out.println("Mattress Instance created");
    }
    public void Mattress(){
        System.out.println("My bed is from "+Brand);
    }
    public void getMattress(){

    }
    public void setMattress(){

    }
}


class Monitor {

    String brand;
    String model;
    int sizeInInches;
    int resolutionWidth;
    int resolutionHeight;
    String panelType;
    boolean isCurved;
    boolean isTouchscreen;
    String connectorType;
    double price;

    Monitor(String brand, String model, int sizeInInches, int resolutionWidth, int resolutionHeight, String panelType, boolean isCurved, boolean isTouchscreen, String connectorType, double price) {
        this.brand = brand;
        this.model = model;
        this.sizeInInches = sizeInInches;
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.panelType = panelType;
        this.isCurved = isCurved;
        this.isTouchscreen = isTouchscreen;
        this.connectorType = connectorType;
        this.price = price;
        System.out.println("Monitor Instance created");
    }


    public void monitor(){
        System.out.println("My monitor is from "+brand);
    }
    public void getMonitor(){

    }
    public void setMonitor(){

    }
}





public class Main {
    public static void main(String[] args) {
        // Initialize three car objects
        car car1 = new car("Sedan", "CarType1", 2022, 25000, "Gasoline", "Automatic", "ManufacturerA", 18, "LED bulbs");
        car car2 = new car("SUV", "CarType2", 2023, 35000, "Hybrid", "Automatic", "ManufacturerB", 20, "Xenon bulbs");
        car car3 = new car("Hatchback", "CarType3", 2021, 18000, "Electric", "Manual", "ManufacturerC", 16, "Halogen bulbs");
        // Initialize three objects nested class
        car.EngineType engine1 = car1.new EngineType(200, 4);
        car.EngineType engine2 = car2.new EngineType(300, 6);
        car.EngineType engine3 = car3.new EngineType(400, 8);


        // Initialize three table objects
        table table1 = new table("Dining", 72, 36, 30, "Wood", "Rectangular", "Four");
        table table2 = new table("Coffee", 42, 24, 18, "Glass", "Oval", "Three");
        table table3 = new table("Study", 60, 30, 29, "Metal", "Rectangular", "Four");

        // Initialize three bottle objects
        bottle bottle1 = new bottle("Water", "Plastic", true, true, "Blue", "Screw Cap", 16.9, "Matte");
        bottle bottle2 = new bottle("Sports", "Aluminum", false, true, "Red", "Flip Cap", 32.0, "Glossy");
        bottle bottle3 = new bottle("Juice", "Glass", false, false, "Green", "Cork", 25.4, "Transparent");

        // Initialize three laptops objects
        laptops laptops1 = new laptops("HP", 8, 512, 2, true, "Silver", 1920, 90, true);
        laptops laptops2 = new laptops("Dell", 16, 1024, 4, false, "Black", 2560, 95, true);
        laptops laptops3 = new laptops("Lenovo", 12, 256, 2, true, "Gray", 1920, 85, false);

        // Initialize three phones objects
        phones phone1 = new phones("Samsung", "128GB", true, "USB-C", "Black", "AMOLED", 4500, "Matte");
        phones phone2 = new phones("Apple", "256GB", true, "Lightning", "White", "Retina", 3500, "Glossy");
        phones phone3 = new phones("Google", "64GB", false, "USB-C", "Orange", "OLED", 5000, "Matte");

        // Initialize three fan objects
        fan fan1 = new fan("Plastic", "16 inches", true, "White", 3, true, 120,  4);
        fan fan2 = new fan("Metal", "18 inches", false, "Black", 5, false, 220,  5);
        fan fan3 = new fan("Plastic", "12 inches", false, "Gray", 4, true, 110,  6);

        // Initialize three chair objects
        chair chair1 = new chair("Leather", "Medium", true, "Black", 4, true, "Padded");
        chair chair2 = new chair("Wood", "Small", false, "Brown", 4, false, "None");
        chair chair3 = new chair("Fabric", "Large", true, "Gray", 5, true, "Adjustable");

        // Initialize three Speaker objects
        Speaker speaker1 = new Speaker("Sony", 50, true, "Black", 7, true, 12.0, 1);
        Speaker speaker2 = new Speaker("Bose", 30, true, "Silver", 5, false, 8.0, 2);
        Speaker speaker3 = new Speaker("JBL", 40, true, "Red", 6, true, 10.0, 3);

        // Initialize three mattress objects
        mattress mattress1 = new mattress("sleepWell", true, 2, "White", true, "cloth","available", true);
        mattress mattress2 = new mattress("peps", true, 3,"blue", false, "rubber", "unAvailable", true );
        mattress mattress3 = new mattress("CoirOn", true, 5, "red", true, "foam", "available", false);

        //Initialize three Monitors objects
        Monitor monitor1 = new Monitor("Dell", "S2719DGF", 27, 2560, 1440, "IPS", false, false, "DisplayPort", 349.99);
        Monitor monitor2 = new Monitor("ASUS", "VG279Q", 27, 1920, 1080, "IPS", true, false, "HDMI", 299.99);
        Monitor monitor3 = new Monitor("LG", "34GN850-B", 34, 3440, 1440, "Nano IPS", true, false, "USB-C", 899.99);



        car1.drivingCar();
        car2.drivingCar();
        car3.drivingCar();

        table1.tableLength();
        table2.tableLength();
        table3.tableLength();

        bottle1.bottleType();
        bottle2.bottleType();
        bottle3.bottleType();

        laptops1.laptopBattery();
        laptops2.laptopBattery();
        laptops3.laptopBattery();

        phone1.phone();
        phone2.phone();
        phone3.phone();

        fan1.fans();
        fan2.fans();
        fan3.fans();

        chair1.Chairs();
        chair2.Chairs();
        chair3.Chairs();

        speaker1.Speakers();
        speaker2.Speakers();
        speaker3.Speakers();

        mattress1.Mattress();
        mattress2.Mattress();
        mattress3.Mattress();

        monitor1.monitor();
        monitor2.monitor();
        monitor3.monitor();


    }
}
