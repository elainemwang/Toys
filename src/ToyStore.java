//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
        

	public ToyStore()
	{
            
	}

	public void loadToys( String tn )
	{
            toyList.add(new Toy(tn));
	}
        
        public ArrayList<Toy> getList(){
            return toyList;
        }
        
        public void countToys(){
            int c = 0;
            for(Toy w : toyList){
                for (Toy o : toyList){
                    if (w.getName().equals(o.getName())){
                        c++;
                    }
                }
                w.setCount(c);
                c = 0;
            }

        }
  
  	public Toy getThatToy( String nm )
  	{
            for(Toy y : toyList){
                if (nm.equals(y.getName())){
                    return y;
                }
            }
            return null;
  	}
  
  	public String getMostFrequentToy()
  	{
            int max = toyList.get(0).getCount();
            String m = toyList.get(0).getName();
            for (int i = 1; i < toyList.size(); i++){
                if (toyList.get(i).getCount()>max){
                    max = toyList.get(i).getCount();
                    m = toyList.get(i).getName();
                }
            }
            return m;
  	}  
  
  	public void sortToysByCount()
  	{
            ArrayList<Toy> sorted = new ArrayList<Toy>();
            while (toyList.size()!=0){
                sorted.add(getThatToy(getMostFrequentToy()));
                toyList.remove(getThatToy(getMostFrequentToy()));
            }
            toyList.clear();
            for (Toy test : sorted){
                toyList.add(test);
            }
            
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}