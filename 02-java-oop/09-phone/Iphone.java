public class Iphone extends phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringtone, String string) {
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
    public void displayInfo(){

    }
}