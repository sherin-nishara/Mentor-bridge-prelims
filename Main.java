
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    String flower;
    int count;
    static String c;
    private static int roseP = 12;
    private static int lotusP = 10;
    private static int jasP = 42;
    
    static{
        System.out.println("----type exit when you done----");
    }
    Main(String flower, int count){
        this.flower = flower;
        this.count = count;
    }

    public static void calc(ArrayList<Main> flowers){
        System.out.println("---------------------------");
        for(Main s : flowers){
            switch(s.flower){
                case "rose":
                    System.out.println(s.flower + "  " + " count : " + s.count + " price : " + roseP*s.count);
                    break;
                case "lotus":
                    System.out.println(s.flower + "  " + " count : " + s.count + " price : " + roseP*s.count);
                    break;
                case "jasmin":
                    System.out.println(s.flower + "  " + " count : " + s.count + " price : " + roseP*s.count);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Main> flowers = new ArrayList<>();
        System.out.print("buy or exit ? ");
        String c = sc.nextLine();
        boolean ch = true;
        while(ch){
            System.out.print("Enter flower : ");
        String flower = sc.nextLine();
        System.out.print("how many : ");
        int count = sc.nextInt();
        sc.nextLine();
        Main f = new Main(flower,count);
        flowers.add(f);
        System.out.println("buy or exit ? ");
        c = sc.nextLine();
            if(c.equals("buy")){
            }
            else if(c.equals("exit")){
                calc(flowers);
                ch = false;
            }
        }
    }
}
