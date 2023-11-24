public class Sensor {
    double temp;
    int pmLevel; //ค่าpmมีค่าเป็นจำนวกเต็ม

    double measureTemp(){
        //รับค่าจากsensor
        return temp;
    }
    int measurePM(){
        //รับค่าจากsensor
        return pmLevel;
    }
}