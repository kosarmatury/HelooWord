import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        String[] names=new String[10];

        GetNames(10);


    }

    static String[] GetNames(int n){
        Scanner scanner=new Scanner(System.in);

        String[] temp = new String[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("plese enter namme[" + i + "]");
            temp[i]=scanner.next();
        }
        return temp;

    }
}