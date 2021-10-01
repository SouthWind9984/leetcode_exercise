package LeetCode_ADailyTopic;

public class Lt_224 {
    public static void main(String[] args) {
        String s ="(5-(1+(5)))";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        s =s.replaceAll("[\\s/g]","");
        if(s.length()==0)
            return 0;
        if(s.charAt(0)!='-')
            s="+"+s;
        char sign = ' ';
        while(s.indexOf('(')!=-1){
            int end = s.indexOf(')');
            int start = s.lastIndexOf('(',s.indexOf(')'));
            String str = s.substring(start+1,end);
            sign=s.charAt(start-1);
            int tmp = yunsaun(str);
            String ss = ""+(sign=='-'?tmp*-1>0?"+"+tmp*-1:tmp*-1:"+"+tmp);
            if(ss.equals("0"))
                ss="";
            s=s.substring(0,start-1)+ss+s.substring(end+1,s.length());
            System.out.println("s = " + s);
        }
        return yunsaun(s);
    }
    public static int yunsaun(String str){
        int res = 0;
        if(str.charAt(0)!='-'&&str.charAt(0)!='+')
            str="+"+str;
        String[] split1 = str.split("[^0-9]");
        String[] split2 = str.split("[0-9]+");
        for (int i = 0; i < split2.length; i++) {
            if(split2[i].equals("-")){
                res+=-1*Integer.parseInt(split1[i+1]);
            }
            else
                res+=Integer.parseInt(split1[i+1]);
        }
        return res;
    }
}
