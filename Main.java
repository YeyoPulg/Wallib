//Autor: Yessid Pulgarin [23/11/2023]
﻿
﻿/*Código escrito usando patrón de diseño "Facade" para proporcionar una interfaz simplificada a través de la clase "ShapeMaker".*/

interface Forma {
  void draw();
}
   
class Circulo implements Forma {
  @Override
  public void draw() {
    System.out.println("Dibujando Forma de Circulo");
  }
}
class Rectangulo implements Forma {
  @Override
  public void draw() {
  System.out.println("Dibujando Forma de Rectangulo");
  }
}
class Cuadrado implements Forma {
  @Override
  public void draw() {
    System.out.println("Dibujando Forma de Cuadrado");
  }
}

class ShapeMaker {
  private Circulo circulo;
  private Rectangulo rectangulo;
  private Cuadrado cuadrado;
 
  public ShapeMaker() {
    circulo = new Circulo();
    rectangulo = new Rectangulo();
    cuadrado = new Cuadrado();
  }
 
  public void drawCircle() {
    circulo.draw();
  }
  public void drawRectangle() {
    rectangulo.draw();
  }
  public void drawSquare() {
      cuadrado.draw();
  }
}

class FacadeDemo {
  public static void main(String[] args) {
   
    ShapeMaker shapeMaker = new ShapeMaker();
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
   
  }
}
