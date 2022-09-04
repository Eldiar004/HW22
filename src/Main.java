import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> randomArr = new ArrayList<>();
        ArrayList<Integer> jupSandar = new ArrayList<>();
        ArrayList<Integer> takSandar = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            int r = random.nextInt(0,101);
            randomArr.add(r);
            if (r%2==0) {
                jupSandar.add(r);
            }else
                takSandar.add(r);
        }
        System.out.println("Random sandar:"+randomArr);
        System.out.println("Jup sandar:"+jupSandar);
        System.out.println("Tak sandar:"+takSandar);
    }
}