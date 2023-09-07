import java.util.*;
import java.io.*;

public class console
{
    

    public static void main(String[] args) throws IOException
    {
        ArrayList<student> students = new ArrayList<>();

        students.add(new student("Will Stenzel",79601));
        students.add(new student("Special K",78362));
        students.add(new student("monke",11848));
        students.add(new student("Linda McShrawn", 80647));
        
        File testRFID = new File("testRFID.txt");
        FileWriter output = new FileWriter("output.txt");
        Scanner scan = new Scanner(testRFID);
        int id1;
        String in;
        
        while(scan.hasNext())
        {
            id1 = scan.nextInt();
            scan.nextLine();

            for(int i = 0; i < students.size(); i++)
            {
              if(id1==students.get(i).getID())
              {
                
                if(students.get(i).getPresent())
                {
                  in = "IN";
                }
                else
                {
                  in = "OUT";
                }
                output.write(students.get(i).getName() + "\t\t" + students.get(i).getID() + "\t\t" + in);
                output.write("\n");
                students.get(i).setPresent();
              }
            }
        }
        scan.close();
        output.close();
        
    }

    
}
