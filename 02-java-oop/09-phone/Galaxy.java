public class Galaxy extends phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone, String string) {
        super(versionNumber, batteryPercentage, carrier, ringtone, unlockMethod);
    }

    @Override
    public String ring() {
        return getRingtone();

    }
    @Override
    public String unlock() {
        return getunlockMethod();
    }
    @Override 
    public void displayInfo() {

    }
}