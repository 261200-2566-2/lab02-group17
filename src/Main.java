public class Main{
        public static void main(String[] args) {
            // example
            Airpurifier purifier1 = new Airpurifier("Model1", "SN001");
            System.out.println(purifier1.model);
            System.out.println(purifier1.status);
            purifier1.turnOn();
            System.out.println(purifier1.status);
            System.out.println(purifier1.mode);
            purifier1.getData(purifier1);
        }
}