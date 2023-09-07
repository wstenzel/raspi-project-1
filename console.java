import java.util.*;
import java.io.*;

public class console
{
    

    public static void main(String[] args) throws IOException
    {
        int[] studentIdArray = new int[5];
        RandomAccessFile rawData = new RandomAccessFile("testRFID.txt", "r");
        rawData.seek(0);
        studentIdArray[0] = rawData.read();
        rawData.seek(1);
        studentIdArray[1] = rawData.read();
        rawData.seek(2);
        studentIdArray[2] = rawData.read();
        rawData.seek(3);
        studentIdArray[3] = rawData.read();
        rawData.seek(4);
        studentIdArray[4] = rawData.read();
        rawData.close();
        System.out.print(unAscii(studentIdArray));
    }

    private static int unAscii(int[] idArray)
    {
        int id = 0;
        for(int i = 0; i <= idArray.length; i++)
        {
            System.out.print(i);
            int place = idArray[i];
            place -= 48;
            int pow = 5-i;
            Math.pow(place,pow);
            id += place;
        }
        return id;
    }
}
