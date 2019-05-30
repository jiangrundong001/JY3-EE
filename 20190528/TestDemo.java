package Test;

import java.util.Random;
import java.util.UUID;


public class TestDemo {



    public static void main(String[] args) {
        for (int i=0;i<100;i++)
        {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }

    }
}
