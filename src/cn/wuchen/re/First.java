package cn.wuchen.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wuchen on 2017/8/14.
 */
public class First {

    public static void main(String[] args){
//        First.contain();
//        First.capture();
        First.count();
    }

    /**
     * 查找字符串是否包含某子串
     */
    public static void contain(){
        String content = "i am wuchen from honghu";
        //.*honghu.*用于查找字符串中是否包含该子串
        String pattern = ".*honghu.*";

        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'honghu'子字符串?" + isMatch);
    }

    /**
     * 从一个给定的字符串中找到数字串
     */
    public static void capture(){

        //按指定模式在字符串中查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        //创建pattern对象
        Pattern r = Pattern.compile(pattern);

        //创建matcher对象
        Matcher m = r.matcher(line);

        if (m.find()){
            System.out.println("Found value:" + m.group(0));
            System.out.println("Found value:" + m.group(1));
            System.out.println("Found value:" + m.group(2));
            System.out.println("Found value:" + m.group(3));
        }else{
            System.out.println("No match");
        }

    }

    /**
     * 对单词cat出现在输入字符串中出现次数进行计数的例子:
     */
    public static void count(){
        String regex = "\\bcat\\b";
        String input = "cat cat cat cattie cat";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        int count = 0;

        while(m.find()){
            count++;
            System.out.println("Match number"+count);
            System.out.println("start():"+m.start());
            System.out.println("end():"+m.end());

        }
    }

}
