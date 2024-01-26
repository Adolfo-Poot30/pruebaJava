package com.japb.prueba.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class ListarProductos {

    private String obtenerDatos() {
        String inventario = "";
        try {
            String apiUrl = "https://dummyjson.com/products";

            // Crear un objeto ObjectMapper de Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leer los datos JSON desde la API y mapearlos a un objeto JsonNode
            JsonNode jsonNode = objectMapper.readTree(new URL(apiUrl));

            inventario = jsonNode.toPrettyString();

        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
        }
        return inventario;
    }

    public void imprimir(javax.swing.JTextArea area) {
        String texto = obtenerDatos();
        texto = formatear(texto);
        area.append(texto);
    }
    
    public void imprimirDato(javax.swing.JTextArea area, String datos) {
        datos = formatear(datos);
        area.append(datos);
    }

    private String formatear(String jsonString) {

        // Construir la cadena sin formato JSON
        StringBuilder result = new StringBuilder();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);


            // Agregar datos de productos
            JsonNode productsNode = jsonNode.get("products");
            if (productsNode != null && productsNode.isArray()) {
                for (JsonNode productNode : productsNode) {
                    result.append("Product ID: ").append(productNode.get("id").asInt()).append(", ");
                    result.append("Title: ").append(productNode.get("title").asText()).append(", ");
                    result.append("Price: ").append(productNode.get("price").asDouble()).append("\n");
                }
            }

            // Agregar otros datos
            result.append("Total: ").append(jsonNode.get("total").asInt()).append(", ");
            result.append("Skip: ").append(jsonNode.get("skip").asInt()).append(", ");
            result.append("Limit: ").append(jsonNode.get("limit").asInt());

        } catch (JsonProcessingException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.toString());
        }
        return result.toString();
    }
    
    
}
