import java.io.*;

public class StreamFormatData {
    public static void main(String[] args) {
        File f = new File("D:NewFile.txt");
        try{
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeChars("Hello World");
            dos.writeDouble(87.5);
            dos.writeInt(4561);
            dos.writeBoolean(false);
            dos.writeChars("Process Finished");
            dos.close();
            bos.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        //read data from file
        try {
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            String st;
            while ((st=dis.readLine()) != null){
                System.out.println(st);
            }
            dis.close();
            bis.close();
            fis.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
