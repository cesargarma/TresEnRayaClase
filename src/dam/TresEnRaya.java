package dam;

public class TresEnRaya {

    //atributos de clase
    private int [][] tablero = new int [3][3];

    //constructor
    public TresEnRaya(){
        this.iniciar();
    }

    //Métodos
    private void iniciar(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] =0;
            }
        }
    }

    public void mostrar(){
        for (int i = 0; i < tablero.length; i++) {
            System.out.printf(" |");
            for (int j = 0; j < tablero[0].length; j++) {
                char car = ' ';
                switch(tablero[i][j]){
                    case 1: car = 'X'; break;
                    case 2: car = '0'; break;
                }
                System.out.printf(" %c ",car);
            }
            System.out.println(" |");
        }
    }

    public void jugar(){
        this.iniciar();
        for (int i = 0; i < 9; i++) {
            this.mostrar();
            turnoJugador();
        }
    }

    private void turnoJugador() {

    }
}
