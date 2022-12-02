import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer>num = new ArrayList();
        ArrayList<Integer>number1 = new ArrayList();
        ArrayList<Integer>number2 = new ArrayList();

        for (int i = 0; i < 50 ; i++) {
            int ran = random.nextInt(1,100);
            num.add(ran);
            if(ran % 2 == 0){
                number1.add(ran);
            }else {
                number2.add(ran);
            }

        }System.out.println(num);
        System.out.println("jup san="+number1);
        System.out.println("tak san="+number2);
    }
}
