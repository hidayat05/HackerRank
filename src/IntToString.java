import java.security.Permission;
import java.util.Scanner;

/**
 * @owner hidayat
 * @since 11/29/16.
 */
public class IntToString {

    public static void main(String[] args) {
        DoNotterminate.forbidExit();

        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            String s = Integer.toString(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }


        } catch (DoNotterminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }

    }

}

class DoNotterminate {

    public static class ExitTrappedException extends SecurityException {
        private static final long serialVerionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                if (perm.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
