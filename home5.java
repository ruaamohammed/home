
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class home5 {

    public static void main(String[] args)
    {
        home5 obj = new home5();
        List<Integer> list = new ArrayList<>();
        List.add(10);
        List.add(11);
        List.add(12);
        List.add(13);
        System.out.println(obj.getRandomElement(list));
    }
    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.getItemCount(rand.nextInt(list.size()));
    }
}
