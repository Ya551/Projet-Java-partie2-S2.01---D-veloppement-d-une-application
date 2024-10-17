public class Division extends Operation {
   
    public Division(Expression op1, Expression op2){
        super(op1, op2);
    }

    public double valeur(){
        return this.getOperande1().valeur() / this.getOperande2().valeur();
    }

    public String toString(){
       String resultat = "(" + getOperande1() + "/" + getOperande2() + ")";
        return resultat;
            
    }
}