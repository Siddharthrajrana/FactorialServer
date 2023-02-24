import java.io.*;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client{

    public static void main(String[] args){

        try{
            System.out.println("Client Started ");
            Socket soc =new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter First number : ");
            int number = Integer.parseInt(userInput.readLine());
            System.out.println("Enter Second  number : ");
            int number2 = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(number);
            out.println(number2);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());
            System.out.println(in.readLine());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}