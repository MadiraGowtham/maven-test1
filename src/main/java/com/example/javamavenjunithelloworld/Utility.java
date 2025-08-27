public class Utility {
    
    public static void Gowtham(){
        System.out.println("I am Gowtham");
    }
    public static String biggerNumber(int a, int b){
        if(a > b){
            return a + " is bigger";
        }
        else{
            return b + " is bigger";
        }
    }
    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        System.out.println(biggerNumber(a, b));
        Gowtham();
    }
}