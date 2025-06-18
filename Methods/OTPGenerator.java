import java.util.HashSet;

public class OTPGenerator {

    public static void main(String[] args) {

        // Create an array to hold 10 OTPs
        int[] otps = new int[10];

        // Generate 10 unique OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Validate uniqueness of the generated OTPs
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique: " + java.util.Arrays.toString(otps));
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }

    // Method to generate a random 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a 6-digit number
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) { // If add returns false, it means the OTP is a duplicate
                return false;
            }
        }
        return true;
    }
}