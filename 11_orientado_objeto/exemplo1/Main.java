public class Main {
    int x = 5;
    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj2 = new Main();
        myObj.x = 10;
        myObj2.x = 20;        
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }
}
