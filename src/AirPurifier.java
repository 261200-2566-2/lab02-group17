import java.util.HashSet;
import java.util.Set;

public class AirPurifier extends Sensor{
    String brand = "Xiaomi";
    String model;
    String serialNo;
    boolean status; 
    String mode;
    String filterType; 

    static int manufacturedCount = 0;//สมมติว่าโรงงานพึ่งเปิดตัว ยังไม่เคยผลิต
    static Set<String> modelSet = new HashSet<>();

    AirPurifier(String model, String serialNo) {
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

    // static String mostPopularModel() {
    //     String mostPopularModel = null;
    //     for (String model : modelSet) {  }
    //     return mostPopularModel;
    // }
    // static double argManufacturedCount() {
    //     double TotalArgManufacturedCount = 0.0;
    //     for (String model : modelSet) {  }
    //     return 0.0;
    // }

    public static void main(String[] args) {
        AirPurifier purifier1 = new AirPurifier("Model1", "SN001");
        
        purifier1.turnOn(); // เปิดเครื่อง เริ่มต้นตั้งเป็นปิดไว้
        purifier1.changeMode("3"); // เปลี่ยนโหมด ใช้หลักการสวิตเคส 1 คือ สลิป 2 คือ แบบบตั้งค่าเอง 3 คือ ออโต้
        
        System.out.println("===========================");
        System.out.println("Brand: " + purifier1.brand);
        System.out.println("Model: " + purifier1.model);
        System.out.println("Status: " + (purifier1.status ? "On" : "Off"));
        System.out.println("Mode: " + purifier1.mode);  
        System.out.println("Temperature: " + purifier1.temp + "°C");
        System.out.println("P.M. 2.5 Level : " + purifier1.pmLevel );
        System.out.println("PM2.5: " + String.format("%03d", 1));
        System.out.println("===========================");
    }
}
