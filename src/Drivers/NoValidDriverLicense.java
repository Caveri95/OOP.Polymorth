package Drivers;

public class NoValidDriverLicense extends Exception {

    public NoValidDriverLicense(String message) {
        super(message);
    }
}
