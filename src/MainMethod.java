public class MainMethod {
    public static void main(String[] args) {
        MainMethod.add(10,10);;
        MainMethod.sub(10,10);
        MainMethod.multiply(10,10);
        MainMethod.divide(10,10);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(b-a);
    }
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void divide(int a,int b){
        System.out.println(b/a);
    }
}
