public class arrayencontrar{
    public static void main(String[] args) {
       
            
        int[] arraynom = {12,3,45,-3,65,-5,88,99,2,23,54,33,27,53,96,0};
        int num_mayor = arraynom[0];
        int num_menor = arraynom[0];

        int media = 0;

        for(int num : arraynom){
            media += num;
            if (num < num_menor){
                num_menor = num;
            }if (num > num_mayor){
                num_mayor = num;
            }
        }
        
        System.out.println("Número mayor: "+ num_mayor);
        System.out.println("Número menor; "+ num_menor);
        
    }
}