package PRACTICA_DOMICILIARIA_02.EJERCICIO_6;

public class PruebaReloj_2 {
    public static void main(String[] args) {
        // PRUEBAS DEL INCREMENTO DEL RELOJ
        RELOJ reloj2 = new RELOJ();

        // PRUEBA2 --> INDICANDO DESDE DONDE INICIAR HASTA DONDE TERMINAR 
        // (le damos 10 segundos)
        reloj2.setHoras(10);
        reloj2.setMinutos(59);
        reloj2.setSegundos(56);

        System.out.println("Tiempo iniciado en: "+ reloj2);

        for(int i=0; i<10; i++){
            reloj2.incrementar();
            System.out.println("Tiempo despues de incrementar: "+ reloj2);
        }
    }
}
