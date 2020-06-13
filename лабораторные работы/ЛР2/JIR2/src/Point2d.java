public class Point2d
{
    /** x координата **/
    private double xCoord;
    /** y координата **/
    private double yCoord;
    /** Конструктор инициализации **/
    public Point2d (double x, double y)
    {
        xCoord = x;
        yCoord = y;
    }
    /** Конструктор по умолчанию **/
    public Point2d()
    {
        this (0,0);
    }
    /** Возвращение координат x **/
    public double X2()
    {
        return xCoord;
    }
    /** Возвращение координат y **/
    public double Y2()
    {
        return yCoord;
    }
    /** Установка значения координаты x **/
    public void setX2(double val)
    {
        xCoord = val;
    }
    public void setY2(double val)
    {
        yCoord = val;
    }
    public static boolean Check2D(Point2d first, Point2d two)
    {
        if ((first.X2() == two.X2()) && (first.Y2() == two.Y2()))
        {
            return true;
        }
        else {return false;}
    }
}
