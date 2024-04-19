package ex04;

public class Porta {
   String aberta, cor;
   double dimensaoX, dimensaoY, dimensaoZ;

   public Porta(String aberta, String cor, int dimensaoX, int dimensaoY){
       this.aberta = aberta;
       this.cor=cor;
       this.dimensaoX= dimensaoX;
       this.dimensaoY=dimensaoY;
       //this.dimensaoZ= dimensaoZ;
   }

   public void abre(){
       System.out.println("A porta está aberta");

   }
    public void fecha(){
        System.out.println("A porta está fechada");

    }
    public void pinta(double s, double a){
        double area = s*a;
        double tinta = area/2;
        System.out.println("litros de tinta necessarios: "+tinta);
    }

    public boolean statusAberta(){
        return false;
    }

}
