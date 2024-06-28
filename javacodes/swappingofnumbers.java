class Swapping
{
    static int a,b,c;
      static void swapthree()
    {
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
    }
    public static void main(String args[])
    {
        a=10;b=20;c=30;
        System.out.println("before swapping a="+a+",b="+b+",c="+c);
        swapthree();
         System.out.println("after swapping a="+a+",b="+b+",c="+c);
    }
    
}
