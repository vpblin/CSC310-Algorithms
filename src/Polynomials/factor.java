package Polynomials;

public class factor {

    static double g, f, h , j;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        double a = 4, b = 6, c = 2;
        double x1 = -1;
        double x2 = 2;
        for (int i = 1; i <= a; i ++){
            for (int ii = 0; ii >= c; ii ++){
                if (((x1 * i) + ii) == 0){
                    f = i;
                    h = ii;
                }
                for (int n = 1; n<=a; n++){
                    for (int nn = 0; nn >= c; nn--){
                        if (((x2 * i)+nn)==0 && nn * ii == -8 && i * n == a){

                            g = n;
                            j = nn;

                            System.out.println("("+f+"x + "+h+") ("+g+"x + "+j+")");

                        }

                    }

                }

                 

            }

       }

    }
}
