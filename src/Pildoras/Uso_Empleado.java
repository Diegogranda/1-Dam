package Pildoras;

import java.util.*;

public class Uso_Empleado {
}


    class Empleado{
        public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;

        sueldo=sue;

        GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);

        altaContrato=calendario.getTime();

        Id=IdSiguiente;
        IdSiguiente++;



        }

        public String getNombreId(){
            return "Nombre: " +nombre+ " Id: " +Id;
        }

        public double getSueldo(){
            return sueldo;
        }

        public Date getAltaContrato(){
            return altaContrato;
        }

        public void subeSueldo(double porcentaje){
            double aumento=sueldo*porcentaje/100;
            sueldo+=aumento;

        }

        private String nombre;
        private double sueldo;
        private Date altaContrato;
        private int Id=1;
        private static int IdSiguiente=1;

    }


