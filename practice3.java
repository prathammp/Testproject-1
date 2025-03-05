public class practice3{
    public static void main(String[] arr){
        String name = "pratham";
        String reverse ="";
        for(int i=name.length()-1;i<=0;i--){
                reverse+=name.charAt(i);
        }
        System.out.println(reverse);
    }
}
