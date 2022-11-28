package pmember;

import java.lang.Exception;
import java.util.Scanner;

abstract class Member{
abstract public void EnterUsrPwd();

}

  class error extends Exception {
            error(String message){

                System.out.println(message);
            }

    }

public class LoginUsrPwd extends Member
{
  Scanner scan = new Scanner(System.in);
  String username;
  String password;
  
  public LoginUsrPwd()
  {//constructor for initial username and pwd
    this.username="abc";
    this.password="123";
  }
  
  public void EnterUsrPwd()
  {  
    
    for (int i = 3; i > 0; i--) {
        
   
    System.out.print("Enter Username: ");
    String Usrname=scan.next();
    System.out.print("Enter Password: ");
    String Passwd=scan.next();
    System.out.println("");
    
  
    try{
    if(Usrname.equals(username)&&Passwd.equals(password))
      {
      System.out.println("   Welcome "+username);
      System.out.println("");
      break;
      }
    else 
      {

            throw new error("WONG");

    }}catch(Exception e){
        if(i!=1){
            System.out.println("try again");
        }
        else{
            System.out.println("Account Locked");
        }
    }
    }
  }
}  

