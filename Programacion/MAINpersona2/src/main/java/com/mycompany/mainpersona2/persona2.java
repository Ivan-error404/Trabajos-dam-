package com.mycompany.mainpersona2;

public class persona2 {
    private  String nombre; 
    private int edad = 60;
    private String sexo;
    private int peso = 50;
    private String estado ;
    
    public persona2 (String nombre ,int edad ,String sexo ,int peso,String estado ){
            
                    this.nombre = nombre;
                    this.edad = 0;
                    this.sexo = sexo ; 
                    this.peso =0;
                    this.estado = estado ;
                   
            
    }

    persona2(String a_, String a_0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        //Metodos 
    public void añadirKg (int gordo){
    
        peso +=gordo ;
    
    }   
    
    public void QuitarKg (int hambre){
        if (peso - hambre <0){
            peso =0;
        }else{
            peso -=hambre;
        }
    }
    public void añadirAños (int viejo){
    
        edad += viejo ;
    
    }   
    
    public void QuitarAños (int bebe){
        if (edad - bebe <0){
            edad =0;
        }else{
            edad -= bebe;
        }   
    } 
    
    public void info() {
        System.out.print("Nombre:" +nombre);
        System.out.print("   Peso: "+ peso);
        System.out.print("   Edad: " +edad);
        System.out.print("   Sexo:" +sexo);
        System.out.println("   Estado: " +estado);
    
    }
}