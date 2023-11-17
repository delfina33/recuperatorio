/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialdelfinagorosito;

  abstract class Computadora{
      private Sistema sistema;
      private Monitor monitor;
      private Mouse  mouse;
      private Teclado teclado;
      
      public Computadora (){
          this.sistema = new Sistema ();
          this.monitor = new Monitor ();
          this.mouse = new Mouse ();
          this.teclado = new Teclado();      
      }
    public void encenderPc(){
        System.out.println("se encendió la pc");
    }
    public void apagarPc (){
        System.out.println("se apago la pc");
    }
 
  //
  //
  //monitor
      
 class Monitor {
    private String fabricante;
    private String modelo; 
    private String caracteristicas;
    
 public Monitor (String fabricante,String modelo, String caracteristicas){
     this.fabricante = fabricante;
     this.modelo= modelo;
     this.caracteristicas= caracteristicas;}
    
 public void setFabricante (String fabricante){
     this.fabricante= fabricante;
 }
 public String getFabricante (){
     return fabricante;
 }
 public void setModelo (String modelo){
     this.modelo= modelo;
 }
 public String getModelo (){
     return modelo; 
 }
 public void setCaracteristicas (String caracteristicas){
     this.caracteristicas= caracteristicas;
 }
 public String getCaracteristicas(){
     return caracteristicas;
 }
 public void encenderMonitor(){
        System.out.println("se encendió el monitor");
    }
    public void apagarMonitor (){
        System.out.println("se apago el monitor");
    }
 //
 //
 //mouse 
  class Mouse {
    private String fabricante;
    private String modelo;
    private String caracteristicas;
 
 public Mouse (String fabricante,String modelo, String caracteristicas){
     this.fabricante = fabricante;
     this.modelo = modelo;
     this.caracteristicas= caracteristicas;}
    
    
  public void setFabricante (String fabricante){
      this.fabricante= fabricante;
  }
  public String getFabricante (){
      return fabricante;
  }
  public void setModelo (String modelo){
      this.modelo= modelo;
  }
  public String getModelo (){
      return modelo;
  }
  public void setCaracteristicas(String caracteristicas){
      this.caracteristicas= caracteristicas;
  }
  public String getCaracteristicas (){
      return caracteristicas;
  }
  public void clicDerecho(){
        System.out.println("clic derecho");
    }
    public void clicIzquierdo (){
        System.out.println("clic izquierdo");
    }
  //
  //
  //sistema
  class Sistema {
    private Motherboard placa;
    private Procesador procesador;
    private Memoria memoria;
    private Disco disco;
    
 public  Sistema (String fabricante1, fabricante2, fabricante3, fabricante4, String modelo1, modelo2, modelo3, modelo4, String caracteristicas1, caracteristicas2, caracterista3, caracterista4, int capacidad1, capacidad2){
     this.placa= new Motherboard(fabricante1,modelo1, caracteristicas1);
     this.procesador= new Procesador(fabricante2,modelo2, caracteristicas2);
     this.memoria= new Memoria(fabricante3, modelo3, caracteristicas3, capacidad1);
     this.disco = new Disco (fabricante4, modelo4, caracteristicas4, capacidad2);
 }
 public void encenderSistema(){
        System.out.println("el sistema se encendió");
    }
    public void apagarSistema (){
        System.out.println("el sistema se apagó");
    }
 //
 //
 //teclado
public class Teclado {
    private String fabricante;
    private String modelo;
    private String caracteristicas;
    
 public Teclado (String fabricante,String modelo, String caracteristicas){
     this.fabricante = fabricante;
     this.modelo = modelo;
     this.caracteristicas= caracteristicas;
 }
 public void setFabricante (String fabricante){
     this.fabricante= fabricante;
 }
 public String getFabricante (){
     return fabricante;
 }
 public void setModelo (String modelo){
     this.modelo= modelo;
 }
 public String getModelo (){
     return modelo; 
 }
 public void setCaracteristicas (String caracteristicas){
     this.caracteristicas= caracteristicas;
 }
 public String getCaracteristicas(){
     return caracteristicas;
 }
 public void TomarBuffer(){
        System.out.println("....");
    } 

}

 
 
 