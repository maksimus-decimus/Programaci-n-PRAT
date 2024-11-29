public class Matricesejemploparells {
    public static void main(String[] args) {
        
    int [][] matriuParells = new int[10][10];

    for(int i = 0;i<matriuParells.length;i++){
        for(int j = 0;j<matriuParells[i].length;j++){
            if (i % 2 == 0 && j % 2 == 0){
                matriuParells[i][j] = -1;
                System.out.println("La posició i= "+ i +" i la posició j= " + j + " es " + matriuParells[i][j]);
                System.out.println(matriuParells[i][j]);

            } else{
                matriuParells[i][j] = i;
                System.out.println("La posició i= " + i + " i la posició j= " + j + " es "+ matriuParells[i][j]);
                System.out.println(matriuParells[i][j]);
            }
        }
    }
    







        
    }
}
