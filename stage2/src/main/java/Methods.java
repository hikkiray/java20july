import sun.plugin.javascript.navig.Array;

public class Methods {
    public static void task1860 (String str){
        System.out.println("Мы стремимся к"+ str);
    }
    public static void task4140(String LastName, String FirstName){
        System.out.println("Меня зовут " + LastName + ", "+ FirstName + " " + LastName );
    }
    public static double task4411(double x){
        double r;
        r = x + 7;
        return r;
    }
    public static double task2790(double xDeg){
        double rad = Math.toRadians(xDeg);
        double arg = 1 - Math.pow(Math.sin(rad), 2);
        double q = Math.sqrt(arg);
        return q;
    }
    public static double task3946(int[] arr ){
        double result = 0;
        for (int i = 0; i <arr.length ; i++) {
            result += arr[i];
        }
        return result/arr.length;
    }
    public static void task9774(double m , double [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * m;
        }
    }

    public static boolean task6291(int a, int b, int c){
        boolean rav = false;
       if (a == b || a == c)
           rav = true;
       if (b == c)
           rav = true;
       return rav;
    }
}
