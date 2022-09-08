import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        // Your code here!
        Vehiculo ferrari = new Vehiculo("rojo", 222);
        Vehiculo audi = new Vehiculo();
        //ferrari.setColor("rojo");
       // ferrari.numeroMotor = 3883;
        System.out.println("numero de motor: " + ferrari.numeroMotor);
        System.out.println("numero de motor audi: " + audi.numeroMotor);
        System.out.println("color: " + ferrari.getColor());
    }
}


class Vehiculo {
    
    private String color;
    String marca;
    private int modelo;
    double cilindraje;
    protected int numeroMotor;
    int capacidad;
    String tipo;
    boolean esElectrico;
    
    Vehiculo(){
        this.numeroMotor = 111;
    }
    
    Vehiculo(String color){
        this.color = color;
    }
    
    Vehiculo(String color, int numeroMotor){
        this.color = color;
        this.numeroMotor = numeroMotor;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    private double acelerar(double velocidadInicial, double velocidadFinal, double tiempo){
        double deltaVelocidad, aceleracion;
        deltaVelocidad = velocidadFinal - velocidadInicial;
        aceleracion = deltaVelocidad / tiempo;
        return aceleracion;
    }
    
}
