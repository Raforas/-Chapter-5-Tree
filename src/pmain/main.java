package pmain;
import java.util.*;
import pmember.*;

class main extends LoginUsrPwd {

    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      LoginUsrPwd obj = new LoginUsrPwd();


        System.out.print("Are you a member? [y/n]:");
        char opt = scan.next().charAt(0);
            switch (opt) {
            case 'y' :

                obj.EnterUsrPwd();

            break;
            case 'n' :
                    System.out.println("nice");
            break;
            default:
            System.out.println("Wrong Input.");
            break;

        }
    }
}