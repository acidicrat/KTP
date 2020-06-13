public class Point3d extends Point2d
{
    /** z координата **/
    private double ZCoord;
    /** Конструктор инициализации **/
    public Point3d (double X, double Y, double Z){
        super(X,Y);
        ZCoord = Z;
    }
    /** Конструктор по умолчанию **/
    public Point3d(){
        this (0.0,0.0,0.0);
    }

    /** Возвращение координаты z **/
    private double getZ3(){
        return ZCoord;
    }

    /** Установка значения координаты z **/
    private void setZ3(double val){
        ZCoord = val;
    }

    /** Функция сравнения двух точек **/
    public static boolean Check3D(Point3d first, Point3d two){
        if ((first.X2()==two.X2())&&(first.Y2()==two.Y2())&&(first.getZ3()==two.getZ3())){return true;}
        else return false;
    }
    /** Функция получения расстояния между точек **/
    public static double distantTo(Point3d first, Point3d two){
        return Math.sqrt(
                Math.pow((two.X2()-first.X2()),2)
                        + Math.pow((two.Y2()-first.Y2()),2)
                        + Math.pow((two.getZ3()-first.getZ3()),2));
    }
    /** Функция получения S треугольника **/
    public static double computeArea(Point3d one, Point3d two, Point3d three){
        double a,b,c,p;
        a = distantTo(one,two);
        b = distantTo(two,three);
        c = distantTo(one,three);
        p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
