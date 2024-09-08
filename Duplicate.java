public class Duplicate {
    void Dupfunc(String str, int idx , StringBuilder newstr, boolean map[])
    {
        //base case
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }

        // kaam
        char currentchar = str.charAt(idx);
        if(map[currentchar-'a']==true)
        {
            //duplicate 
            Dupfunc(str, idx+1, newstr, map);
        }

        else
        {
            map[currentchar-'a'] = true;
            Dupfunc(str, idx+1, newstr.append(currentchar), map);
        }
    }
    public static void main(String[] args) {
        Duplicate obj = new Duplicate();
        String str = "sannidhyasharma";
        obj.Dupfunc(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
