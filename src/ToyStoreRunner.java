//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
            ToyStore mart = new ToyStore();
            mart.loadToys("Gi Joe");
            mart.loadToys("Gi Joe");
            mart.loadToys("Gi Joe");
            
            mart.loadToys("Doc");
            mart.loadToys("Doc");
            mart.loadToys("Gi Joe");
            mart.loadToys("Gi Joe");
            mart.loadToys("Gi Joe");
            mart.loadToys("Doc");
            mart.loadToys("Doc");
            
            mart.loadToys("Doc");
            mart.loadToys("Doc");
            
            mart.loadToys("Doc");
            mart.loadToys("Doc");
            
            mart.loadToys("car");
            
            mart.countToys();
            
            System.out.println(mart.getThatToy("Doc").getCount());
            System.out.println(mart.getThatToy("Gi Joe").getCount());
            System.out.println(mart.getMostFrequentToy());
            
            mart.sortToysByCount();
            
            System.out.println(mart);
	}
}