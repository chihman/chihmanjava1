package labs;

public class lab01 {

    public static void task1860(String a) {
        System.out.println("Мы стремимся к " + a);
    }

    public static void task4764(String a) {
        System.out.println(a+" нас не остановят" );
    }
    public static void task7472(String a,String b ) {
        System.out.println(a + b);

    }
    public static void task7271(String a,String b ) {
        System.out.println("INSERT INTO points (x, y) \n VALUES" +" "+"('"+a+"'"+" ,"+"'"+b+"')");
           }
    public static void task2632(String a,String b,String c,String d ) {
        System.out.println("<circle cx="+a+" cy="+b+" r="+c+" fill="+d+"/>");
    }
    public static void task4343(String a, String b, String c, String d, String e);
    {
    System.out.println("User ID="+a+";Password="+b+"; Host="+c+";Port="+d+";Database="+e+";");}

    public static void task7474(String a, String b, String c);
    {
        System.out.println("Квадратное уравнение "+a+"*x*x + "+b+"*x + "+c+" = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = "+b+"*"+b+" - 4*"+a+"*"+c+"");}
}
