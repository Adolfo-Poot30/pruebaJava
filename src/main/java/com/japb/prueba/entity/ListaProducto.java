package com.japb.prueba.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class ListaProducto {

    public ListaProducto(){
        
    }
    @Getter @Setter
    private List <Producto> ProductosListados = new ArrayList<Producto>(); 
    
    @Getter @Setter
    private int Total;
    
    @Getter @Setter
    private int skip;
    
    @Getter @Setter
    private int limit;
}
