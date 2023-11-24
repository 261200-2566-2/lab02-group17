import java.util.HashSet;
import java.util.Set;

public class Airpurifier extends Sensor{
    String brand = "Xiaomi";
    String model;
    String serialNo;
    boolean status; 
    String mode;
    String filterType; 

    private static int manufacturedCount = 0;//สมมติว่าโรงงานพึ่งเปิดตัว ยังไม่เคยผลิต
    private static Set<String> modelSet = new HashSet<>();

    Airpurifier(String model, String serialNo) {
        this.model = model;
        this.serialNo = serialNo;
        this.status = false; // เริ่มต้นเป็น off
        this.mode = "Auto"; // เริ่มต้นทำงานในโหมด Auto
        this.filterType = "Pleated Filter"; // ไส้กรองที่เอาไว้กรองpm2.5ปกติ
        this.temp = measureTemp();
        this.pmLevel = measurePM();
        manufacturedCount++;
        modelSet.add(model);
    }
    
    void turnOn() {status = true;}
    void turnOff() {status = false;}
    double powerConsumption() {
        double powerConsumption = 0.0;
        if(status == true){
            // calculate
            return powerConsumption;
        }
        return powerConsumption;
     }

    void changeMode(String modeNumber) {
        switch (modeNumber) {
            case "1":
                mode = "Sleep";
                break;
            case "2":
                mode = "Favorite";
                break;
            case "3":
                mode = "Auto";
                break;
        }
    }
    private static String mostPopularModel() {
        String mostPopularModel = null;
        for (String model : modelSet) {  }
        return mostPopularModel;
    }
    private static double argManufacturedCount() {
        double TotalArgManufacturedCount = 0.0;
        for (String model : modelSet) {  }
        return 0.0;
    }

    void getData(Airpurifier purifier1) {        
        System.out.println("===========================");
        System.out.println("Brand: " + purifier1.brand);
        System.out.println("Model: " + purifier1.model);
        System.out.println("Status: " + (purifier1.status ? "On" : "Off"));
        System.out.println("Mode: " + purifier1.mode);  
        System.out.println("Temperature: " + purifier1.temp + "°C");
        System.out.println("PM2.5 Level: " + purifier1.pmLevel );
        System.out.println("Filter Type: " + purifier1.filterType );
        System.out.println("===========================");
    }
}