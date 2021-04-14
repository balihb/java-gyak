

import java.util.HashMap;
import java.util.Collections;

class MultiSet
{
    private HashMap<String, Integer> data;

    public MultiSet()
    {
        data = new HashMap<String, Integer>();
    }

    public MultiSet(HashMap<String, Integer> initialData)
    {
        data = new HashMap<String, Integer>(initialData);
    }

    public HashMap<String, Integer> getData()
    {
        //return data;
        return new HashMap<String, Integer>(data);
    }

    public void put(String item)
    {
        if (data.containsKey(item))
        {
            int mult = data.get(item) + 1;
            data.replace(item, mult);
        }
        else
        {
            data.put(item, 1);
        }
    }

    public MultiSet intersect(MultiSet other)
    {
        HashMap<String, Integer> resultData = new HashMap<String, Integer>();
        for (String key : data.keySet())
        {
            if (other.data.containsKey(key))
            {
                resultData.put(key, Math.min(data.get(key), other.data.get(key)));
            }
        }
        return new MultiSet(resultData);
    }
};

class Main
{
    public static void main(String[] args)
    {
        MultiSet set1 = new MultiSet();
        set1.put("java");
        set1.put("java");
        set1.put("javascript");
        set1.put("c++");
        System.out.println("set1 = " + set1.getData());

        MultiSet set2 = new MultiSet();
        set2.put("java");
        set2.put("python");
        set2.put("python");
        set2.put("c++");
        set2.put("java");
        set2.put("c++");
        set2.put("bash");
        System.out.println("set2 = " + set2.getData());

        MultiSet intersect = set1.intersect(set2);
        System.out.println("intersect = " + intersect.getData());

        HashMap<String, Integer> intersectData = intersect.getData();
        intersectData.put("rust", 10);
        System.out.println("intersectData = " + intersectData);
        System.out.println("intersect = " + intersect.getData());
    }
}

