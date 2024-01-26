package com.japb.prueba;

import com.japb.prueba.UI.LoginFrame;

public class Prueba {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
                
    }
}
