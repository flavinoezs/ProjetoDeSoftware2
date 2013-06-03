package models;

import java.util.*;
import scala.util.Random;

public class Dado{

    public Random random = new Random();

    public int bet(){
          return Math.abs((random.nextInt() % 6) + 1);
    }
}
