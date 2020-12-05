public abstract class phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringtone;
    protected static String unlockMethod;

    public phone(String versionNumber, int batteryPercentage, String carrier, String ringtone, String unlockMethod) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringtone = ringtone;
        phone.unlockMethod = unlockMethod;
}

    public void displayInfo(){

    }
    public String getVersionNumber() {
            return versionNumber;
        }
        public int getBatteryPercentage() {
            return batteryPercentage;
        }
        public String getCarrier() {
            return carrier;
        }
        public String getRingtone() {
            return ringtone;
        }
        public String getunlockMethod(){
            return unlockMethod;
        }
        public void setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
        }
        public void setBatteryPercentage(int batteryPercentage) {
            this.batteryPercentage = batteryPercentage;
        }
        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }
        public void setRingtone(String ringtone) {
            this.ringtone = ringtone;
        }
        public void setunlockMethod(String unlockMethod) {
            phone.unlockMethod = unlockMethod;
        }
}

