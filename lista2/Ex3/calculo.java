public class calculo {
    double res;

    public double pot(Double a, Double b){
        res = Math.pow(a,b);
        return res;
    }
    public double pot(String a, String b){
        res = Math.pow(Double.parseDouble(a), Double.parseDouble(b));
        return res;
    }

    public double rad(Double a, Double b){
        res = Math.pow(a, 1/b);
        return res;
    }
    public double rad(String a, String b){
        res = Math.pow(Double.parseDouble(a), 1/Double.parseDouble(b));
        return res;
    }
    
}
