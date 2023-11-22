
public class Airpurifier {
    String brand = "Xiaomi";
    String model;
    String serialNo;
    boolean status; // on or off

    void turnOff() {status = false;}
    void turnOn() {status = true;}
    double powConsump() {};

    static int manufacCount; // ผลิตไปกี่ชิ้น
    static String modelCount;// มีรุ่นอะไรบ้างที่ผลิต
    static String mostPopModel() {}; // รุ่นที่นิยมสุด
    static double averageModel() {};// ค่าเฉลียแต่ละรุ่น

    Airpurifier(String  model, String  serialNo){
        this.model = model;
        this.serialNo = serialNo;
    }


    public static void main(String[] args) {

    }
}