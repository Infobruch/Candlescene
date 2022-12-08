import GLOOP.*;
class Candle{
    GLZylinder body, wick;
    GLLicht flame;

    boolean an = false;
    double width,length;

    Candle(double x, double z, double thickness, double hossz){
        width = thickness;
        length = hossz;

        body = new GLZylinder (x,length/2,z, thickness,length);
        body.drehe(90,0,0);
        body.setzeFarbe(1,0,0);

        wick = new GLZylinder (x, length+5, 0, 3,10);
        wick.drehe(90,0,0);
        wick.setzeFarbe(0,0,0);

        flame = new GLLicht(x,length+25,z);
        flame.setzeSichtbarkeit(true);
        flame.setzeFarbe(1,1,0.5);
        flame.setzeSichtbarkeit(false);
        flame.skaliere(1,2,1);
    }
    public void on(){
    flame.setzeSichtbarkeit(true);
    an = true;
    }
    
    public void off(){
    flame.setzeSichtbarkeit(false);
    an = false;
    }

    public void burnDown(){
        if(an) {
            double b = (30 / width) / 10000;

            body.skaliere(1, 1, 1.0 - (b/length));

            body.verschiebe(0, -b, 0);
            wick.verschiebe(0, -b, 0);
            flame.verschiebe(0, -b, 0);

            length = length - b;
        }
        if(length<10){
            this.off();
            an = false;
        }
    }
}
