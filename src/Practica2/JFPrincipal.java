
package Practica2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class JFPrincipal extends javax.swing.JFrame {
    int [] ElementosY = new int[25];
    Object [] ElementosX = new Object [25];
    int[] OriginalesY = new int [25];
    Object [] OriginalesX = new Object [25];

    public JFPrincipal() {    
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnExaminar = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PGrafica = new javax.swing.JPanel();
        btnGraficar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        CBAscendente = new javax.swing.JCheckBox();
        CBDescendente = new javax.swing.JCheckBox();
        CBAlgoritmo1 = new javax.swing.JCheckBox();
        CBAlgoritmo2 = new javax.swing.JCheckBox();
        btnLImpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtContador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtForma = new javax.swing.JLabel();
        txtAlgoritmo = new javax.swing.JLabel();
        txtDetener = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 255, 255));
        bg.setForeground(new java.awt.Color(153, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCargar.setBackground(new java.awt.Color(255, 255, 255));
        btnCargar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(0, 0, 0));
        btnCargar.setText("CARGA POR RUTA");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        bg.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 150, 40));

        btnExaminar.setBackground(new java.awt.Color(255, 255, 255));
        btnExaminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnExaminar.setForeground(new java.awt.Color(0, 0, 0));
        btnExaminar.setText("...");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        bg.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 40, 40));

        txtRuta.setBackground(new java.awt.Color(255, 255, 255));
        txtRuta.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtRuta.setForeground(new java.awt.Color(0, 0, 0));
        txtRuta.setText("INGRESE LA RUTA DEL ARCHIVO");
        txtRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRutaMousePressed(evt);
            }
        });
        bg.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 440, 40));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.setText("TÍTULO DE LA GRÁFICA");
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTituloMousePressed(evt);
            }
        });
        bg.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 480, 40));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 480, 190));

        javax.swing.GroupLayout PGraficaLayout = new javax.swing.GroupLayout(PGrafica);
        PGrafica.setLayout(PGraficaLayout);
        PGraficaLayout.setHorizontalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PGraficaLayout.setVerticalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(PGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1210, 450));

        btnGraficar.setBackground(new java.awt.Color(255, 255, 255));
        btnGraficar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(0, 0, 0));
        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        bg.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 150, 40));

        btnOrdenar.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        bg.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 140, 40));

        CBAscendente.setBackground(new java.awt.Color(153, 255, 255));
        CBAscendente.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CBAscendente.setForeground(new java.awt.Color(0, 0, 0));
        CBAscendente.setText("Ascendente");
        CBAscendente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBAscendenteStateChanged(evt);
            }
        });
        bg.add(CBAscendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        CBDescendente.setBackground(new java.awt.Color(153, 255, 255));
        CBDescendente.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CBDescendente.setForeground(new java.awt.Color(0, 0, 0));
        CBDescendente.setText("Descendente");
        CBDescendente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBDescendenteStateChanged(evt);
            }
        });
        bg.add(CBDescendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, -1));

        CBAlgoritmo1.setBackground(new java.awt.Color(153, 255, 255));
        CBAlgoritmo1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CBAlgoritmo1.setForeground(new java.awt.Color(0, 0, 0));
        CBAlgoritmo1.setText("Bubblesort ");
        CBAlgoritmo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBAlgoritmo1StateChanged(evt);
            }
        });
        bg.add(CBAlgoritmo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, -1, -1));

        CBAlgoritmo2.setBackground(new java.awt.Color(153, 255, 255));
        CBAlgoritmo2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CBAlgoritmo2.setForeground(new java.awt.Color(0, 0, 0));
        CBAlgoritmo2.setText("InsertionShort");
        CBAlgoritmo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CBAlgoritmo2StateChanged(evt);
            }
        });
        bg.add(CBAlgoritmo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        btnLImpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLImpiar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnLImpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLImpiar.setText("LIMPIAR");
        btnLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLImpiarActionPerformed(evt);
            }
        });
        bg.add(btnLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 150, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASOS");

        txtContador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContador.setForeground(new java.awt.Color(0, 0, 0));
        txtContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContador.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContador, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 500, -1, 80));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRONÓMETRO");

        txtSegundos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtSegundos.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSegundos.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 380, 160, 80));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 160, 40));

        txtForma.setBackground(new java.awt.Color(153, 255, 255));
        txtForma.setForeground(new java.awt.Color(153, 255, 255));
        bg.add(txtForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtAlgoritmo.setBackground(new java.awt.Color(153, 255, 255));
        txtAlgoritmo.setForeground(new java.awt.Color(153, 255, 255));
        bg.add(txtAlgoritmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 40));

        txtDetener.setBackground(new java.awt.Color(153, 255, 255));
        txtDetener.setForeground(new java.awt.Color(153, 255, 255));
        bg.add(txtDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
    //Modelo para la tabla
        DefaultTableModel modeloTabla;   
        String direccion = txtRuta.getText();
        File file = new File(direccion);
        int m = 0;
        try{
        String texto = "";
        Object cabeceras [] ={ "X", "Y"};
        modeloTabla = new DefaultTableModel (cabeceras, 0);
        File abrir = file.getAbsoluteFile();
        Object[] elemento = new Object[2];
        //Abre el archivo y si no está vacio realiza:
        if (abrir != null){
            FileReader carp = new FileReader(abrir);
            BufferedReader leer = new BufferedReader (carp) ;
             
            while ((texto = leer.readLine()) !=null){
            String registro[] = texto.split (",");
            elemento[0] = registro[0];
            ElementosX[m] = registro[0];
            OriginalesX[m] = registro[0];
            elemento[1] = registro[1];
            ElementosY[m] = Integer.parseInt(registro[1]);
            OriginalesY[m] = Integer.parseInt(registro[1]);
            m++;
            modeloTabla.addRow (elemento);
                }
            Tabla.setModel(modeloTabla);
            }
        //En caso de error, muestra el error
    }catch (IOException e){
        JOptionPane.showMessageDialog(null,"Error: " +e);
            }    
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
//Modelo para la tabla
DefaultTableModel modeloTabla;
//Creación del objeto FileChooser, para que el usuario elija el archivo 
JFileChooser Doc = new JFileChooser ();
//Filtro para archivos CSV
FileNameExtensionFilter filtro = new FileNameExtensionFilter ("*.CSV", "csv");
//Le indicamos el fiiltro
Doc.setFileFilter(filtro);
//Ventana para seleccionar el archivo
int seleccion = Doc.showOpenDialog (this);
//VAriable contador
int m = 0;
//Si se selecciona un archivo existente
if (seleccion == JFileChooser.APPROVE_OPTION) {
    //Selecciona el fichero
    File fichero = Doc.getSelectedFile();
    //Ecribe la ruta del fichero seleccionado en el textField
    this.txtRuta.setText(fichero.getAbsolutePath ());
    //Si cumple con las características convertirá el archivo en una tabla
 try{
        String texto = "";
        Object cabeceras [] ={ "X", "Y"};
        modeloTabla = new DefaultTableModel (cabeceras, 0);
        File abrir = Doc.getSelectedFile();
        Object[] elemento = new Object[2];
        //Abre el archivo y si no está vacio realiza:
        if (abrir != null){
            FileReader carp = new FileReader(abrir);
            BufferedReader leer = new BufferedReader (carp);
            while ((texto = leer.readLine()) !=null){
            String registro[] = texto.split (",");
            elemento[0] = registro[0];
            ElementosX[m] = registro[0];
            OriginalesX[m]=registro[0];
            elemento[1] = registro[1];
            ElementosY[m] = Integer.parseInt(registro[1]);
            OriginalesY[m] = Integer.parseInt(registro[1]);
            m++;
            //Se agrega el elemento en la tabla
            modeloTabla.addRow (elemento);
                }
            Tabla.setModel(modeloTabla);
                }   
        //En caso de error, muestra el error
    }catch (IOException e){
        JOptionPane.showMessageDialog(null,"Error: " +e);
            }
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
   Actualizar();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMousePressed
        //Cambios graficos, al presionar el label, el texto se borra
        String Titulo = txtTitulo.getText();
        if(Titulo.equals("TÍTULO DE LA GRÁFICA") ){
        txtTitulo.setText("");
        }else{
        }
    }//GEN-LAST:event_txtTituloMousePressed

    private void txtRutaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutaMousePressed
       //Cambios graficos, al presionar el label, el texto se borra
        String Ruta = txtRuta.getText();
        if(Ruta.equals("INGRESE LA RUTA DEL ARCHIVO") ){
        txtRuta.setText("");
        }else{ 
        }
    }//GEN-LAST:event_txtRutaMousePressed

    private void CBAscendenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBAscendenteStateChanged
        if(CBAscendente.isSelected() == true){
        CBDescendente.setSelected(false);
        }
    }//GEN-LAST:event_CBAscendenteStateChanged

    private void CBDescendenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBDescendenteStateChanged
       if(CBDescendente.isSelected() == true){
        CBAscendente.setSelected(false);
        }
    }//GEN-LAST:event_CBDescendenteStateChanged

    private void CBAlgoritmo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBAlgoritmo1StateChanged
        if(CBAlgoritmo1.isSelected() == true){
        CBAlgoritmo2.setSelected(false);
        }
    }//GEN-LAST:event_CBAlgoritmo1StateChanged

    private void CBAlgoritmo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CBAlgoritmo2StateChanged
        if(CBAlgoritmo2.isSelected() == true){
        CBAlgoritmo1.setSelected(false);
        }
    }//GEN-LAST:event_CBAlgoritmo2StateChanged

    private void btnLImpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLImpiarActionPerformed
        txtRuta.setText("INGRESE LA RUTA DEL ARCHIVO");
        txtTitulo.setText("TÍTULO DE LA GRÁFICA");
        txtContador.setText("");
        Limpiar();
    }//GEN-LAST:event_btnLImpiarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if(CBAlgoritmo1.isSelected()){
        txtAlgoritmo.setText("BubbleSort");
        }else if(CBAlgoritmo2.isSelected()){
            txtAlgoritmo.setText("InsertionSort");
        }
      if(CBAscendente.isSelected()){
        txtForma.setText("Ascendente");
      }else if(CBDescendente.isSelected()){
        txtForma.setText("Descendente");
      }
        //ordenamiento BubbleSort ascendiente
        if(CBAlgoritmo1.isSelected() && CBAscendente.isSelected()){
        A1A a1 = new A1A();
        a1.start();
        //Ordenamiento BubbleSort Descendiente
        }else if(CBAlgoritmo1.isSelected() && CBDescendente.isSelected()){
        A1D d1 = new A1D();
        d1.start();
        }
        //Ordenamiento ShellSort Ascendente
        else if(CBAlgoritmo2.isSelected() && CBAscendente.isSelected()){
        A2A a2 = new A2A();
        a2.start();
        //Ordenamiento ShellSort Descendiente
        }else if(CBAlgoritmo2.isSelected() && CBDescendente.isSelected()){
        A2D d2 = new A2D();
        d2.start();
        }else{
                JOptionPane.showMessageDialog(null, "Capos vacíos, selecciones una opción");
                }                     
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             Reporte();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Actualizar(){  
     //Declaración de variables auxiliares
      int auxY;
      String auxX;
      String Nombre;
      Nombre = txtTitulo.getText();
      //Creación para almacenar datos
      DefaultCategoryDataset datos = new DefaultCategoryDataset (); 
      
      if( Nombre.equals("") || Nombre.equals("TÍTULO DE LA GRÁFICA")){   
      JOptionPane.showMessageDialog(null, "Ingrese un nombre para la gráfica");
      }else{
      
        //Asignación de datos X y Y en la grafica
        for(int i = 0;i<ElementosX.length ;i++){
            if(ElementosY[i] != 0){
            auxX = String.valueOf(ElementosX[i]);
            auxY = ElementosY[i];
            datos.setValue(auxY,"Paises",auxX);
                }
            }
        
        //Creación de la grafica
        JFreeChart grafica = ChartFactory.createBarChart(Nombre, 
            "Paises",
            "Cantidades",
            datos, 
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            );
        //Instrucciones para hacer visible la grafica 
    ChartPanel panel = new ChartPanel(grafica);
    panel.setMouseWheelEnabled (false);
    panel.setPreferredSize(new Dimension(1210, 450));

    PGrafica.setLayout (new BorderLayout ());
    PGrafica.add(panel, BorderLayout.NORTH);
    panel.removeAll();
    panel.revalidate();
    panel.repaint();   
      }
    }
    
    
    public void Limpiar(){
    PGrafica.removeAll();
    PGrafica.revalidate();
    PGrafica.repaint();  
    }
     
  
    @SuppressWarnings("empty-statement")
    public void Reporte(){
        String Nombre;
        Nombre = String.valueOf(txtTitulo.getText());
        int pasos;
        pasos = Integer.parseInt(String.valueOf(txtContador.getText()));   
        String Algoritmo;
        Algoritmo = String.valueOf(txtAlgoritmo.getText());
        String Forma;
        Forma = String.valueOf(txtForma.getText());
        int seg ;
        seg = Integer.parseInt(String.valueOf(txtSegundos.getText()));
        
        
        File directorio = new File ("Reportes");
        if (!directorio.exists()) {
    if (directorio.mkdirs ()) {
      } 
}      
        // para crear un archivo
        File archivo = new File("Reportes\\"+Nombre+".html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;
        
        // verifico si mi archivo existe o no existe
        if(!archivo.exists()){
            try {
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "<style type = "+"text/css"+">\n"+
                                    "table {\n"+
                                    "margin-top: 50px;\n" +
                                    "margin-left:auto;\n" +
                                    "margin-right: auto;\n"+
                                    "}\n"+
                                    "table, th, td {\n"+
                                    "border: 1px solid black;\n"+
                                    "border-collapse: collapse;\n"+
                                    "}\n"+
                                    "th, td {\n"+
                                    "padding: 10px;\n"+
                                    "}\n"+
                                    "th, td {\n" +
                                    "padding: 10px;\n" +
                                    "}\n" +
                                    "th {\n" +
                                    "background-color: #F6AC5E;\n"+
                                    "Color: ;\n"+
                                    "}\n"+
                                    "</style>\n"+
                                    "<meta charset=\"UTF-8\">\n" +
                                    "<title>"+ Nombre+"</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1>REPORTE DE ORDENAMIENTO</h1>");
                nuevaLinea.println("<h2>Nombre: David Andrés Jimenez Paniagua</h2>");
                nuevaLinea.println("<h2>Carnet: 202004777</h2>");
                nuevaLinea.println("<h2>Nombre de la gráfica: " +Nombre+ "</h1>");
                nuevaLinea.println("<h2>Algoritmo utilizado: " +Algoritmo+ "</h2>");
                nuevaLinea.println("<h2>Los datos fueron ordenados de forma: " +Forma+ "</h2>");
                nuevaLinea.println("<h2>Número de pasos: " +pasos+ "</h2>");
                nuevaLinea.println("<h2>Tiempo: " +seg+ " segundos</h2>");
                nuevaLinea.println("<h2>Datos Originales: </h2>");
                nuevaLinea.println("<table align=center>");
                nuevaLinea.println("<tr Align = Center>");
                nuevaLinea.println("<th>Elementos en X </th>");
                nuevaLinea.println("<th>Elementos en Y </th>");
                for(int i=0; i<OriginalesY.length;i++){
                    //solo cuando los datos existan
                    if(OriginalesX[i] != null){ 
                        nuevaLinea.println("<tr Align = Center>");
                        nuevaLinea.print("<td Align = Center>");
                        nuevaLinea.print(OriginalesX[i]);
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td Align = Center>");
                        nuevaLinea.print(OriginalesY[i]);
                        nuevaLinea.print("</td>");
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                nuevaLinea.println("<h2>Datos Ordenados: </h2>");
                nuevaLinea.println("<table align = center>");
                nuevaLinea.println("<tr Align = Center>");
                nuevaLinea.println("<th>Elementos en X </th>");
                nuevaLinea.println("<th>Elementos en Y </th>");
                for(int i=0; i<ElementosY.length;i++){
                    //solo cuando los datos existan
                    if(ElementosX[i] != null){
                        nuevaLinea.println("<tr Align = Center>");
                        nuevaLinea.print("<td Align = Center>");
                        nuevaLinea.print(ElementosX[i]);
                        nuevaLinea.print("</td>");
                        nuevaLinea.print("<td Align = Center>");
                        nuevaLinea.print(ElementosY[i]);
                        nuevaLinea.print("</td>");
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
                
                
            } catch (Exception e) {
                
            }
        }
    }
    
    
    //Ordenamiento BubbleSort ascendente
    public class A1A extends Thread {
        public void run(){
            
    int contador = 0;
        String Nombre;
        Nombre = txtTitulo.getText();
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        reloj r = new reloj();
            r.start();
        for (int i = 0; i < ElementosY.length - 1; i++) {
            for (int j = 0; j < ElementosY.length - i - 1; j++) {
                    if ((int) ElementosY[j] > (int) ElementosY[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = (int) ElementosY[j];
                        ElementosY[j] = ElementosY[j + 1];
                        ElementosY[j + 1] = temp;                                            
                    }              
            } 
            contador++;
            Limpiar();
            String auxX = String.valueOf(ElementosX[i]);
            int auxY = ElementosY[i];
            txtContador.setText(String.valueOf(contador));
            datos.setValue(auxY,"Paises",auxX);
                        
            JFreeChart grafica = ChartFactory.createBarChart(Nombre, 
            "Paises",
            "Cantidades",
            datos, 
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            );
    //Instrucciones para hacer visible la grafica 
    ChartPanel panel = new ChartPanel(grafica);
    panel.setMouseWheelEnabled (false);
    panel.setPreferredSize(new Dimension(1210, 450));

    PGrafica.setLayout (new BorderLayout ());
    PGrafica.add(panel, BorderLayout.NORTH);
    
    panel.removeAll();
    panel.revalidate();
    panel.repaint();                   
                        try {
            sleep(100);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
            }            
        Actualizar();
        r.stop();
        }
        
    }
    
    //ordenamiento BubbleSort Descendiente
    public class A1D extends Thread{
        public void run(){
            reloj r = new reloj();
            r.start();
    int contador = 0;
        String Nombre;
        Nombre = txtTitulo.getText();
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (int i = 0; i < ElementosY.length - 1; i++) {
            for (int j = 0; j < ElementosY.length - i - 1; j++) {
                    if ((int) ElementosY[j] < (int) ElementosY[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = (int) ElementosY[j];
                        ElementosY[j] = ElementosY[j + 1];
                        ElementosY[j + 1] = temp;
            }
        }
             try {
            sleep(100);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
                    
                    Limpiar();
                    contador++;
                    String auxX = String.valueOf(ElementosX[i]);
                        int auxY = ElementosY[i];
                        txtContador.setText(String.valueOf(contador));
                        datos.setValue(auxY,"Paises",auxX);
                        
                        JFreeChart grafica = ChartFactory.createBarChart(Nombre, 
            "Paises",
            "Cantidades",
            datos, 
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            );
        //Instrucciones para hacer visible la grafica 
    ChartPanel panel = new ChartPanel(grafica);
    panel.setMouseWheelEnabled (false);
    panel.setPreferredSize(new Dimension(1210, 450));

    PGrafica.setLayout (new BorderLayout ());
    PGrafica.add(panel, BorderLayout.NORTH);
    
    panel.removeAll();
    panel.revalidate();
    panel.repaint();

    }                    
        Actualizar();
        r.stop();
        }
}
    
    
    
//Ordenamiento InsertionSort Ascendente
    public class A2A extends Thread{
    public void run(){
         reloj r = new reloj();
            r.start();
         DefaultCategoryDataset datos = new DefaultCategoryDataset();
       int contador = 0;
        String Nombre;
        Nombre = txtTitulo.getText();
            int n = ElementosY.length;
        for (int i = 0; i < n; ++i) {
            int key = ElementosY[i];
            int j = i - 1;

            while (j >= 0 && ElementosY[j] > key) {
                ElementosY[j + 1] = ElementosY[j];
                j = j - 1;
                try {
            sleep(100);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
                
                txtContador.setText(String.valueOf(contador));
                contador++;
                Limpiar();
                String auxX = String.valueOf(ElementosX[j+1]);
                int auxY = ElementosY[j+1];
                txtContador.setText(String.valueOf(contador));
                datos.setValue(auxY,"Paises",auxX);
                  
            JFreeChart grafica = ChartFactory.createBarChart(Nombre, 
            "Paises",
            "Cantidades",
            datos, 
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            );
        //Instrucciones para hacer visible la grafica 
    ChartPanel panel = new ChartPanel(grafica);
    panel.setMouseWheelEnabled (false);
    panel.setPreferredSize(new Dimension(1210, 450));

    PGrafica.setLayout (new BorderLayout ());
    PGrafica.add(panel, BorderLayout.NORTH);
    
    panel.removeAll();
    panel.revalidate();
    panel.repaint();
            }
            ElementosY[j + 1] = key;  
    }  
        Actualizar();
        r.stop();
}
    }
    
//Ordenamiento InsertionSort Descendente
    public class A2D extends Thread{
        public void run(){
             reloj r = new reloj();
            r.start();
      DefaultCategoryDataset datos = new DefaultCategoryDataset();
        int contador = 0;
        String Nombre;
        Nombre = txtTitulo.getText();
            int n = ElementosY.length;
        for (int i = 0; i < n; ++i) {
            int key = ElementosY[i];
            int j = i - 1;

            while (j >= 0 && ElementosY[j] < key) {
                ElementosY[j + 1] = ElementosY[j];
                j = j - 1;
                try {
            sleep(100);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
                
                txtContador.setText(String.valueOf(contador));
                contador++;
                Limpiar();
                String auxX = String.valueOf(ElementosX[j+1]);
                int auxY = ElementosY[j+1];
                txtContador.setText(String.valueOf(contador));
                datos.setValue(auxY,"Paises",auxX);
                  
            JFreeChart grafica = ChartFactory.createBarChart(Nombre, 
            "Paises",
            "Cantidades",
            datos, 
            PlotOrientation.VERTICAL,
            true,
            true,
            false
            );
        //Instrucciones para hacer visible la grafica 
    ChartPanel panel = new ChartPanel(grafica);
    panel.setMouseWheelEnabled (false);
    panel.setPreferredSize(new Dimension(1210, 450));

    PGrafica.setLayout (new BorderLayout ());
    PGrafica.add(panel, BorderLayout.NORTH);
    
    panel.removeAll();
    panel.revalidate();
    panel.repaint();
            }
            ElementosY[j + 1] = key;  
    }
        Actualizar();
        r.stop();
    }
    }
    
    public class reloj extends Thread {
int segundos = 0;
        public void run() {
            for (int i = 0; i <= 100000; i++) {

//            if(segundos==30){
//                segundos=0;
//                minutos++;
//            } 
        
                txtSegundos.setText(String.valueOf(segundos));
                segundos++;
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
    }

    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBAlgoritmo1;
    private javax.swing.JCheckBox CBAlgoritmo2;
    private javax.swing.JCheckBox CBAscendente;
    private javax.swing.JCheckBox CBDescendente;
    private javax.swing.JPanel PGrafica;
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnLImpiar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtAlgoritmo;
    private javax.swing.JLabel txtContador;
    private javax.swing.JLabel txtDetener;
    private javax.swing.JLabel txtForma;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JLabel txtSegundos;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
