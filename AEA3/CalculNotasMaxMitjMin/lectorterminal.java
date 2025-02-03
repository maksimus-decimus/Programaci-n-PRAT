import java.util.Scanner;

public class lectorterminal {


    public double LeerDouble(){
        Scanner s = new Scanner(System.in);
        boolean noleido = true;

        while (noleido){
            if (s.hasNextDouble()){
                noleido = false;
                return s.nextDouble();
                
            }
            else{
                s.next();
            }
        }
        return 0;
    }
}
