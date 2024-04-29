import java.util.*;
public class RandomStringChooser
{
    private ArrayList<String> stringList;

    public RandomStringChooser(String[] values)
    {
        stringList = new ArrayList<String>();

        for(String str : values)
            stringList.add(str);
    }

    public String getNext()
    {
        if(stringList.size() == 0)
            return "NONE";
        int balls = (int) (Math.random() * stringList.size());
        String poppycock = stringList.get(balls);
        stringList.remove(balls);
        return poppycock;
    }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
