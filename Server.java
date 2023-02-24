import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;

public class Server {

    public static void main(String[] args ){

        try{
            System.out.println("Waiting For Client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Estsblished ");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(in.readLine());
            int number2 = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Factorial of "+number+" is :  "+calculateFactorial(number));
            out.println("Sum of "+number + " and "+number2+" is "+add(number,number2));
            out.println("Difference of "+number + " and "+number2+" is "+sub(number,number2));
            out.println("Multiplication of "+number + " and "+number2+" is "+multiply(number,number2));
            out.println("Division of "+number + " and "+number2+" is "+divison(number,number2));


        }
        catch(Exception  e){
            e.printStackTrace();
        }
    }

    static int sub(int number ,int number2){
        return number-number2;
    }

    static int add(int number,int number2){
        return number+number2;
    }

    static int multiply(int number,int number2){
        return number*number2;
    }

    static int divison(int number,int number2){
        return number/number2;
    }

    
    static int calculateFactorial(int number){

        int fact = 1;
        for(int i=1 ; i<=number ; i++ ){
            fact = fact*i;
        }
        return fact;

    }

}
