import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S_InputBufferedReader {
    public static void main(String[] args) throws IOException{
        InputStreamReader key =new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.println("What is your name? : ");
        String name = input.readLine();
        System.out.println("My name is " + name);
    }
}
