/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialdelfinagorosito;

  abstract class Vehiculo{
  }
  abstract class aereo extends Vehiculo {
  }
  abstract class terrestre extends Vehiculo {
  }
  abstract class Maritimo extends Vehiculo {
  }

class Auto extends terrestre {
    private Motor motor;
    private Odometro odometro;
    private TanqueCombustible tanqueCombustible;
    
    public Auto (int capacidad){
        this.motor = new Motor();
        this.odometro= new Odometro();
        this.tanqueCombustible = new TanqueCombustible();
    }
    



    public void arrancarAuto() {
    }

    public void apagarAuto() {
    }

    public void avanzarAuto() {
    }
    class TanqueCombustible {
    private int capacidad;
    private double cantidad;

 public TanqueCombustible(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCantidadCombustible( int cantidad) {
        
    }

    public double getCantidadCombustible() {
        return cantidad;
    }

    public void agregarCombustible(double cantidad) {
    }
}

class Odometro {
    private int distanciaRecorrida = 0;

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distancia) {
    }
}
class Motor {
    private boolean encendido = false;

    public void encenderMotor() {
    }
    public void apagarMotor() {
    }

    public boolean getEnciendeMotor() {
        return encendido;
    }
}
}




