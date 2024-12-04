public class canviavalorsmatriu {
    public static void main(String[] args) {
        
    int [][] matriuParells = new int[10][10];

    for(int i = 0;i<matriuParells.length;i++){
        for(int j = 0;j<matriuParells[i].length;j++){

            if (i % 2 == 0 && j % 2 == 0)
                matriuParells[i][j] = 1;
           
            else if (i % 2 == 0 && j%2!=0)
                matriuParells[i][j] = 2;

            else if (i%2!=0 && j%2 == 0)
                matriuParells[i][j] = 3;

            else
                matriuParells[i][j] = 4;
                System.out.println("Posición" + i + " " + j + " de la matriz matriuParells es: " + matriuParells[i][j]);   
            } 
            System.out.println("Fila " + i + " está llena");
            System.out.println();
        
        }




    }             
}
