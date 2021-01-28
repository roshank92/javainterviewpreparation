package com.brighttechbits.trywithresoucrces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java6ResourceManagement {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br= new BufferedReader(new FileReader("/home/roshan/IdeaProjects/JavaInterviewQuestions/src/com/brighttechbits/trywithresoucrces/test.txt"));
            System.out.println(br.readLine());
        }
        catch(IOException e){
            e.printStackTrace();
        }    finally {
            try{
                if(br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}


