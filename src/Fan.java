public class Fan {
    double fanSpeed;
    String mode;

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
}
