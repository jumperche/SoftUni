package Uni;

public class Task12 {
    public static void main(String[] args) {
        String[][] userpass = { {"User1", "pass1", "quest1"}, {"User2", "pass2", "quest2"}, { "User3", "pass3", "quest3" } };
        System.out.println(userpass.length);
        System.out.println(userpass[0].length);
        for (int i = 0; i < userpass.length; i++) {
            for (int j = 0; j < userpass[0].length; j++) {
                System.out.print(userpass[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
