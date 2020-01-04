package com.xgdfin.exercise.others;

/**
 * @author chuanyin.li
 * @create 2019-10-31 22:19
 **/
public class TestFormat {

    TestFormat(){
    };

    /* c 要填充的字符
     *  length 填充后字符串的总长度
     *  content 要格式化的字符串
     *  格式化字符串，左对齐
     * */
    public String flushLeft(char c, long length, String content){
        String str = "";
        long cl = 0;
        String cs = "";
        if (content.length() > length){
            str = content;
        }else{
            for (int i = 0; i < length - content.length(); i++){
                cs = cs + c;
            }
        }
        str = content + cs;
        return str;
    }

    public static void main(String[]args){
        TestFormat test1 = new TestFormat();
        String th1 = test1.flushLeft(' ',6 , "编号");
        String th2 = test1.flushLeft(' ',10 , "内容");
        String id1 = test1.flushLeft(' ',6 , "12");
        String id2 = test1.flushLeft(' ',6 , "1233");
        String name1 = test1.flushLeft(' ',10 , "abcde");
        String name2 = test1.flushLeft(' ',10 , "1dd");
        System.out.print(th1+th2+"\n");
        System.out.print(id1+name1+"\n");
        System.out.print(id2+name2+"\n");

    }
}
