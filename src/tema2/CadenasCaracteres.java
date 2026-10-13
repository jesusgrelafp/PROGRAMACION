package tema2;

public class CadenasCaracteres {

    static void main(String[] args) {

        int a = 1, b = 2, c = 3;
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println("a++ == 2 && c > b++ " + (a++ == 2 && c > b++));
        System.out.println("a= " + a +" b= " + b +" c: " + c);

/*
        boolean iguales = false;
        float nuevo = 2/3;	               //0
        iguales = nuevo == 2/3;	    //true
        System.out.println("iguales = nuevo == 2/3 "+iguales);

        iguales = nuevo == 2f/3f;	    //false
        System.out.println("iguales = nuevo == 2f/3f " + iguales);

        nuevo = 2f/3f;                  //0.6666667
        iguales = nuevo == 2/3;         //false
        System.out.println("iguales = nuevo == 2/3 " +iguales);
        iguales = nuevo == 2f/3f;       //true
        System.out.println("iguales = nuevo == 2f/3f " +iguales);
        iguales = nuevo == 0.6666667f;  //true
        System.out.println("iguales = nuevo == 0.6666667f " +iguales);
        iguales = nuevo == 0.6666666f;  //false
        System.out.println("iguales = nuevo == 0.6666666f " +iguales);
        iguales = nuevo == 0.66666666f; //true
        System.out.println("iguales = nuevo == 0.66666666f " +iguales);
        iguales = nuevo == 0.66666666d; //false
        System.out.println("iguales = nuevo == 0.66666666d " +iguales);
        iguales = nuevo == 0.6666666666666666d; //false
        System.out.println("iguales = nuevo == 0.6666666666666666d " +iguales);
        iguales = 2d/3d == 0.6666666666666666d; //true

        float _2f3f = 2f/3f;
        System.out.println("float  -  division 2f/3f: " + _2f3f);

        double _2d3d = 2d/3d;
        System.out.println("double -  division 2d/3d: " + _2d3d);

        System.out.println("iguales = 2d/3d == 0.6666666666666666d " +iguales);
*/

    }
}
