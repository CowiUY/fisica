/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import static grafico.IntermedioResultado.ImagenVector;
import java.awt.Color;
import javax.swing.JOptionPane;
import logica.calculos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import logica.unidades;
import logica.campoElectrico;
import logica.PotencialElectrico;


public class cargaEjerce extends javax.swing.JFrame {
FondoPanel fondo = new FondoPanel();

    
    /**
     * Creates new form cargaEjerce
     */
    public cargaEjerce() {
        
         this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup btngroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InputCarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InputDistancia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        potenciaCarga1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        potenciaCarga2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1384, 677));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Datos sobre la carga");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Carga 1:");

        InputCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCargaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Distancia entre la carga y el punto:");

        InputDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDistanciaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("m");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("C");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("X10 ^");

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("X10 ^");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potenciaCarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potenciaCarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(potenciaCarga1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InputDistancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(potenciaCarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCargaActionPerformed
        // TODO add your handlingjLabel1.SetForeground(Color.GREEN); code here:
        
    }//GEN-LAST:event_InputCargaActionPerformed

    private void InputDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDistanciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
calculos pedrito = new calculos();

        double carga1 = pedrito.Potencia(Double.parseDouble(InputCarga.getText().trim()), Double.parseDouble(potenciaCarga1.getText().trim()));
        
        
        double distanciaCarga = pedrito.Potencia(Double.parseDouble(InputDistancia.getText().trim()), Double.parseDouble(potenciaCarga2.getText().trim()));
        
        //Se guardan todos los datos del formulario en Datos
        unidades Datos = new unidades(carga1, distanciaCarga);
        
        
        
        
        //Calcula y pasa los datos a resultados Campo electrico
        campoElectrico CampoElectrico = new campoElectrico(Datos);
        double ResultadoCampoElec = CampoElectrico.CampoElectrico1Carga(); 
        int ExponenteCampoElec = 0;
        
        //Se ve el signo para el vector y asigna la imagen correspondiente
        boolean SignoCarga = carga1 > 0;
        
        String ImagenVector = "/Vectores/";
        if (SignoCarga){
            ImagenVector = ImagenVector + "1CargaPositiva.png";
        }else{
            ImagenVector = ImagenVector + "1CargaNegativa.png";
        }
        
        
        //Calcula y pasa los datos a resultados Campo electrico
        PotencialElectrico PotencialElectrico = new PotencialElectrico(Datos);
        double ResultadoPotencialElectrico = PotencialElectrico.PotencialElectrico1Carga();
        int ExponentePotencialElectrico = 0;
        
        
        
        double base = 0;
        int exponente = 0;
        
        
        
        
        
        
        
        
        
        //Decide cuál va a ser el valor a tratar...
        for (int i = 1; i <=2; i++){
            int tieneE;
            double carga;
            
            if (i == 1){
                double usar = ResultadoCampoElec;
                
                
                tieneE = pedrito.Everdad(usar);        
                carga = usar;
                
                base = usar;
                
            }else{
                double usar = ResultadoPotencialElectrico;
                tieneE = pedrito.Everdad(usar);
                carga = usar;
                base = usar;
            }
            
            System.out.println("carga = "+carga);
        if (tieneE == 0){
                        
            if (carga >= 1){
                System.out.println("carga mayor o igual a 1");
                
                exponente = pedrito.tiene0(carga);
                base = pedrito.tiene0Base(carga);
                
            }else if (carga > 0 && carga < 1){// carga >0 && carga <1
                System.out.println("carga mayor a 0 menor a 1");
                
                //SI el número es 0. algo
            exponente = pedrito.RobertoGomez(carga);
            
            if (exponente > 0){    
            
                for(int d = 0; d < exponente; d++){
                    base = base *10;
                    System.out.println("");
                    System.out.println(base);
                }
            }else{
                for(int d = 0; d > exponente; d--){
                    base = base *10;
                    System.out.println("");
                    System.out.println(base);
                }
            }
            
            }else if (carga <0){
                        System.out.println("Menor a 0");
                        exponente = pedrito.tiene0(carga);
                base = pedrito.tiene0Base(carga);
                        }
            
        }else{
            System.out.println("Carga tiene E");
                
            //double temporal = pedrito.hayEBase(carga, tieneE);
            
            exponente = (int) pedrito.hayExponente(carga, tieneE);
            base = pedrito.hayEBase(carga, tieneE);
            System.out.println("");
            System.out.println("Carga antes de entrar "+base);
            System.out.println("");
            base = pedrito.dosCS(base);
        }
        System.out.println("base "+base);
        System.out.println("exponente "+exponente);
        
        if (i == 1){
                ResultadoCampoElec = base;
                ExponenteCampoElec = exponente;
            }else{
                ResultadoPotencialElectrico = base;
                ExponentePotencialElectrico = exponente;
            }
    }
        
        
        
        
        
        
        
        
        
        //Abre el siguiente Jframe 
        Resultados pagResultados = new Resultados();
        pagResultados.setVisible(true);
       
        //Pasa los datos al siguiente JFrame
        pagResultados.campoElectxt.setText(String.valueOf(ResultadoCampoElec));
        pagResultados.exponenteCampoElectrico.setText(String.valueOf(ExponenteCampoElec));
        
        pagResultados.Potencialtxt.setText(String.valueOf(ResultadoPotencialElectrico));
        pagResultados.exponentePotencialElectrico.setText(String.valueOf(ExponentePotencialElectrico));
        
        Image Vector = new ImageIcon(getClass().getResource(ImagenVector)).getImage();
        pagResultados.VectorImg.setIcon(new ImageIcon(Vector));
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cargaEjerce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargaEjerce().setVisible(true);
            }
        });
    }
    
    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCarga;
    private javax.swing.JTextField InputDistancia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField potenciaCarga1;
    private javax.swing.JTextField potenciaCarga2;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagen/img21-scaled.jpg")).getImage();
       g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
       setOpaque(false);
       
       super.paint(g);
    }
            
}  

}
