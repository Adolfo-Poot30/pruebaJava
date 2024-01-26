package com.japb.prueba.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.japb.prueba.entity.Producto;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AgregarProducto {

    public AgregarProducto() {

    }

    public void agregaItem(Producto item) {
        try {
            URL url = new URL("https://dummyjson.com/products/add");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = "";

            try {
                requestBody = objectMapper.writeValueAsString(item);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(null, e.getMessage() + " Ocurrio un error al enviar los datos");
            }
            
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                javax.swing.JOptionPane.showMessageDialog(null, "Producto registrado con exito");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Datos erroneos");
            }

            connection.disconnect();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
