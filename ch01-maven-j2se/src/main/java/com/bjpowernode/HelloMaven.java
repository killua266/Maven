package com.bjpowernode;

/**
 * @Description:
 * @author: killua
 * @date:2021/12/2-21:20
 */
public class HelloMaven {
    public int addNumber(int n1,int n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        HelloMaven maven = new HelloMaven();
        int res = maven.addNumber(10,20);
        System.out.println("res=" + res);
    }
}
