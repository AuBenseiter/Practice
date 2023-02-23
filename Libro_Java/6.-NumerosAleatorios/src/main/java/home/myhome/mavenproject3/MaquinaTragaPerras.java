package home.myhome.mavenproject3;

public class MaquinaTragaPerras {
    public static void main(String[] args) {
        int figura;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
        
        for (int i = 0; i < 3; i++) {
            figura = (int)(5 * Math.random());
            
            switch(figura){
                case 0 -> {System.out.print("corazón ");}
                case 1 -> {System.out.print("diamante ");}
                case 2 -> {System.out.print("herradura ");}
                case 3 -> {System.out.print("campana ");}
                case 4 -> {System.out.print("limon ");}
                default -> {}
            }
            
            switch(i){
                case 0 -> {figura1 = figura;}
                 case 1 -> {figura1 = figura;}
                  case 2 -> {figura1 = figura;}
                   default -> {}
            }
        }
        
        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.println("\nLo siento has perdido");
        }else if ((figura1 == figura2) && (figura2 == figura3)) {
            System.out.println("\nEnhorabuena, ha ganado 10 moneas");
        }else{
            System.out.println("\nBien, ha recuperado su moneda");
        }
    }
}
