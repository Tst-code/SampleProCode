package Programs;

import java.util.HashSet;
import java.util.Set;

public class CharArray
{
    public static void main(String[] args) {
        String str="A B ABCABC AB A B ";
        char []ch=str.toCharArray();
//        char []ch2={'A',' ','B',' ','A','B','C','A','B','C',' ','A','B',' ','A',' ','B',' '};

        usingLoop(ch);

    }

    static void usingLoop(char []ch)
    {
        int dupli=0;
        Set<Character> ht=new HashSet<Character>();
        for (int i=0; i<ch.length; i++)
        {
//            for (int j=i+1; j<ch.length; j++)
//            {
//                if (ch[i]==ch[j] && ch[i] !=' ') {
//                    dupli++;
//                }
//            }
            if (ht.add(ch[i])==false && ch[i] !=' ') {
                dupli++;
            }
        }
        System.out.println("usingLoop : Total duplicates = "+dupli);
    }
}
