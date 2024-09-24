package PRACTICA_DOMICILIARIA_02.EJERCICIO_6;

public class PruebaReloj_1 {
    public static void main(String[] args) {
        //PRUEBAS DEL INCREMENTO DEL RELOJ
        RELOJ reloj1 = new RELOJ();
        //PRUEBA1
        // SE AUMENTA EL TIEMPO DESDE 00:00:00, 
        // LLEGA A 23:59:59 Y TERMINA EN 00:00:00
        for (int i = 0; i < 86401; i++) {  
            System.out.println(reloj1);
            reloj1.incrementar();
        }
    }
}