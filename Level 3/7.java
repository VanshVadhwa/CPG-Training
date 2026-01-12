public class OTPGenerator {

    public static int generateOTP() {
        // Random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        System.out.println("Generating 10 OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (areUnique(otps)) {
            System.out.println("Success: All OTPs are unique.");
        } else {
            System.out.println("Fail: Duplicate OTPs found.");
        }
    }
}