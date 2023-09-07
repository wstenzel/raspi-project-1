import java.util.*;
import java.io.*;

public class console
{
    

    public static void main(String[] args) throws IOException
    {
        RandomAccessFile rawData = new RandomAccessFile("textRFID.text", "r");
        rawData.seek(0);
        System.out.print(rawData.read());
    }
}
