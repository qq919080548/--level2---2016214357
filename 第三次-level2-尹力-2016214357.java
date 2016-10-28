abstract class Shape{
    int r;
    double S1;
    public void calculateyuan(double S1,int r){
        S1=3.1415926*r*r;
        System.out.println (S1 );
    }
    int h;
    int S2;
    public void calculatezhengfangxing(int h,int S2){
        S2=h*h;
        System.out.println (S2 );
    }
    int chang;
    int kuan;
    int S3;
    public void calculatechangfangxing(int chang,int kuan){
        S3=chang*kuan;
        System.out.println (S3 );
    }

}
 class Shapefather extends Shape{
    int r;
    double S1;
    public void calculateyuan(double S1,int r){
        S1=3.1415926*r*r;
        System.out.println ("圆形的面积:"+S1 );
    }
    int h;
    int S2;
    public void calculatezhengfangxing(int h,int S2){
        S2=h*h;
        System.out.println ("正方形的面积:"+S2 );
    }
    int chang;
    int kuan;
    int S3;
    public void calculatechangfangxing(int chang,int kuan){
        S3=chang*kuan;
        System.out.println ("长方形的面积:"+S3 );
    }
}
public class Hongyan {
    public static void main(String[] args) {
        Shapefather a = new Shapefather ( );
          Shape b=a;
        b.calculateyuan(3.0,1);
        b.calculatezhengfangxing(4,4);
        b.calculatechangfangxing ( 5,4 );
    }
}
