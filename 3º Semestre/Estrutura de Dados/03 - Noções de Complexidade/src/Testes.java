public class Testes {
    public static void main(String[] args) {

    }
    
    public static int f1(int[] v, int x, int y) {
        if(x < y) {
        if(v[x] == 0) {
        return 1+f1(v, x+1, y);
        } else {
        return f1(v, x+1, y);
        }
        }
        else {
            if(x > y) {
            return f1(v, y, x);
            } else {
           
           return 0;
            }
            }
       }  
}

