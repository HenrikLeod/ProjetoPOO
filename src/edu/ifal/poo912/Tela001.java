package edu.ifal.poo912;

//importações necessárias
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Carlos Henrique Barbosa
 * @author Danielly Gomes de Melo
 */

public class Tela001 extends javax.swing.JFrame {

    //ArrayLists/Objetos necessários
    private ArrayList<Produto>  a1 = new ArrayList<Produto>();
    private ArrayList<Previsao> a2 = new ArrayList<Previsao>();
    private Produto  p1;
    private Previsao p2;
    
    
    //variáveis globais
    private double total  = 0;
    private double total2 = 0;
    private int count     = 0;
    private boolean bool  = false;
    
    //meses do ano (para calcular qual será o próximo mês)
    private final String[] ano = {"Janeiro","Fevereiro","Março","Abril",
                          "Maio","Junho","Julho","Agosto",
                          "Setembro","Outubro","Novembro","Dezembro"};
    
    
    //construtor
    public Tela001() { initComponents();
        
        //parâmetros iniciais do jframe
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        //pede para informar o nome da lista ao iniciar
        String nome = JOptionPane.showInputDialog("Nome da lista: ", "lista01");
        
        //se o campo de nome estiver vazio, o nome padrão será "lista001"
        if(nome.equals("")) { nome = "lista01";}
        this.setTitle("Projeto - Lista de compras v1.2.0 build 3 - 20170905 - " + nome);
        
        //pede o mês atual através de uma caixa de combinação
        JComboBox jcb = new JComboBox();
        jcb.setModel(new javax.swing.DefaultComboBoxModel<>(ano));
        JOptionPane.showMessageDialog(null, jcb, "Mês atual", JOptionPane.QUESTION_MESSAGE);
        
        
        
        //passa os parâmetros para a parte "info" do jframe
        infoNome.setText("Nome da lista: " + nome);
        infoMesAtual.setText("Mês atual: " + ano[jcb.getSelectedIndex()]);
        
        //calcula qual será o próximo mês e passa para o jframe
        if(jcb.getSelectedIndex() < 11)
        {
            infoProxMes.setText("Próximo mês: " + ano[jcb.getSelectedIndex() + 1]);
        }
        else
        {
            infoProxMes.setText("Próximo mês: " + ano[0]);
        }
        
        //total das compras (listas 1 e 2).que inicialmente estão zerados
        totalAtual.setText("R$ " + total);
        totalFuturo.setText("R$ " + total);
    
        totalAtual.setEditable(false);
        totalFuturo.setEditable(false);
     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        infoNome = new javax.swing.JLabel();
        infoMesAtual = new javax.swing.JLabel();
        infoProxMes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAtual = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFutura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        totalAtual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalFuturo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ff = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEncontrados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        feedbackLabel2 = new javax.swing.JLabel();
        feedbackLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        infoNome.setText("Nome da lista:");

        infoMesAtual.setText("Mês atual: ");

        infoProxMes.setText("Próximo mês: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoMesAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoProxMes, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(infoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(infoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoMesAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoProxMes)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        listaAtual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Unidade", "Local", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaAtual);
        if (listaAtual.getColumnModel().getColumnCount() > 0) {
            listaAtual.getColumnModel().getColumn(1).setResizable(false);
            listaAtual.getColumnModel().getColumn(3).setResizable(false);
            listaAtual.getColumnModel().getColumn(4).setResizable(false);
        }

        listaFutura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Unidade", "Local", "Qtde.", "Preço", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listaFutura);
        if (listaFutura.getColumnModel().getColumnCount() > 0) {
            listaFutura.getColumnModel().getColumn(0).setResizable(false);
            listaFutura.getColumnModel().getColumn(1).setResizable(false);
            listaFutura.getColumnModel().getColumn(2).setResizable(false);
            listaFutura.getColumnModel().getColumn(3).setResizable(false);
            listaFutura.getColumnModel().getColumn(4).setResizable(false);
            listaFutura.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Mês atual:");

        jLabel2.setText("Próximo mês:");

        add2.setText("Add item");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total:");

        jLabel4.setText("Total:");

        add1.setText("Add item");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        ff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ffKeyReleased(evt);
            }
        });

        listaEncontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Unidade", "Local", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listaEncontrados);
        if (listaEncontrados.getColumnModel().getColumnCount() > 0) {
            listaEncontrados.getColumnModel().getColumn(0).setResizable(false);
            listaEncontrados.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setText("Filtro:");

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Unidade", "Local da compra", "Mais comprado", "Menos comprado" }));
        fCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jButton1)
                    .addComponent(fCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobre o projeto"));

        jLabel8.setText("Professora: Cledja Rolim");

        jLabel10.setText("Turma: 912");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Alunos"));

        jLabel9.setText("Carlos Henrique Barbosa");

        jLabel11.setText("Danielly Gomes de Melo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        jLabel12.setText("v1.2.0 build 1-20173108");

        feedbackLabel2.setForeground(new java.awt.Color(36, 202, 35));

        feedbackLabel.setForeground(new java.awt.Color(36, 202, 35));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ifal/poo912/logo_ifal.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAtual)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalFuturo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(feedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(feedbackLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(feedbackLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add2)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalFuturo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //se eu alterar o filtro de pesquisa durante a execução do programa
    private void fComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fComboActionPerformed
        // TODO add your handling code here:
        int filtro = fCombo.getSelectedIndex();
        int mc, pos;
        String nome, unit, local, qtde, preço;
        String aux = ff.getText();
        
        DefaultTableModel tb3 = (DefaultTableModel) listaEncontrados.getModel();
        
        tb3.setNumRows(0);
        switch(filtro)
        {
            case 0:
                ff.setEditable(true);
                break;
            case 1:
                ff.setEditable(true);
                break;
            case 2:
                ff.setEditable(true);
                break;
            case 3:
                ff.setEditable(false);
            mc  = 0;
            pos = 0;
            
            for(int i = 0 ; i < a1.size() ; i ++)
            {
                if(a1.get(i).getQuantidade() > mc)
                {
                    mc = a1.get(i).getQuantidade();
                    pos = i;
                }
            }
            
            nome  = a1.get(pos).getNome();
            unit  = a1.get(pos).getUnidade();
            local = a1.get(pos).getLocal();
            qtde  = Integer.toString(a1.get(pos).getQuantidade());
            preço = Double.toString(a1.get(pos).getPreço());
        
            String[] linha_1 = 
            {
              nome,
              unit,
              local,
              qtde,
              preço
            };
            tb3.addRow(linha_1);
            break;
            
            case 4:
                ff.setEditable(false);
                mc  = a1.get(0).getQuantidade();
                pos = 0;
            for(int i = 0 ; i < a1.size() ; i ++)
            {
                if(a1.get(i).getQuantidade() < mc)
                {
                    mc = a1.get(i).getQuantidade();
                    pos = i;
                }
            }
            
            nome  = a1.get(pos).getNome();
            unit  = a1.get(pos).getUnidade();
            local = a1.get(pos).getLocal();
            qtde  = Integer.toString(a1.get(pos).getQuantidade());
            preço = Double.toString(a1.get(pos).getPreço());
        
            String[] linha_2 = 
            {
              nome,
              unit,
              local,
              qtde,
              preço
            };
            tb3.addRow(linha_2);
            break;
            
            
        }
    }//GEN-LAST:event_fComboActionPerformed

   
    //se eu apertar o botão "Add item" da tabela 1
    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {

        //cria caixas de entrada pedindo os dados
        String nome       = JOptionPane.showInputDialog("Nome do produto: ");
        String unidade    = JOptionPane.showInputDialog("Unidade");
        String local      = JOptionPane.showInputDialog("Local da compra: ");
        String quantidade = null;
        String preço      = null;
        
        //verifica se os dados QUANTIDADE e PREÇO podem ser convertidos

        //quantidade
        while(bool != true)
        {
          quantidade = JOptionPane.showInputDialog("Quantidade: ");
          try{ //yep
          Integer.parseInt(quantidade);
          bool = true;
        }catch(NumberFormatException exc){ //nope
            bool = false;
            JOptionPane.showMessageDialog(null, "ERRO!\nNão se trata de um numero inteiro");
        }
        }
        bool = false;
        
        //preço
        while(bool != true)
        {
          preço = JOptionPane.showInputDialog("Preço em R$: ");
          try{
            Double.parseDouble(preço);
            bool = true;
             }catch(NumberFormatException exc){
            bool = false;
            JOptionPane.showMessageDialog(null, "ERRO!\nNão se trata de um numero");
             }
        }
        bool = false;
 
        DefaultTableModel tb1 = (DefaultTableModel) listaAtual.getModel();
        DefaultTableModel tb2 = (DefaultTableModel) listaFutura.getModel();
        //cria um vetor de string para passar os dados para a tabela
        String[] linha = 
        {
          nome,
          unidade,
          local,
          quantidade,
          preço
        };
        

        //inicializa um objeto produto
        p1 = new Produto();
        
        p1.setNome(nome);
        p1.setUnidade(unidade);
        p1.setLocal(local);
        p1.setQuantidade(Integer.parseInt(quantidade));
        p1.setPreço(Double.parseDouble(preço));

        //caixa de confirmação
    

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente adicionar " + nome + "?");
        
        if(resposta == JOptionPane.YES_OPTION)
        {
          //se for SIM, o objeto preenchido é adicionado a tabela
          //o conceito de arrayList é basicamente esse
          a1.add(p1);
          
          //adiciona o novo produto a tabela
          tb1.addRow(linha);
          int inserirNaListaFutura = JOptionPane.showConfirmDialog(null, "Deseja adicionar " + nome + " a lista da previsão?");
          
          if(inserirNaListaFutura == JOptionPane.YES_OPTION)
          {
              JComboBox j1 = new JComboBox<>();
              j1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Essencial", "Importante", "Secundario"}));
              JOptionPane.showMessageDialog(null, j1, "Categoria: ", JOptionPane.QUESTION_MESSAGE);
              
              p2 = new Previsao();
        
              p2.setNome(nome);
              p2.setUnidade(unidade);
              p2.setLocal(local);
              p2.setQuantidade(Integer.parseInt(quantidade));
              p2.setPreço(Double.parseDouble(preço));
              p2.setCategoria(j1.getSelectedItem().toString());
              
               String[] linhaF = 
                {
                 nome,
                 unidade,
                 local,
                 quantidade,
                 preço,
                 p2.getCategoria()
                };
               
              a2.add(p2);
              tb2.addRow(linhaF);
              total2 = total2 + (p2.getPreço()*p2.getQuantidade());
              totalFuturo.setText("R$ " + total2);
              listaFutura.setRowSorter(new TableRowSorter(tb2));
              TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tb2);
              feedbackLabel.setText("Dica: para organizar, basta clicar sobre a coluna.");
              
          }
          //calcula o novo total das compras
          total = total + (p1.getPreço()*p1.getQuantidade());

          //permite organizar os elementos da tabela na ordem, somente clicando sobre a coluna
          listaAtual.setRowSorter(new TableRowSorter(tb1));
          TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tb1);
          feedbackLabel2.setText("Dica: para organizar, basta clicar sobre a coluna.");

          //atualiza o campo "Total"
          totalAtual.setText("R$ " + total);
        }
        else
        {
            //caso seja NÃO
            JOptionPane.showMessageDialog(null, "O produto não foi adicionado.");
        }
        
        
    }
    

    //se eu apertar o botão "Add Item" da tabela 2
    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        //é um ctrl+C ctrl-V do outro botão, porém adiciona também a categoria (essencial, importante, secundario)
        JComboBox j1 = new JComboBox<>();
        j1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Essencial", "Importante", "Secundario"}));
        
        String nome       = JOptionPane.showInputDialog("Nome do produto: ");
        String unidade    = JOptionPane.showInputDialog("Unidade");
        String local      = JOptionPane.showInputDialog("Local da compra: ");
        String quantidade = null;
        String preço      = null;
        
        
        while(bool != true)
        {
          quantidade = JOptionPane.showInputDialog("Quantidade: ");
          try{
          Integer.parseInt(quantidade);
          bool = true;
        }catch(NumberFormatException exc){
            bool = false;
            JOptionPane.showMessageDialog(null, "ERRO!\nNão se trata de um numero inteiro");
        }
        }
        bool = false;
        
        while(bool != true)
        {
          preço = JOptionPane.showInputDialog("Preço em R$: ");
          try{
            Double.parseDouble(preço);
            bool = true;
             }catch(NumberFormatException exc){
            bool = false;
            JOptionPane.showMessageDialog(null, "ERRO!\nNão se trata de um numero");
             }
        }
        bool = false;
        
        
        JOptionPane.showMessageDialog(null, j1, "Categoria: ", JOptionPane.QUESTION_MESSAGE);
        
       DefaultTableModel tb2 = (DefaultTableModel) listaFutura.getModel();
       
        
        
        p2 = new Previsao();
        
        p2.setNome(nome);
        p2.setUnidade(unidade);
        p2.setLocal(local);
        p2.setQuantidade(Integer.parseInt(quantidade));
        p2.setPreço(Double.parseDouble(preço));
        p2.setCategoria(j1.getSelectedItem().toString());
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente adicionar " + nome + "?");
        
        String[] linha = 
        {
          nome,
          unidade,
          local,
          quantidade,
          preço,
          p2.getCategoria()
        };
        
        
        if(resposta == JOptionPane.YES_OPTION)
        {
          a2.add(p2);
          tb2.addRow(linha);
          total2 = total2 + (p2.getPreço()*p2.getQuantidade());
          totalFuturo.setText("R$ " + total2);
          listaFutura.setRowSorter(new TableRowSorter(tb2));
          TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tb2);
          feedbackLabel.setText("Dica: para organizar, basta clicar sobre a coluna.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O produto não foi adicionado.");
        }
    }

    
    //se eu apertar alguma tecla no campo de fitragem
    private void ffKeyReleased(java.awt.event.KeyEvent evt) {
        String text = ff.getText();
        
        DefaultTableModel tb3 = (DefaultTableModel) listaEncontrados.getModel();
 
        //esvazia a tabela (evita bugs)
        tb3.setNumRows(0);
        
        int filtro = fCombo.getSelectedIndex();
        for(int i = 0 ; i < a1.size() ; i ++)
        {
            //se achar algo no arraylist que coincida com a pesquisa, ele mostra
            //arrayList não se usa [] para localizar a posição, e sim "get(int posição)"
            
        switch(filtro)
        {
            case 0:
            if(a1.get(i).getNome().toLowerCase().startsWith(text))
            {   
        String nome  = a1.get(i).getNome();
        String unit  = a1.get(i).getUnidade();
        String local = a1.get(i).getLocal();
        String qtde  = Integer.toString(a1.get(i).getQuantidade());
        String preço = Double.toString(a1.get(i).getPreço());
        
        String[] linha = 
        {
          nome,
          unit,
          local,
          qtde,
          preço
        };
            tb3.addRow(linha);
        }
            break;
            case 1:
                if(a1.get(i).getUnidade().toLowerCase().startsWith(text))
            {   
        String nome  = a1.get(i).getNome();
        String unit  = a1.get(i).getUnidade();
        String local = a1.get(i).getLocal();
        String qtde  = Integer.toString(a1.get(i).getQuantidade());
        String preço = Double.toString(a1.get(i).getPreço());
        
        String[] linha = 
        {
          nome,
          unit,
          local,
          qtde,
          preço
        };
            tb3.addRow(linha);
        }
                break;
            case 2:
                if(a1.get(i).getLocal().toLowerCase().startsWith(text))
            {   
        String nome  = a1.get(i).getNome();
        String unit  = a1.get(i).getUnidade();
        String local = a1.get(i).getLocal();
        String qtde  = Integer.toString(a1.get(i).getQuantidade());
        String preço = Double.toString(a1.get(i).getPreço());
        
        String[] linha = 
        {
          nome,
          unit,
          local,
          qtde,
          preço
        };
            tb3.addRow(linha);
        }
                break;
        }
        
            
        }
    }


    //se eu apertar o botão "limpar"
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
         DefaultTableModel tb3 = (DefaultTableModel) listaEncontrados.getModel();
         tb3.setNumRows(0);
    }

    
    
    
    
    
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        
        //Look and Feel
        UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela001().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JComboBox<String> fCombo;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JLabel feedbackLabel2;
    private javax.swing.JTextField ff;
    private javax.swing.JLabel infoMesAtual;
    private javax.swing.JLabel infoNome;
    private javax.swing.JLabel infoProxMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaAtual;
    private javax.swing.JTable listaEncontrados;
    private javax.swing.JTable listaFutura;
    private javax.swing.JTextField totalAtual;
    private javax.swing.JTextField totalFuturo;
    // End of variables declaration//GEN-END:variables
}
