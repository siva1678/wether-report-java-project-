/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.forecast.DetailedCity;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.json.JsonObject;
import javax.swing.BorderFactory;

/**
 *
 * @author Priagung Satyagama
 */
public class WeatherDetailPanel extends javax.swing.JPanel {

    /**
     * Creates new form WeatherDetail
     */
    public WeatherDetailPanel(JsonObject data, String cityname) {
        initComponents();
        DecimalFormat d = new DecimalFormat(".#");
        cityName.setText(cityname);
        pressure.setText(d.format(data.getJsonObject("main").getJsonNumber("pressure").doubleValue()));
        temperature.setText(d.format(data.getJsonObject("main").getJsonNumber("temp").doubleValue()-273));
        weatherDescription.setText(data.getJsonArray("weather").getJsonObject(0).getString("description"));
        weatherMain.setText(data.getJsonArray("weather").getJsonObject(0).getString("main"));
        final String DEGREE = "\u00b0";
        if (data.getJsonObject("wind").getJsonNumber("deg") != null){
            windDirection.setText(d.format(data.getJsonObject("wind").getJsonNumber("deg").doubleValue()) + DEGREE);     
        }
        else {
            windDirection.setText("");
        }
        windSpeed.setText(d.format(data.getJsonObject("wind").getJsonNumber("speed").doubleValue()) + " m/s");
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityName = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        weatherMain = new javax.swing.JLabel();
        weatherDescription = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pressure = new javax.swing.JLabel();
        windDirection = new javax.swing.JLabel();
        windSpeed = new javax.swing.JLabel();

        cityName.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        cityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityName.setText("Bandung");

        temperature.setFont(new java.awt.Font("Rockwell", 0, 100)); // NOI18N
        temperature.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        temperature.setText("20.2");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 40)); // NOI18N
        jLabel2.setText("°C");

        weatherMain.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        weatherMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherMain.setText("Clouds");

        weatherDescription.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        weatherDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherDescription.setText("few clouds");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wind");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pressure");

        pressure.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pressure.setText("1001.41");

        windDirection.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        windDirection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windDirection.setText("263.5°");

        windSpeed.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        windSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windSpeed.setText("2.51 m/s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(windSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pressure, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(weatherMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weatherDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(windDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(temperature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cityName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(weatherMain, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pressure))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windSpeed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windDirection)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pressure;
    private javax.swing.JLabel temperature;
    private javax.swing.JLabel weatherDescription;
    private javax.swing.JLabel weatherMain;
    private javax.swing.JLabel windDirection;
    private javax.swing.JLabel windSpeed;
    // End of variables declaration//GEN-END:variables

}
