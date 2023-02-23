package home.myhome.mavenproject3;

public class LineaCaracteres {
    public static void main(String[] args) {
        int r;
        int longitud;
        String relleno = "";
        
        for (int i = 1; i <= 10; i++) {
            longitud = (int)(Math.random() * 40) + 1;
            r = (int)(Math.random() * 6);
            
            switch(r){
                case 0 -> {relleno = "*";}
                case 1 -> {relleno = "-";}
                case 2 -> {relleno = "=";}
                case 3 -> {relleno = ".";}
                case 4 -> {relleno = "|";}
                case 5 -> {relleno = "@";}
                default -> {}               
            }
            
            //pinta la linea
            for (int j = 1; j <= longitud; j++) {
                System.out.print(relleno);
            }
            System.out.println();
        }
    }
}
