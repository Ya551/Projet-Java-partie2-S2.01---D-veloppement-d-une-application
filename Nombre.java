public class Nombre extends Expression {
    
    private double valeurNombre;

    public Nombre(Nombre uneValeur){
        this.valeurNombre = uneValeur.getValeurNombre();
    }

    public Nombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    public double valeur (){
        return this.valeurNombre;
    } 
    
    public double getValeurNombre() {
        return this.valeurNombre;
    }
    
    public String toString() {
        return "" + this.valeurNombre + "";
    }
}