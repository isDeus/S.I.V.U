/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sivu;

/**
 *
 * @author Mauricio
 */
public class Venta {
    private int valor;
    private int codigo;
    private String nombre;
    
    public Venta(int valor, int codigo, String nombre){
        this.valor = valor;
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public int returnCodigo(){
        return this.codigo;
    }
    
    public String returnNombre(){
        return this.nombre;
    }
}