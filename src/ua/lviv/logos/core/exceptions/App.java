package ua.lviv.logos.core.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws MyException{
//        MyException exc = new MyException("my message ...");
//        try {
//            throw exc;
//        } catch (MyException e) {
//            System.out.println("Message: " + e.getMessage());
//            e.printStackTrace();
//        }

//        throwRuntimeException();
        throwException();
//        readFile("dd");

    }

    public static void throwRuntimeException(){
        MyRuntimeException rExc = new MyRuntimeException("This is runtime");
        throw rExc;
    }

    public static void throwException() throws MyException {
        throw new MyException("My message ..");
    }

    public static void readFile(String fileName){
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(fileName);
            fs.read();
        } catch (FileNotFoundException e) {
            System.out.println("catch FileNotFoundException");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("cathc IOException");
            e.printStackTrace();
        }finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
                //no op
            }
        }

    }
}
