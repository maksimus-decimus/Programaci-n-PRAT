public class arraysejercicios{
    public static void main(String[] args) {
       
            
        int[][] arrayparells = new int [12][5];
        int reves = arrayparells.length * arrayparells[0].length - 1;
        

        for (int i = 0; i < arrayparells.length; i++ ){

            for (int j = 0; j < arrayparells[i].length; j++){
                arrayparells[i][j] = reves;
                reves--;
               
                System.out.print(arrayparells[i][j] + "\t");
               
            } System.out.println();
    
        }
       
    }
}