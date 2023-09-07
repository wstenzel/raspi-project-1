

public class student
{
    int studentID;
    String name;
    int present;

    public student(String n, int s)
    {
        name = n;
        studentID = s;
        present = 0;
    }

    public void setPresent()
    {
        present +=1;
    }

    public boolean getPresent()
    {
        return present % 2 == 0;
    }

    public int getID()
    {
        return studentID;
    }

    public String getName()
    {
        return name;
    }
}