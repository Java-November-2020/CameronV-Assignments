public class phoneTester {
    public static void main(String[] args) {
        
        Galaxy s9 = new Galaxy("S9", 99, "verizon", "Ring Ring Ring!", "unlocking via fingerprint");
        Iphone iphoneTen = new Iphone("x", 100, "AT&T", "Zing", "unlocking via facial recognition");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(iphoneTen.unlock());

    }
}