
package cincoenraya;

import javax.swing.JOptionPane;

/**
 *
 * @author Oliverco
 */
public class CincoEnRaya extends javax.swing.JInternalFrame {

    Object MatrizGeneral[][];
    int turno;
    int ContadorOblicuaXUno,ContadorOblicuaXDos;
    int ContadorOblicuaOUno,ContadorOblicuaODos;
    int ContadosVerticalX,ContadosVerticalO;
    int ContadorHorizontalX,ContadorHorizontalO;
    String LetraGanador;
    int contadorGeneral;
    public CincoEnRaya() {
        initComponents();
        turno=0;
        MatrizGeneral();
        contadorGeneral=0;
        jLabel3.setText("X");
    }
    public void NoGanador(){
        if (contadorGeneral==24) {
            jLabel2.setText("No hay");
            jLabel3.setText("Ganador!!!!");
            JOptionPane.showMessageDialog(this,"No hay Ganador");
            
        }
    }
    public void MatrizGeneral(){
        
        MatrizGeneral = new Object[5][5];
        for (int i = 0; i < MatrizGeneral.length; i++) {
            for (int j = 0; j < MatrizGeneral[0].length; j++) {
                MatrizGeneral[i][j]="l";
            }
        }
        
    }
    public void VerificarGanador(){
        //Oblicua 1
        ContadorOblicuaXUno=0;
        ContadorOblicuaOUno=0;
        ContadorOblicuaXDos=0;
        ContadorOblicuaODos=0;
        ContadosVerticalX=0;
        ContadosVerticalO=0;
        ContadorHorizontalO=0;
        ContadorHorizontalX=0;
        int k=0;  
        while (k<5) {
            if (MatrizGeneral[k][k]=="X") {
                ContadorOblicuaXUno++;
                LetraGanador="X";
            }
            if (MatrizGeneral[k][k]=="O") {
                ContadorOblicuaOUno++;
                LetraGanador="O";
            }
            k++;
        }
        //Oblicua 2
        int f=0,c=4;
        while (f<5){
            if (MatrizGeneral[f][c]=="X") {
                ContadorOblicuaXDos++;
                LetraGanador="X";
            }
            if (MatrizGeneral[f][c]=="O") {
                ContadorOblicuaODos++;
                LetraGanador="O";
            }
            f++;c--;
        }
        if (ContadorOblicuaXUno==5||ContadorOblicuaOUno==5||ContadorOblicuaXDos==5||ContadorOblicuaODos==5) {
            MensajeGanador(LetraGanador);
        }
        //Vertical
        for (int i = 0; i < MatrizGeneral.length; i++) {
            if (MatrizGeneral[0][i]=="X") {
                int j =0;
                while (j<5) {
                    if (MatrizGeneral[j][i]=="X") {
                        ContadosVerticalX++;
                        LetraGanador="X";
                        if (ContadosVerticalX==5) {
                            MensajeGanador(LetraGanador);
                        }
                    }
                    j++;
                }
                ContadosVerticalX=0;
            }
            if (MatrizGeneral[0][i]=="O") {
                int j = 0;
                while (j<5) {
                    if (MatrizGeneral[j][i]=="O") {
                        ContadosVerticalO++;
                        LetraGanador="O";
                        if (ContadosVerticalO==5) {
                            MensajeGanador(LetraGanador);
                        }
                    }
                    j++;
                }
                ContadosVerticalO=0;
            }
        }
        //Horizontal 
        for (int i = 0; i < MatrizGeneral[0].length; i++) {
            if (MatrizGeneral[i][0]=="X") {
                int j=0;
                while (j<5) {
                    if (MatrizGeneral[i][j]=="X") {
                        ContadorHorizontalX++;
                        LetraGanador="X";
                        if (ContadorHorizontalX==5) {
                            MensajeGanador(LetraGanador);
                        }
                    }
                    j++;
                }
                ContadorHorizontalX=0;
            }
            if (MatrizGeneral[i][0]=="O") {
                int j=0;
                while (j<5) {
                    if (MatrizGeneral[i][j]=="O") {
                        ContadorHorizontalO++;
                        LetraGanador="O";
                        if (ContadorHorizontalO==5) {
                            MensajeGanador(LetraGanador);
                        }
                    }
                    j++;
                }
                ContadorHorizontalO=0;
            }
        }
        NoGanador();
    }
    public void Actualizar(int Fila,int Columna,int turno){
        if (turno==1) {
            MatrizGeneral[Fila][Columna]="X";
        }else{
            MatrizGeneral[Fila][Columna]="O";
        }
        if (jLabel3.getText().equals("X")) {
            jLabel3.setText("O");
        }else{
            jLabel3.setText("X");
        }
        
    }
    public void Asterizcos(){
        if (jButton1.getText().length()==0) {jButton1.setText("*");}
        if (jButton2.getText().length()==0) {jButton2.setText("*");}
        if (jButton3.getText().length()==0) {jButton3.setText("*");}
        if (jButton4.getText().length()==0) {jButton4.setText("*");}
        if (jButton5.getText().length()==0) {jButton5.setText("*");}
        if (jButton6.getText().length()==0) {jButton6.setText("*");}
        if (jButton7.getText().length()==0) {jButton7.setText("*");}
        if (jButton8.getText().length()==0) {jButton8.setText("*");}
        if (jButton9.getText().length()==0) {jButton9.setText("*");}
        if (jButton10.getText().length()==0) {jButton10.setText("*");}
        if (jButton11.getText().length()==0) {jButton11.setText("*");}
        if (jButton12.getText().length()==0) {jButton12.setText("*");}
        if (jButton13.getText().length()==0) {jButton13.setText("*");}
        if (jButton14.getText().length()==0) {jButton14.setText("*");}
        if (jButton15.getText().length()==0) {jButton15.setText("*");}
        if (jButton16.getText().length()==0) {jButton16.setText("*");}
        if (jButton17.getText().length()==0) {jButton17.setText("*");}
        if (jButton18.getText().length()==0) {jButton18.setText("*");}
        if (jButton19.getText().length()==0) {jButton19.setText("*");}
        if (jButton20.getText().length()==0) {jButton20.setText("*");}
        if (jButton21.getText().length()==0) {jButton21.setText("*");}
        if (jButton22.getText().length()==0) {jButton22.setText("*");}
        if (jButton23.getText().length()==0) {jButton23.setText("*");}
        if (jButton24.getText().length()==0) {jButton24.setText("*");}
        if (jButton25.getText().length()==0) {jButton25.setText("*");}
    }
    public void MensajeGanador(String Ganador){
        jLabel2.setText("El Ganador es :");
        jLabel3.setText(Ganador);
        JOptionPane.showMessageDialog(this,"El Ganador es :"+Ganador);
        Asterizcos();
        contadorGeneral=0;
        
}
    public void mensajeAlerta(){
    JOptionPane.showMessageDialog(this,"Jugada no Válida");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("Juego \"5 En Raya\" ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turno de :");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jLabel4.setText("by Yeiner Elismer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if (jButton1.getText().length()==0) {
            jButton1.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(0,0,1);
            }else{
                Actualizar(0,0,0);
            }
            VerificarGanador();
            contadorGeneral++;
        }else{
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.getText().length()==0) {
            jButton2.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(0,1,1);
            }else{
                Actualizar(0,1,0);
            }
            VerificarGanador();
            contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getText().length()==0) {
            jButton3.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(0,2,1);
            }else{
                Actualizar(0,2,0);
            }
            VerificarGanador();
            contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jButton4.getText().length()==0) {
            jButton4.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(0,3,1);
            }else{
                Actualizar(0,3,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jButton5.getText().length()==0) {
            jButton5.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(0,4,1);
            }else{
                Actualizar(0,4,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (jButton7.getText().length()==0) {
            jButton7.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(1,0,1);
            }else{
                Actualizar(1,0,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (jButton8.getText().length()==0) {
            jButton8.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(1,1,1);
            }else{
                Actualizar(1,1,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (jButton9.getText().length()==0) {
            jButton9.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(1,2,1);
            }else{
                Actualizar(1,2,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (jButton10.getText().length()==0) {
            jButton10.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(1,3,1);
            }else{
                Actualizar(1,3,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jButton6.getText().length()==0) {
            jButton6.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(1,4,1);
            }else{
                Actualizar(1,4,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if (jButton11.getText().length()==0) {
             jButton11.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(2,0,1);
            }else{
                Actualizar(2,0,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if (jButton13.getText().length()==0) {
            jButton13.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(2,1,1);
            }else{
                Actualizar(2,1,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
        if (jButton15.getText().length()==0) {
            jButton15.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(2,2,1);
            }else{
                Actualizar(2,2,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if (jButton14.getText().length()==0) {
            jButton14.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(2,3,1);
            }else{
                Actualizar(2,3,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if (jButton12.getText().length()==0) {
            jButton12.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(2,4,1);
            }else{
                Actualizar(2,4,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if (jButton20.getText().length()==0) {
            jButton20.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(3,0,1);
            }else{
                Actualizar(3,0,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if (jButton16.getText().length()==0) {
            jButton16.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(3,1,1);
            }else{
                Actualizar(3,1,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if (jButton18.getText().length()==0) {
            jButton18.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(3,2,1);
            }else{
                Actualizar(3,2,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if (jButton19.getText().length()==0) {
            jButton19.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(3,3,1);
            }else{
                Actualizar(3,3,0);
            }
        VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if (jButton17.getText().length()==0) {
            jButton17.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(3,4,1);
            }else{
                Actualizar(3,4,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if (jButton21.getText().length()==0) {
            jButton21.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(4,0,1);
            }else{
                Actualizar(4,0,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if (jButton22.getText().length()==0) {
            jButton22.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(4,1,1);
            }else{
                Actualizar(4,1,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if (jButton23.getText().length()==0) {
            jButton23.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(4,2,1);
            }else{
                Actualizar(4,2,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if (jButton24.getText().length()==0) {
            jButton24.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(4,3,1);
            }else{
                Actualizar(4,3,0);
            }
            VerificarGanador();contadorGeneral++;
            
            
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if (jButton25.getText().length()==0) {
            jButton25.setText(jLabel3.getText());
            if (jLabel3.getText().equals("X")) {
                Actualizar(4,4,1);
            }else{
                Actualizar(4,4,0);
            }
            VerificarGanador();contadorGeneral++;
        } else {
            mensajeAlerta();
        }
        
        
    }//GEN-LAST:event_jButton25ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
