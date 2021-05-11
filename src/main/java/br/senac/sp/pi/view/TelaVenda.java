package br.senac.sp.pi.view;

import br.senac.sp.pi.model.VendaProduto;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaVenda extends javax.swing.JFrame {
    
    VendaProduto objVendas;

    public TelaVenda() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Vendas"); //altera titulo da janela
        objVendas = new VendaProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pnlAdicionaProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhesProduto = new javax.swing.JTable();
        btnAdicionarCarrinho = new javax.swing.JButton();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        lblQuantidadeProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        pnlCarrinho = new javax.swing.JPanel();
        lblValorTotalVenda = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        btnRemoverVenda = new javax.swing.JButton();
        lblClienteCarrinho = new javax.swing.JLabel();
        lblCpfCarrinho = new javax.swing.JLabel();
        pnlSelecionarCliente = new javax.swing.JPanel();
        lblNomeClienteVenda = new javax.swing.JLabel();
        txtNomeClienteVenda = new javax.swing.JTextField();
        lblCpfClienteVenda = new javax.swing.JLabel();
        txtCpfClienteVenda = new javax.swing.JFormattedTextField();
        lblEmailClienteVenda = new javax.swing.JLabel();
        txtEmailClienteVenda = new javax.swing.JTextField();
        btnSelecionarCliente = new javax.swing.JButton();
        btnLimparTelaVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes1 = new javax.swing.JMenu();
        opMenuPrincipal1 = new javax.swing.JMenuItem();
        opCadastroClientes1 = new javax.swing.JMenuItem();
        opCadastroProdutos1 = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opSair1 = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdicionaProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha seu produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblDetalhesProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço Unit."
            }
        ));
        jScrollPane1.setViewportView(tblDetalhesProduto);

        btnAdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone adicionar.png"))); // NOI18N
        btnAdicionarCarrinho.setText("Adicionar ao carrinho");
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        lblNomeProduto.setText("Nome:");

        txtNomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeProdutoFocusLost(evt);
            }
        });

        lblDescricaoProduto.setText("Descrição:");

        txtDescricaoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoProdutoFocusLost(evt);
            }
        });

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone buscar2.png"))); // NOI18N
        btnBuscarProduto.setText("Buscar");

        lblQuantidadeProduto.setText("Quantidade:");

        txtQuantidadeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeProdutoFocusLost(evt);
            }
        });
        txtQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdicionaProdutoLayout = new javax.swing.GroupLayout(pnlAdicionaProduto);
        pnlAdicionaProduto.setLayout(pnlAdicionaProdutoLayout);
        pnlAdicionaProdutoLayout.setHorizontalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(lblNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescricaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuantidadeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdicionaProdutoLayout.setVerticalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidadeProduto)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlCarrinho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblValorTotalVenda.setText("Valor total da compra:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone selecionar.png"))); // NOI18N
        jButton3.setText("Finalizar compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço Unit."
            }
        ));
        jScrollPane3.setViewportView(tblCarrinho);

        btnRemoverVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone remover.png"))); // NOI18N
        btnRemoverVenda.setText("Remover ");
        btnRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVendaActionPerformed(evt);
            }
        });

        lblClienteCarrinho.setText("Cliente:");

        lblCpfCarrinho.setText("CPF:");

        javax.swing.GroupLayout pnlCarrinhoLayout = new javax.swing.GroupLayout(pnlCarrinho);
        pnlCarrinho.setLayout(pnlCarrinhoLayout);
        pnlCarrinhoLayout.setHorizontalGroup(
            pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addComponent(lblValorTotalVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addComponent(lblClienteCarrinho)
                        .addGap(252, 252, 252)
                        .addComponent(lblCpfCarrinho)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlCarrinhoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRemoverVenda, jButton3});

        pnlCarrinhoLayout.setVerticalGroup(
            pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteCarrinho)
                    .addComponent(lblCpfCarrinho))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoverVenda)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblValorTotalVenda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlCarrinhoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRemoverVenda, jButton3});

        pnlSelecionarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione o Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblNomeClienteVenda.setText("Nome*:");

        txtNomeClienteVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeClienteVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeClienteVendaFocusLost(evt);
            }
        });

        lblCpfClienteVenda.setText("CPF*:");

        try {
            txtCpfClienteVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfClienteVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfClienteVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfClienteVendaFocusLost(evt);
            }
        });

        lblEmailClienteVenda.setText("Email:");

        txtEmailClienteVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailClienteVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailClienteVendaFocusLost(evt);
            }
        });

        btnSelecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone selecionar.png"))); // NOI18N
        btnSelecionarCliente.setText("Selecionar");
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        btnLimparTelaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone limpar.png"))); // NOI18N
        btnLimparTelaVenda.setText("Limpar");
        btnLimparTelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelecionarClienteLayout = new javax.swing.GroupLayout(pnlSelecionarCliente);
        pnlSelecionarCliente.setLayout(pnlSelecionarClienteLayout);
        pnlSelecionarClienteLayout.setHorizontalGroup(
            pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                        .addComponent(lblNomeClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCpfClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmailClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                        .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparTelaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSelecionarClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLimparTelaVenda, btnSelecionarCliente});

        pnlSelecionarClienteLayout.setVerticalGroup(
            pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeClienteVenda)
                    .addComponent(txtNomeClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfClienteVenda)
                    .addComponent(txtCpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailClienteVenda)
                    .addComponent(txtEmailClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparTelaVenda))
                .addContainerGap())
        );

        pnlSelecionarClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLimparTelaVenda, btnSelecionarCliente});

        menuOpcoes1.setText("Opções");

        opMenuPrincipal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        opMenuPrincipal1.setText("Menu Principal");
        opMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipal1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opMenuPrincipal1);

        opCadastroClientes1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        opCadastroClientes1.setText("Cadastro de Clientes");
        opCadastroClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientes1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroClientes1);

        opCadastroProdutos1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        opCadastroProdutos1.setText("Casdastro de Produtos");
        opCadastroProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutos1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroProdutos1);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opRelatorioSintetico);
        menuOpcoes1.add(jSeparator2);

        opSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair1.setText("Sair");
        opSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSair1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opSair1);

        jMenuBar1.add(menuOpcoes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdicionaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSelecionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAdicionaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipal1ActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipal1ActionPerformed

    private void opCadastroClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientes1ActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroClientes1ActionPerformed

    private void opCadastroProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutos1ActionPerformed
        CadastroProdutos telaCadastroProdutos = new CadastroProdutos();
        telaCadastroProdutos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroProdutos1ActionPerformed

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    private void opSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSair1ActionPerformed

    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed
        if(tblDetalhesProduto.getSelectedRow() != -1) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());
            String nomeProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 1).toString();
            String descricaoProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 2).toString();
            
            objVendas.setId(IDProduto);
            //objCliente.setNome(nome);
            //objCliente.setCpf(cpf);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela para adicionar ao carrinho!");
        }
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVendaActionPerformed
        if(tblCarrinho.getSelectedRow() != -1) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());

            objVendas.setId(IDProduto);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto do carrinho para apagar!");
        }
    }//GEN-LAST:event_btnRemoverVendaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tblCarrinho.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());

            objVendas.setId(IDProduto);
        }else{
            JOptionPane.showMessageDialog(this, "Insira ao menos um produto no carrinho para finalizar a compra!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLimparTelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaVendaActionPerformed
        txtNomeClienteVenda.setText("");
        txtCpfClienteVenda.setText("");
        txtEmailClienteVenda.setText("");
    }//GEN-LAST:event_btnLimparTelaVendaActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        
        //validando a obrigatoriedade do nome
        if(txtNomeClienteVenda.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Digite o nome do cliente!");
            return;
        }
        //validando a obrigatoriedade do CPF
        if(txtCpfClienteVenda.getText().trim().length() == 9){
            JOptionPane.showMessageDialog(this, "Digite o CPF do cliente!");
            return;
        }
       
    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

    private void txtQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoActionPerformed

    private void txtNomeClienteVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteVendaFocusGained
         txtNomeClienteVenda.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtNomeClienteVendaFocusGained

    private void txtNomeClienteVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteVendaFocusLost
        txtNomeClienteVenda.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeClienteVendaFocusLost

    private void txtCpfClienteVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfClienteVendaFocusGained
        txtCpfClienteVenda.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtCpfClienteVendaFocusGained

    private void txtCpfClienteVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfClienteVendaFocusLost
         txtCpfClienteVenda.setBackground(Color.white);
    }//GEN-LAST:event_txtCpfClienteVendaFocusLost

    private void txtEmailClienteVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailClienteVendaFocusGained
        txtEmailClienteVenda.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtEmailClienteVendaFocusGained

    private void txtEmailClienteVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailClienteVendaFocusLost
         txtEmailClienteVenda.setBackground(Color.white);
    }//GEN-LAST:event_txtEmailClienteVendaFocusLost

    private void txtNomeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusGained
        txtNomeProduto.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtNomeProdutoFocusGained

    private void txtNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusLost
         txtNomeProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeProdutoFocusLost

    private void txtDescricaoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoFocusGained
        txtDescricaoProduto.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtDescricaoProdutoFocusGained

    private void txtDescricaoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoFocusLost
       txtDescricaoProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtDescricaoProdutoFocusLost

    private void txtQuantidadeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoFocusGained
       txtQuantidadeProduto.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtQuantidadeProdutoFocusGained

    private void txtQuantidadeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoFocusLost
        txtQuantidadeProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtQuantidadeProdutoFocusLost

   
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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCarrinho;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnLimparTelaVenda;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblClienteCarrinho;
    private javax.swing.JLabel lblCpfCarrinho;
    private javax.swing.JLabel lblCpfClienteVenda;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblEmailClienteVenda;
    private javax.swing.JLabel lblNomeClienteVenda;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JMenu menuOpcoes1;
    private javax.swing.JMenuItem opCadastroClientes1;
    private javax.swing.JMenuItem opCadastroProdutos1;
    private javax.swing.JMenuItem opMenuPrincipal1;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair1;
    private javax.swing.JPanel pnlAdicionaProduto;
    private javax.swing.JPanel pnlCarrinho;
    private javax.swing.JPanel pnlSelecionarCliente;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTable tblDetalhesProduto;
    private javax.swing.JFormattedTextField txtCpfClienteVenda;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtEmailClienteVenda;
    private javax.swing.JTextField txtNomeClienteVenda;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
