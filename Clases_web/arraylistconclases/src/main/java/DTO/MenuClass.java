package DTO;

import UI.*;

public class MenuClass {

    public void menuPrincipal() {
        Menu menu = new Menu();

        menu.setTitle("Menu");
        menu.setResizable(false);
        //menu.setLocationRelativeTo(menu);
        menu.setVisible(true);
    }

    public void ingresar() {
        Ingreso ingreso = new Ingreso();

        ingreso.setTitle("Ingreso de Persona");
        ingreso.setResizable(false);
        //ve.setLocationRelativeTo(menu);
        ingreso.setVisible(true);
    }

    public void ver() {
        Ver ver = new Ver();

        ver.setTitle("Personas");
        ver.setResizable(false);
        //ve.setLocationRelativeTo(menu);
        ver.setVisible(true);
    }

}
