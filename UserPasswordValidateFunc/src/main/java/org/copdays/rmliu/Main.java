package org.copdays.rmliu;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String plainPassword = "myPassword123456";
        String userId = "user-98527";
        String securePassword = PasswordUtils.generateSecurePassword(plainPassword, userId);

        boolean passwordMatch = PasswordUtils.checkPW(userId, plainPassword, securePassword);

        if (passwordMatch) {
            System.out.println("Provided user password " + plainPassword + " is correct.");
        } else {
            System.out.println("Provided user password is incorrect!");
        }
    }
}
