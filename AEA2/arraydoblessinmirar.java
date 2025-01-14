public class arraydoblessinmirar{
    public static void main(String[] args) {

    int lenz = 50;
    int [] ARREGLOSdoble = new int [lenz];
    int [] ARREGLOSsenares = new int [lenz];
    int [] ARREGLOSreverso = new int [lenz];
    int [] total = new int [lenz*2];
    int [] totalarreglo = new int [lenz];
    int [] totalarreverso = new int [lenz];
    int [][] matriz = new int [lenz/5][lenz/5];


    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            matriz[i][j] = i*20 + j*2;
            System.out.print(matriz[i][j] + " ");
        } System.out.println();
    }System.out.println();
    
    System.out.println("TOTAL");
    for (int i = 0; i < totalarreglo.length; i++){
        ARREGLOSsenares[i] = (i * 2)+1;
        ARREGLOSdoble[i] = i * 2;
        ARREGLOSreverso[i] = ARREGLOSreverso.length * 2 - (i * 2) - 2;
       
        totalarreglo[i] = ARREGLOSdoble[i] + ARREGLOSsenares[i];
        totalarreverso[i] = ARREGLOSdoble[i] + ARREGLOSsenares.length * 2 - (i * 2) - 1;
        System.out.print(totalarreverso[i] + " ");
    }
    
}
}