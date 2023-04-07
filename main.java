import java.util.Scanner;
import java.math.*;


class main{
    public static void input(){
        Scanner s = new Scanner(System.in);
        String input ="";
        input = s.nextLine();
    }
    public static void gen(){
        int min = 1;
        int max = 20;
        double randNum = Math.floor(Math.random() *(max - min + 1) + min);
        String word = "bark";
        String word2 = "Bork";
        String word3 = "Berk";
        for(int i=0; i<randNum; i++){
            System.out.print(word+" ");
            System.out.print(word+". ");
            System.out.print(word+", ");
            System.out.print(word2+" ");
            System.out.print(word2+". ");
            System.out.print(word2+", ");
            System.out.print(word3+" ");
            System.out.print(word3+". ");
            System.out.print(word3+", ");
        }
        System.out.println(".");
        System.out.println("");
    }
    public static void main(){
        System.out.println("Hi, this is DogGPT, ask anything and I will answer as a dog!");
        boolean running = true;
        while(running == true){
        input();
        gen();
    }
        
        
    }
}