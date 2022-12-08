import GLOOP.*;
class Candlescene{
    GLKamera cam1;
    GLLicht light;
    GLTastatur kb;

    
    Candlescene(){
       
        light = new GLLicht();
        cam1 = new GLEntwicklerkamera(800,600);
        kb = new GLTastatur();
        
        boolean c1=false,c2=false,c3=false,c4=false;
        
        Candle candle1 = new Candle(-200,0,20,100);
        Candle candle2 = new Candle(-50,0,30,100);
        Candle candle3 = new Candle(100,0,40,100);
        Candle candle4 = new Candle(250,0,20,100);
        Ground Ground = new Ground();

        cam1.setzePosition(0,300,500);

        while(!kb.esc()){
            
            if(kb.istGedrueckt('1')){
                if(c1){
                    candle1.off();
                    c1 = false;
                }else{
                    candle1.on();
                    c1 = true;
                }
            }

            if(kb.istGedrueckt('2')){
                if(c2){
                    candle2.off();
                    c2 = false;
                }else{
                    candle2.on();
                    c2 = true;
                }
            }

            if(kb.istGedrueckt('3')){
                if(c3){
                    candle3.off();
                    c3 = false;
                }else{
                    candle3.on();
                    c3 = true;
                }
            }

            if(kb.istGedrueckt('4')){
                if(c4){
                    candle4.off();
                    c4 = false;
            }else{
                    candle4.on();
                    c4 = true;
                }
            }

            candle1.burnDown();
            candle2.burnDown();
            candle3.burnDown();
            candle4.burnDown();

            Sys.warte();
        }
    }
}