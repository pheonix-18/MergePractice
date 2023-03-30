package MergePractice;

import java.io.*;
import java.util.*;
import MergePractice.Calculator;
import MergePractice.Temperature;

class HelloWorld{
    public static void main(String[] args){
        Temperature converter = new Temperature();
        System.out.println(converter.CelsiumToFarenheit(45));
    }
}
