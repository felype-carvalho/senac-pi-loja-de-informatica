package br.senac.sp.pi.view;

import br.senac.sp.pi.controller.ClienteController;
import javax.swing.JOptionPane;
import br.senac.sp.pi.model.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CadastroClientes extends javax.swing.JFrame {
    public String modoTela = "Criação";
    Cliente objCliente;

    public CadastroClientes() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Cadastro de Clientes"); //altera titulo da janela
        objCliente = new Cliente();

        //Carregar todos os clientes na tabela ao iniciar este JFrame
        CarregarJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pnlCadastro = new javax.swing.JPanel();
        lblCadastroNomeCliente = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblDataNacismento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadastroNome = new javax.swing.JTextPane();
        txtCadastroCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCadastroEmail = new javax.swing.JTextPane();
        cboEstdCivil = new javax.swing.JComboBox<>();
        txtCadastroDataNasci = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCadastroEndereco = new javax.swing.JTextPane();
        cboUF = new javax.swing.JComboBox<>();
        txtCadastroCEP = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCadastroCidade = new javax.swing.JTextPane();
        btnSalvarCliente = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblComplemento = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCadastroComplemento = new javax.swing.JTextPane();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtConsultaCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtConsultaNomeCliente = new javax.swing.JTextPane();
        lblConsultaCPFCliente = new javax.swing.JLabel();
        lblConsultaNomeCliente = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuOpcoes1 = new javax.swing.JMenu();
        opMenuPrincipal1 = new javax.swing.JMenuItem();
        opCadastroProdutos1 = new javax.swing.JMenuItem();
        opTelaVendas1 = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        opRelatorioAnalitico = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opSair1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblCadastroNomeCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCadastroNomeCliente.setText("Nome*:");

        lblCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCPF.setText("CPF*:");

        lblEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEndereco.setText("Endereço*:");

        lblCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCidade.setText("Cidade*:");

        lblUF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUF.setText("UF*:");

        lblCEP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCEP.setText("CEP*:");

        lblTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEmail.setText("E-mail*:");

        lblEstadoCivil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEstadoCivil.setText("Estado Civil:");

        lblDataNacismento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDataNacismento.setText("Data de Nascimento*:");

        jScrollPane1.setViewportView(txtCadastroNome);

        try {
            txtCadastroCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtCadastroEmail);

        cboEstdCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)" }));

        try {
            txtCadastroDataNasci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane3.setViewportView(txtCadastroEndereco);

        cboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        try {
            txtCadastroCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportView(txtCadastroCidade);

        btnSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_salvar.png"))); // NOI18N
        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblComplemento.setText("Complemento*:");

        jScrollPane7.setViewportView(txtCadastroComplemento);

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(txtCadastroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCadastroNomeCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblComplemento, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                                        .addComponent(txtCadastroCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstadoCivil)
                                    .addComponent(lblDataNacismento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCadastroDataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEstdCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pnlCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4});

        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtCadastroCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF)
                            .addComponent(cboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplemento))
                        .addGap(9, 9, 9)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataNacismento)
                            .addComponent(txtCadastroDataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadastroNomeCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco))))
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEstdCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstadoCivil))
                        .addGap(12, 12, 12)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCidade))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone)
                            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCPF)
                                .addComponent(txtCadastroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefone)))))
                .addContainerGap())
        );

        pnlCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCadastroCEP, txtCadastroDataNasci});

        pnlCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4});

        pnlConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Tel", "Email", "Data Nascimento", "Estado Civil", "Endereço", "Complemento", "CEP", "Cidade", "UF"
            }
        ));
        jScrollPane5.setViewportView(tblClientes);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        try {
            txtConsultaCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Pesquise o cliente pelo nome ou CPF");

        jScrollPane6.setViewportView(txtConsultaNomeCliente);

        lblConsultaCPFCliente.setText("CPF:");

        lblConsultaNomeCliente.setText("Nome:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_buscar2.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblConsultaNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConsultaCPFCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultaNomeCliente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblConsultaCPFCliente)
                        .addComponent(txtConsultaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_remover.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar)
                        .addComponent(btnRemover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlConsultaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnRemover});

        menuOpcoes1.setText("Opções");

        opMenuPrincipal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        opMenuPrincipal1.setText("Menu Principal");
        opMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipal1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opMenuPrincipal1);

        opCadastroProdutos1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        opCadastroProdutos1.setText("Casdastro de Produtos");
        opCadastroProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutos1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroProdutos1);

        opTelaVendas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        opTelaVendas1.setText("Tela de Vendas");
        opTelaVendas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendas1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opTelaVendas1);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios Sintéticos");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opRelatorioSintetico);

        opRelatorioAnalitico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opRelatorioAnalitico.setText("Relatórios Analíticos");
        opRelatorioAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioAnaliticoActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opRelatorioAnalitico);
        menuOpcoes1.add(jSeparator2);

        opSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair1.setText("Sair");
        opSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSair1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opSair1);

        jMenuBar2.add(menuOpcoes1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCadastroNome.setText("");
        txtCadastroCPF.setText("");
        txtTelefone.setText("");
        txtCadastroEmail.setText(""); 
        txtCadastroDataNasci.setText("");
        txtCadastroEndereco.setText("");
        txtCadastroComplemento.setText("");
        txtCadastroCEP.setText(""); 
        txtCadastroCidade.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void opMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipal1ActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipal1ActionPerformed

    private void opCadastroProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutos1ActionPerformed
        CadastroProdutos telaCadastroProdutos = new CadastroProdutos();
        telaCadastroProdutos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroProdutos1ActionPerformed

    private void opTelaVendas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaVendas1ActionPerformed
        TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaVendas1ActionPerformed

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    private void opSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSair1ActionPerformed

    private void opRelatorioAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioAnaliticoActionPerformed
        TelaRelatorioAnalitico telaRelatorio = new TelaRelatorioAnalitico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioAnaliticoActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        //Verificação de campos obrigatórios
        if (txtCadastroNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome do cliente!");
            return;
        }
         if (txtCadastroEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o email do cliente!");
            return;
        }
         if (txtCadastroEndereco.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o endereço do cliente!");
            return;
        }
         if (txtCadastroCidade.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a cidade do cliente!");
            return;
        }

        if (txtCadastroCPF.getText().trim().length() == 9) {
            JOptionPane.showMessageDialog(this, "Digite o CPF do cliente!");
            return;
        }
        
        if (txtCadastroCEP.getText().trim().length() == 1) {
            JOptionPane.showMessageDialog(this, "Digite o CEP do cliente!");
            return;
        }
        
        if (cboUF.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(this, "Selecione uma UF!");
            return;
        }
        
        if (txtCadastroComplemento.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o complemento de endereço do cliente!");
            return;
        }

        if (txtCadastroDataNasci.getText().trim().length() == 4) {
            JOptionPane.showMessageDialog(this, "Digite a data de nascimento do cliente!");
            return;
        }
        
        if (cboEstdCivil.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(this, "Selecione um estado civil!");
            return;
        }       

        //Salvar os dados informados na Tabela Clientes
        String nome = txtCadastroNome.getText();
        String cpf = txtCadastroCPF.getText();
        String telefone = txtTelefone.getText();
        String email = txtCadastroEmail.getText();
        String nascimento = txtCadastroDataNasci.getText();
        String estadoCivil = cboEstdCivil.getSelectedItem().toString();
        String endereco = txtCadastroEndereco.getText();
        String complemento = txtCadastroComplemento.getText();
        String cep = txtCadastroCEP.getText();
        String cidade = txtCadastroCidade.getText();
        String UF = cboUF.getSelectedItem().toString();;

        SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd-MM-yyyy");
        Date dataNascimento = new Date();
        try {
            dataNascimento = formatadorDatas.parse(nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean retorno = false;
        objCliente.setNome(nome);
        objCliente.setCpf(cpf);
        objCliente.setTelNumber(telefone);
        objCliente.setEmail(email);
        objCliente.setDataNascimento(dataNascimento);
        objCliente.setEstadoCivil(estadoCivil);
        objCliente.setEndereco(endereco);
        objCliente.setComplemento(complemento);
        objCliente.setCep(cep);
        objCliente.setCidade(cidade);
        objCliente.setUf(UF);

        if (modoTela.equals("Criação")) {
            try {
                retorno = ClienteController.salvar(objCliente);
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR!");
            }

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                CarregarJTable();
                txtCadastroNome.setText("");
                txtCadastroCPF.setText("");
                txtTelefone.setText("");
                txtCadastroEmail.setText(""); 
                txtCadastroDataNasci.setText("");
                txtCadastroEndereco.setText("");
                txtCadastroComplemento.setText("");
                txtCadastroCEP.setText("");
                txtCadastroCidade.setText("");
                cboEstdCivil.setSelectedItem("-");
                cboUF.setSelectedItem("-");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar o cliente!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                retorno = ClienteController.alteracaoSalvar(objCliente);
                CarregarJTable();
                txtCadastroNome.setText("");
                txtCadastroCPF.setText("");
                txtTelefone.setText("");
                txtCadastroEmail.setText("");
                txtCadastroDataNasci.setText("");
                txtCadastroEndereco.setText("");
                txtCadastroComplemento.setText("");
                txtCadastroCEP.setText("");
                txtCadastroCidade.setText("");
                cboEstdCivil.setSelectedItem("-");
                cboUF.setSelectedItem("-");
                
                modoTela = "Criação";
                this.btnSalvarCliente.setText("Salvar");
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Compra alterada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao alterar o produto!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(tblClientes.getRowCount()>0) {
            int numeroLinha = tblClientes.getSelectedRow();

            int idCliente = Integer.parseInt(tblClientes.getModel().getValueAt(numeroLinha, 0).toString());
            String nome = tblClientes.getModel().getValueAt(numeroLinha, 1).toString();
            String cpf = tblClientes.getModel().getValueAt(numeroLinha, 2).toString();
            String telefone = tblClientes.getModel().getValueAt(numeroLinha, 3).toString();
            String email = tblClientes.getModel().getValueAt(numeroLinha, 4).toString();
            String nascimento = tblClientes.getModel().getValueAt(numeroLinha, 5).toString();
            String estadoCivil = tblClientes.getModel().getValueAt(numeroLinha, 6).toString();
            String endereco = tblClientes.getModel().getValueAt(numeroLinha, 7).toString();
            String complemento = tblClientes.getModel().getValueAt(numeroLinha, 8).toString();
            String cep = tblClientes.getModel().getValueAt(numeroLinha, 9).toString();
            String cidade = tblClientes.getModel().getValueAt(numeroLinha, 10).toString();
            String UF = tblClientes.getModel().getValueAt(numeroLinha, 11).toString();
            
            SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd-MM-yyyy");
            Date dataNascimento = new Date();
            try {
                dataNascimento = formatadorDatas.parse(nascimento);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtCadastroNome.setText(nome);
            txtCadastroCPF.setText(cpf);
            txtTelefone.setText(telefone);
            txtCadastroEmail.setText(email);
            txtCadastroDataNasci.setText(formatadorDatas.format(dataNascimento));
            cboEstdCivil.setSelectedItem(estadoCivil);
            txtCadastroEndereco.setText(endereco);
            txtCadastroComplemento.setText(complemento);
            txtCadastroCEP.setText(cep);
            txtCadastroCidade.setText(cidade);
            cboUF.setSelectedItem(UF);

            objCliente.setId(idCliente);
            objCliente.setNome(nome);
            objCliente.setCpf(cpf);
            objCliente.setTelNumber(telefone);
            objCliente.setEmail(email);
            objCliente.setDataNascimento(dataNascimento);
            objCliente.setEstadoCivil(estadoCivil);
            objCliente.setEndereco(endereco);
            objCliente.setComplemento(complemento);
            objCliente.setCep(cep);
            objCliente.setCidade(cidade);
            objCliente.setUf(UF);

            modoTela = "Alteração";
            this.btnSalvarCliente.setText("Alterar");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if(tblClientes.getRowCount() > 0) {
            int numeroLinha = tblClientes.getSelectedRow();
            int idCliente = Integer.parseInt(tblClientes.getModel().getValueAt(numeroLinha, 0).toString());
            try {
                if(ClienteController.exclusao(idCliente)){
                    JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Falha ao excluir cliente!", "Falha", JOptionPane.ERROR_MESSAGE);      
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR!");
            }
            CarregarJTable();
        } else {
           JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomeCliente = txtConsultaNomeCliente.getText();
        String cpfCliente = txtConsultaCPF.getText();
        ArrayList<String[]> listaCliente = ClienteController.pesquisaPorNomeOuCpf(nomeCliente, cpfCliente);

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("Id");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("Cpf");
        tmCliente.addColumn("Tel");
        tmCliente.addColumn("Email");
        tmCliente.addColumn("Data Nascimento");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("Complemento");
        tmCliente.addColumn("CEP");
        tmCliente.addColumn("Cidade");
        tmCliente.addColumn("Uf");
        tblClientes.setModel(tmCliente);
        tmCliente.setRowCount(0);
        
        for (String[] item : listaCliente) {
            tmCliente.addRow(item);
        }

        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100); // Cpf
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Telefone
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(200); // Email
        tblClientes.getColumnModel().getColumn(5).setPreferredWidth(80); // Data Nascimento
        tblClientes.getColumnModel().getColumn(6).setPreferredWidth(120); // Estado Civil
        tblClientes.getColumnModel().getColumn(7).setPreferredWidth(250); // Endereco
        tblClientes.getColumnModel().getColumn(8).setPreferredWidth(150); // Complemento
        tblClientes.getColumnModel().getColumn(9).setPreferredWidth(80); // CEP
        tblClientes.getColumnModel().getColumn(10).setPreferredWidth(95); // Cidade
        tblClientes.getColumnModel().getColumn(11).setPreferredWidth(50); // UF
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void CarregarJTable() {
        ArrayList<String[]> listaCliente = ClienteController.listar();
        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("Id");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("Cpf");
        tmCliente.addColumn("Tel");
        tmCliente.addColumn("Email");
        tmCliente.addColumn("Data Nascimento");
        tmCliente.addColumn("Estado Civil");
        tmCliente.addColumn("Endereço");
        tmCliente.addColumn("Complemento");
        tmCliente.addColumn("CEP");
        tmCliente.addColumn("Cidade");
        tmCliente.addColumn("Uf");
        tblClientes.setModel(tmCliente);
        tmCliente.setRowCount(0);

        for (String[] item : listaCliente) {
            tmCliente.addRow(item);
        }

        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100); // Cpf
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Telefone
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(200); // Email
        tblClientes.getColumnModel().getColumn(5).setPreferredWidth(80); // Data Nascimento
        tblClientes.getColumnModel().getColumn(6).setPreferredWidth(120); // Estado Civil
        tblClientes.getColumnModel().getColumn(7).setPreferredWidth(250); // Endereco
        tblClientes.getColumnModel().getColumn(8).setPreferredWidth(150); // Complemento
        tblClientes.getColumnModel().getColumn(9).setPreferredWidth(80); // CEP
        tblClientes.getColumnModel().getColumn(10).setPreferredWidth(95); // Cidade
        tblClientes.getColumnModel().getColumn(11).setPreferredWidth(50); // UF
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<String> cboEstdCivil;
    private javax.swing.JComboBox<String> cboUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastroNomeCliente;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblConsultaCPFCliente;
    private javax.swing.JLabel lblConsultaNomeCliente;
    private javax.swing.JLabel lblDataNacismento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JMenu menuOpcoes1;
    private javax.swing.JMenuItem opCadastroProdutos1;
    private javax.swing.JMenuItem opMenuPrincipal1;
    private javax.swing.JMenuItem opRelatorioAnalitico;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair1;
    private javax.swing.JMenuItem opTelaVendas1;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCadastroCEP;
    private javax.swing.JFormattedTextField txtCadastroCPF;
    private javax.swing.JTextPane txtCadastroCidade;
    private javax.swing.JTextPane txtCadastroComplemento;
    private javax.swing.JFormattedTextField txtCadastroDataNasci;
    private javax.swing.JTextPane txtCadastroEmail;
    private javax.swing.JTextPane txtCadastroEndereco;
    private javax.swing.JTextPane txtCadastroNome;
    private javax.swing.JFormattedTextField txtConsultaCPF;
    private javax.swing.JTextPane txtConsultaNomeCliente;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
