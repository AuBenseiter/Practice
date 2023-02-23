package home.myhome.mavenproject3;

public class ScuenciaColoresAleatorios {

    public static void main(String[] args) {

        int c1;
        int c2;
        int c3;

        do {
            c1 = (int) (Math.random() * 6);
            c2 = (int) (Math.random() * 6);
            c3 = (int) (Math.random() * 6);
        } while ((c1 == c2) || (c1 == c3) || (c2 == c3));
        
        String color1 = "";
        
        switch(c1){
            case 0 -> {color1 = "rojo";}
            case 1 -> {color1 = "azul";}
            case 2 -> {color1 = "verde";}
            case 3 -> {color1 = "amarillo";}
            case 4 -> {color1 = "viole";}
            case 5 -> {color1 = "naranja";}
            default -> {}
        }
        
        String color2 = "";
        
        switch(c2){
            case 0 -> {color2 = "rojo";}
            case 1 -> {color2 = "azul";}
            case 2 -> {color2 = "verde";}
            case 3 -> {color2 = "amarillo";}
            case 4 -> {color2 = "viole";}
            case 5 -> {color2 = "naranja";}
            default -> {}
        }
        String color3 = "";
        
        switch(c3){
            case 0 -> {color3 = "rojo";}
            case 1 -> {color3 = "azul";}
            case 2 -> {color3 = "verde";}
            case 3 -> {color3 = "amarillo";}
            case 4 -> {color3 = "viole";}
            case 5 -> {color3 = "naranja";}
            default -> {}
        }
        
        System.out.println(color1 + ", " + color2 + ", " + color3);
    }
}
