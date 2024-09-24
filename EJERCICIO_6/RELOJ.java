package PRACTICA_DOMICILIARIA_02.EJERCICIO_6;

public class RELOJ {
    // ATRIBUTOS
    private int segundos;
    private int minutos;
    private int horas;

    // CONSTRUCTORES
    public RELOJ() {
        puestaACero();
    }

    // METODO PARA INCIALIZAR EL RELOJ EN 00:00:00
    public void puestaACero() {
        this.segundos = 0;
        this.minutos = 0;
        this.horas = 0;
    }

    //METODOS SETTERS
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

     public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        }
    }

    //METODOS GETTERS
    public int getSegundos() {
        return segundos;
    }


    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }

    // METODO PARA AUMENTAR LAS HORAS
    private void incrementarHoras() {
        horas=horas+1;
        if (horas == 24) {
            horas = 0; 
        }
    }
   
    // METODO PARA AUMENTAR LOS MINUTOS
    private void incrementarMinutos() {
        minutos=minutos+1;
        if (minutos == 60) {
            minutos = 0;
            incrementarHoras();
        }
    }

    // METODO PARA AUMENTAR LOS SEGUNDOS
    public void incrementarSegundos() {
        segundos=segundos+1;
        if (segundos == 60) {
            segundos = 0;
            incrementarMinutos();
        }
    }

    // METODO PARA IR AUMENTANDO EL TIEMPO
    public void incrementar(){
        incrementarSegundos();
    }

    // METODO PARA IR MOSTRANDO EL TIEMPO EN HORAS:MINUTOS:SEGUNDOS
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}