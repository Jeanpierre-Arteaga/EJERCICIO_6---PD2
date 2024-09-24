package PRACTICA_DOMICILIARIA_02.EJERCICIO_6;

public class PruebaReloj_3 {
    public static void main(String[] args) {
        //PRUEBAS DEL INCREMENTO DEL RELOJ
        RELOJ reloj3 = new RELOJ();
        //PRUEBA3 --> INCREMENTANDO EL TIEMPO HASTA QUE PASE LAS 23:59:59
        reloj3.setHoras(23);
        reloj3.setMinutos(59);
        reloj3.setSegundos(55);

        System.out.println("Tiempo iniciado en: "+ reloj3.mostrarTiempo());

        for(int i=0; i<15; i++){
            reloj3.incrementar();
            System.out.println("Tiempo despues de incrementar: "+ reloj3.mostrarTiempo());
        }
    }
}