public class Program {
    public static void main(String[] args){
        Methods.task1860("знаниям");
        Methods.task1860("цели");
        Methods.task1860("результату");

        Methods.task4140("Бонд" , "Джеймс");
        Methods.task4140("Джек Воробей" , "капитан");
        Methods.task4140("Крюков" , "Александр");

        double result;
        result = Methods.task4411(11.13);
        System.out.printf("%.4f\n", result);
        result = Methods.task4411(-7919);
        System.out.printf("%.4f\n", result);
        result = Methods.task4411(0);
        System.out.printf("%.4f\n", result);

        double otvet;
        otvet = Methods.task2790(6997);
        System.out.printf("%.4f\n", otvet);

        double a;
        a = Methods.task3946(new int[]{9,8,9,1,1,5,1,1});
        System.out.printf("%.4f\n",a);

        boolean v =  Methods.task6291(13,14,17);
        if (v)
            System.out.println("");
    }
}
