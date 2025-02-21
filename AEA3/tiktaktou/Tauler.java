package tiktaktou;
public class Tauler {

    private char [][] tauler;



    public Tauler(int mida){
        tauler = new char [mida][mida];
        InicialitzarTauler();
    }

    public void InicialitzarTauler(){
        for (int i = 0; i < tauler.length; i ++){
            for (int j = 0; j < tauler[i].length; j ++){
                tauler[i][j] = '-';
            }
        }
    }

    public void MostrarTauler(){
        for (int i=0; i<tauler.length; i++){
            for (int j=0; j<tauler[i].length; j++){
                System.out.print(tauler[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    

    public boolean marcarCasella(int fila, int columna, char jugadorActual) {
        if (tauler[fila][columna] == '-') {
            tauler[fila][columna] = jugadorActual;
            return true;
        } else {
            System.out.println("Casella ocupada, tria una altra. Passant torn per pringao");
            return false;
        }
    }



    public boolean haGuanyat(char jugador) {
        // Comprovar files i columnes
        for (int i = 0; i < tauler.length; i++) {
            boolean filaMirada = true;
            boolean columnaMirada = true;

            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] != jugador) {
                    filaMirada = false;
                }

                if (tauler[j][i] != jugador){
                    columnaMirada = false;
                }


            }

            if (filaMirada || columnaMirada) {
                return true;
            }
            
        }

        // Comprovar diagonals
        boolean diagonalMirada = true;
        boolean diagonalSecundariaMirada = true;

        for (int i = 0; i < tauler.length; i++){
            if (tauler[i][i] != jugador){
                diagonalMirada =  false;
            }

            if (tauler[i][tauler.length - 1 - i] != jugador){
                diagonalSecundariaMirada = false;
            }

        }

        if (diagonalMirada || diagonalSecundariaMirada) {
            return true;
        }

        return false;
    }


    
    









































    public boolean taulerPle() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    
}












