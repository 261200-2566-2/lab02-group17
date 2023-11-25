public class Main{
        public static void main(String[] args) {
            // example
            Airpurifier purifier1 = new Airpurifier("Model1", "SN001");
            Airpurifier purifier2 = new Airpurifier("Model B", "SN002");
            Airpurifier purifier3 = new Airpurifier("Model A", "SN003");
            Airpurifier purifier4 = new Airpurifier("Model C", "SN004");
            Airpurifier purifier5 = new Airpurifier("Model A", "SN005");
            
            String popularModel = Airpurifier.mostPopularModel();
            System.out.println("The most popular model is: " + popularModel);
            
            System.out.println(purifier1.model);
            System.out.println(purifier1.status);
            purifier1.turnOn();
            System.out.println(purifier1.status);
            System.out.println(purifier1.mode);
            purifier1.getData(purifier1);
        }
}