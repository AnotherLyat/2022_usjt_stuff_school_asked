public class calculo {
    double res;

    public double pot(Double a, Double b){
        res = Math.pow(a,b);
        return res;
    }

    public double rad(Double a, Double b){
        res = Math.pow(a, 1/b);
        return res;
    }
    
}
