public class pattern
{
    public static void main(String args[])
{
    for(int row=1;row<=10;row++)
    {
        for(int space=1;space<=10-row;space++)
        {
            System.out.print(" ");
        }
        for(int star=1;star<=row;star++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
