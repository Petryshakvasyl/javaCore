package ua.lviv.logos.core.io;

import java.io.*;

public class SimpleExample {
    public static final int e = 0;
    public static void main(String[] args) throws IOException {


        File file1 = new File("simple.txt");

        String value = "Hello world with IO 1";

        try (FileOutputStream fileOutputStream = new FileOutputStream(file1, true);) {
            byte[] data = value.getBytes();
//            for (int i = 0; i < data.length; i++) {
//                fileOutputStream.write(data[i]);
//            }
            fileOutputStream.flush();
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("====================Read from file");

        try (FileInputStream fileInputStream = new FileInputStream(file1);) {
            StringBuilder sb = new StringBuilder();
            while (fileInputStream.available() > 0) {
                System.out.println("available" + fileInputStream.available());
                sb.append((char)fileInputStream.read());
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String wrValue = "New value for Writer";
        try (Writer wr = new FileWriter("writertesx.txt");) {
            wr.write(wrValue);
            wr.flush();
        } catch (Exception e) {
            System.err.print(e);
        }
        String valueForByte = "new value for byte to system in";

        InputStream is = new ByteArrayInputStream(valueForByte.getBytes());
        System.setIn(is);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        System.out.println(result);
//        System.out.println(file1.getName());
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.canWrite());
    }

    private static void throwEx()  {
        throw new RuntimeException();
    }
}
