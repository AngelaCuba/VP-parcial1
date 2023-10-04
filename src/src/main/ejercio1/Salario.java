package main.ejercio1;

public class Salario {

    double salarioMinimo=2000;
    public double descuento(double sueldo) throws Exception{
        if(sueldo<0){
            throw Exception(" Esta accion no puede ser realizada");
        }
        double descuento=0;
        if(sueldo>(salarioMinimo*2)){
            descuento=sueldo*15/100;
        } else if(sueldo > salarioMinimo){
            descuento=sueldo*5/100;
        }
        return sueldo-descuento;
    }
}
