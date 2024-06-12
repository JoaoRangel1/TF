import java.util.Scanner;
public class Carro
{
    Scanner in = new Scanner (System.in);
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String estado;
    private boolean dis;
    private int idade;
    
    public Carro(String marca, String modelo, int ano, String placa, String estado, boolean dis){

        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.placa=placa;
        this.estado=estado;
        this.dis=dis;
        
    }
    
    public String marca ( ){
        return this.marca;
    }
    
    public String modelo(){
        return this.modelo;
    }
    
    public int ano(){
        return this.ano;
    }
    
    public String placa (){
        return this.placa;
    }
    
    public String estado (){
        return this.estado;
    }
    
    public boolean dis (){
        return this.dis;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo ( ){
        return this.modelo;
    }
    
    public int getAno ( ){
        return this.ano;
    }
    
    public String getplaca(){
        return this.placa;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public boolean getDis(){
        return this.dis;
    }
    
    
    
    public void setMarca(){
         this.marca=marca;
    }
    
    public void setModelo ( ){
        this.modelo=modelo;
    }
    
    public void setAno ( ){
        this.ano=ano;
    }
    
    public void setplaca(){
        this.placa=placa;
    }
    
    public void setEstado(){
        this.estado=estado;
    }
    
    public void setDis(){
        this.dis=dis;
    }
    
    
    
    //a) Retornar a string “Disponível” ou “Indisponível”, caso contrário.
    
    public boolean estarDisp(){
        if(in.next().equalsIgnoreCase("Sim")){
            dis= true;
        }else{
            dis= false;
        }
        return dis;
    }
    
    public int retornaIdade(){
        idade=2024-ano;
        return idade; 
        // return 2024-idade;
    }
    
    public String estadinho(String estadinho){
        if (estado.equalsIgnoreCase("bom")){
            this.estado="Médio";
        }
        if (estado.equalsIgnoreCase("médio")){
            this.estado="Ruim";
        }
        if (estado.equalsIgnoreCase("Ruim")){
            this.estado="Quebrado";
        }
        return this.estado="Quebrado";
        
    }
    
    
    }