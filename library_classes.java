class library_classes
{
    void main()
    {
        double x=-6.35;
        double y=14.74;
        double a=Math.abs(Math.ceil(x));
        double b=Math.rint(Math.max(x,y));
        System.out.println("Absolute = "+a);
        System.out.println("Rint ="+b);
    }
}