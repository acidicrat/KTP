import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        double x,y,z;
        DecimalFormat df = new DecimalFormat("###.##");
        /** Ввод данных**/
        Scanner in = new Scanner(System.in);
        /** Ввод координат для первой точки **/
        System.out.println("Введите координаты первой точки : ");
        System.out.println("Координата x : ");
        x=in.nextDouble();
        System.out.println("Координата y : ");
        y=in.nextDouble();
        System.out.println("Координата z : ");
        z=in.nextDouble();
        Point3d onepoint = new Point3d(x, y, z); // Создание первой точки
        /** Ввод координат для второй точки **/
        System.out.println("Введите координаты второй точки : ");
        System.out.println("Координата x : ");
        x=in.nextDouble();
        System.out.println("Координата y : ");
        y=in.nextDouble();
        System.out.println("Координата z : ");
        z=in.nextDouble();
        Point3d twopoint = new Point3d(x, y, z); // Сооздание второй точки
        /** Ввод координат для третей точки **/
        System.out.println("Введите координаты первой точки : ");
        System.out.println("Координата x : ");
        x=in.nextDouble();
        System.out.println("Координата y : ");
        y=in.nextDouble();
        System.out.println("Координата z : ");
        z=in.nextDouble();
        Point3d threepoint = new Point3d(x, y, z); // Создание третьей точки
        /** Проверка точек на равенство**/
        if ((Point3d.Check3D(onepoint,twopoint) == false)
                &&(Point3d.Check3D(onepoint,threepoint) == false)
                &&(Point3d.Check3D(twopoint,threepoint) == false))
        {System.out.println(" Значения координат точек не совпадают ");}
        else {System.out.println(" Значения координат точек совпадают. "); System.exit(0);}
        /** Вычисление площади треугольника **/
        double P = Point3d.computeArea(onepoint,twopoint,threepoint);
        System.out.println(" S треугольника равна = " + df.format(P));

    }
}
