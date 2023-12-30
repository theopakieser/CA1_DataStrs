package com.example.ca1_2;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class TheList<T> {
    public TheNode<T> head = null;

    public void addElement(T e){
        TheNode<T> tn = new TheNode<>();
        tn.setContents(e);
        tn.next = head;
        head = tn;
    }

    public void clear(){
        head = null;
    }

    public void listElements(){
        TheNode<T> temp;
        temp=head;
        while(temp!=null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

    class TheNode<N>{
        public TheNode<N> next = null;
        private N contents;

        public N getContents(){
            return contents;
        }

        public void setContents(N c){
            contents = c;
        }

        @Override
        public String toString() {
            return contents + " \n";
        }
    }
}
