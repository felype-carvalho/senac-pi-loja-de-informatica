package br.senac.sp.pi.view;

import br.senac.sp.pi.model.Produto;
import br.senac.sp.pi.controller.ProdutoController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroProdutos extends javax.swing.JFrame {
    public String modoTela = "Criação";
    Produto objProduto;

    public CadastroProdutos() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Cadastro de Produtos"); //altera titulo da janela
        objProduto = new Produto();

        //Carregar todos os produtos na tabela ao iniciar este JFrame
        CarregarJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroProdutos = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        txtPrecoProduto = new javax.swing.JTextField();
        pnlConsultaProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnRemoverProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        lblConsultaNome = new javax.swing.JLabel();
        lblConsultaDescricao = new javax.swing.JLabel();
        txtConsultaNomeProd = new javax.swing.JTextField();
        txtConsultaIdProd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        opMenuPrincipal = new javax.swing.JMenuItem();
        opCadastroClientes = new javax.swing.JMenuItem();
        opTelaVendas = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCadastroProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        lblNomeProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomeProduto.setText("Nome:");

        lblDescricaoProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDescricaoProduto.setText("Descrição:");

        lblQuantidadeProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblQuantidadeProduto.setText("Quantidade:");

        lblPrecoProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrecoProduto.setText("Preço:");

        txtNomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeProdutoFocusLost(evt);
            }
        });

        txtDescricaoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoProdutoFocusLost(evt);
            }
        });

        txtQuantidadeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeProdutoFocusLost(evt);
            }
        });

        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_salvar.png"))); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_limpar.png"))); // NOI18N
        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroProdutosLayout = new javax.swing.GroupLayout(pnlCadastroProdutos);
        pnlCadastroProdutos.setLayout(pnlCadastroProdutosLayout);
        pnlCadastroProdutosLayout.setHorizontalGroup(
            pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutosLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblQuantidadeProduto)
                        .addComponent(lblDescricaoProduto)
                        .addComponent(lblPrecoProduto))
                    .addGroup(pnlCadastroProdutosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblNomeProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastroProdutosLayout.createSequentialGroup()
                            .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(txtDescricaoProduto))
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCadastroProdutosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPrecoProduto, txtQuantidadeProduto});

        pnlCadastroProdutosLayout.setVerticalGroup(
            pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeProduto)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoProduto)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCadastroProdutosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPrecoProduto, txtQuantidadeProduto});

        pnlConsultaProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Qtd", "Preço"
            }
        ));
        tblProdutos.setToolTipText("");
        jScrollPane1.setViewportView(tblProdutos);

        btnRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_remover.png"))); // NOI18N
        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_alterar.png"))); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        lblConsultaNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsultaNome.setText("Nome:");

        lblConsultaDescricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsultaDescricao.setText("ID:");

        txtConsultaNomeProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConsultaNomeProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConsultaNomeProdFocusLost(evt);
            }
        });

        txtConsultaIdProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConsultaIdProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConsultaIdProdFocusLost(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_buscar2.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaProdutosLayout = new javax.swing.GroupLayout(pnlConsultaProdutos);
        pnlConsultaProdutos.setLayout(pnlConsultaProdutosLayout);
        pnlConsultaProdutosLayout.setHorizontalGroup(
            pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaProdutosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaProdutosLayout.createSequentialGroup()
                        .addComponent(lblConsultaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConsultaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaIdProd)
                        .addGap(112, 112, 112))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        pnlConsultaProdutosLayout.setVerticalGroup(
            pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaProdutosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultaNome)
                    .addComponent(txtConsultaNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsultaDescricao)
                    .addComponent(txtConsultaIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlConsultaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaProdutosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuOpcoes.setText("Opções");

        opMenuPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        opMenuPrincipal.setText("Menu Principal");
        opMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipalActionPerformed(evt);
            }
        });
        menuOpcoes.add(opMenuPrincipal);

        opCadastroClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        opCadastroClientes.setText("Cadastro de Clientes");
        opCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientesActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroClientes);

        opTelaVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        opTelaVendas.setText("Tela de Vendas");
        opTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendasActionPerformed(evt);
            }
        });
        menuOpcoes.add(opTelaVendas);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes.add(opRelatorioSintetico);
        menuOpcoes.add(jSeparator1);

        opSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(opSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsultaProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCadastroProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConsultaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        String nome = txtNomeProduto.getText().trim();
        String descricao = txtDescricaoProduto.getText().trim();
        String quantidadeString = txtQuantidadeProduto.getText().trim();
        String precoString = txtPrecoProduto.getText().trim();

        //Validando a obrigatoriedade do nome
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome o produto!");
            return;
        }

        //Validando a obrigatoriedade da descrição
        if (descricao.equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a descrição do produto!");           
            return;       
        }

        //Validando a obrigatoriedade da quantidade
        int qtd = 0;
        if (quantidadeString.equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a quantidade do produto!");            
            return;
        } else {
            try {
                qtd = Integer.parseInt(txtQuantidadeProduto.getText());
            } catch (NumberFormatException erro){ //Caso o usuário não digitar um número  
                JOptionPane.showMessageDialog(this, "Digite somente número no campo quantidade!");             
                return;
            }
        }

        //Validando a quantidade do preço
        double preco = 0.0f;
        if(precoString.equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o preço do produto!");           
            return;                     
        } else {
            try {
                preco = Double.parseDouble(precoString.replace(",", "."));
            } catch (NumberFormatException erro){ //Caso o usuário não digitar um número  
                JOptionPane.showMessageDialog(this, "Digite somente número no campo quantidade!");             
                return;
            }
        }

        boolean retorno = false;
        objProduto.setNome(nome);
        objProduto.setDescricao(descricao);
        objProduto.setQtd(qtd);
        objProduto.setPreco(preco);

        if (modoTela.equals("Criação")) {
            try {
                retorno = ProdutoController.salvar(objProduto);
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR!");
            }

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Produto cadastrada com sucesso.", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
                CarregarJTable();
                txtNomeProduto.setText("");
                txtDescricaoProduto.setText("");
                txtQuantidadeProduto.setText("");
                txtPrecoProduto.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar o produto!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                retorno = ProdutoController.alteracaoSalvar(objProduto);
                CarregarJTable();
                txtNomeProduto.setText("");
                txtDescricaoProduto.setText("");
                txtQuantidadeProduto.setText("");
                txtPrecoProduto.setText("");
                
                modoTela = "Criação";
                this.btnSalvarProduto.setText("Salvar");
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Compra alterada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao alterar o produto!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
         if(tblProdutos.getSelectedRow() != -1) {
            int numeroLinha = tblProdutos.getSelectedRow();
            int idProduto = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha, 0).toString());
            try {
                if(ProdutoController.exclusao(idProduto)){
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Falha ao excluir produto!", "Falha", JOptionPane.ERROR_MESSAGE);      
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR!");
            }
            CarregarJTable();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        txtNomeProduto.setText("");
        txtDescricaoProduto.setText("");
        txtQuantidadeProduto.setText("");
        txtPrecoProduto.setText("");           
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void opMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipalActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipalActionPerformed

    private void opCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientesActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroClientesActionPerformed

    private void opTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaVendasActionPerformed
        TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaVendasActionPerformed

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSairActionPerformed

    private void txtNomeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusGained
        txtNomeProduto.setBackground(new Color(151,255,255));
    }//GEN-LAST:event_txtNomeProdutoFocusGained

    private void txtNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusLost
        txtNomeProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeProdutoFocusLost

    private void txtDescricaoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoFocusGained
        txtDescricaoProduto.setBackground(new Color(151,255,255));
    }//GEN-LAST:event_txtDescricaoProdutoFocusGained

    private void txtDescricaoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoFocusLost
        txtDescricaoProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtDescricaoProdutoFocusLost

    private void txtQuantidadeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoFocusGained
        txtQuantidadeProduto.setBackground(new Color(151,255,255));
    }//GEN-LAST:event_txtQuantidadeProdutoFocusGained

    private void txtQuantidadeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoFocusLost
        txtQuantidadeProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtQuantidadeProdutoFocusLost

    private void txtConsultaNomeProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultaNomeProdFocusGained
        txtConsultaNomeProd.setBackground(new Color(151,255,255));
    }//GEN-LAST:event_txtConsultaNomeProdFocusGained

    private void txtConsultaNomeProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultaNomeProdFocusLost
       txtConsultaNomeProd.setBackground(Color.white);
    }//GEN-LAST:event_txtConsultaNomeProdFocusLost

    private void txtConsultaIdProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultaIdProdFocusGained
        txtConsultaIdProd.setBackground(new Color(151,255,255));
    }//GEN-LAST:event_txtConsultaIdProdFocusGained

    private void txtConsultaIdProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConsultaIdProdFocusLost
        txtConsultaIdProd.setBackground(Color.white);
    }//GEN-LAST:event_txtConsultaIdProdFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomeProd = txtConsultaNomeProd.getText();
        String idProd = txtConsultaIdProd.getText();
        ArrayList<String[]> listaProduto = null;

        int idProdConvert = 0;
        if (!idProd.equals("")) {
            try {
                idProdConvert = Integer.parseInt(idProd);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro na conversão do ID!", "Erro Conversão", JOptionPane.ERROR);
            }
        }

        listaProduto = ProdutoController.pesquisaPorNomeOuId(nomeProd, idProdConvert);

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("Id");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Descrição");
        tmProduto.addColumn("Qtd");
        tmProduto.addColumn("Preço");
        tblProdutos.setModel(tmProduto);

        tmProduto.setRowCount(0);
        
        for (String[] item : listaProduto) {
            tmProduto.addRow(item);
        }
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(200); // Descricao
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(65); // Qtd
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(80); // Preço
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        if(tblProdutos.getSelectedRow() != -1) {
            int numeroLinha = tblProdutos.getSelectedRow();

            int idProd = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha, 0).toString());
            String nome = tblProdutos.getModel().getValueAt(numeroLinha, 1).toString();
            String descricao = tblProdutos.getModel().getValueAt(numeroLinha, 2).toString();
            int qtd = Integer.parseInt(tblProdutos.getModel().getValueAt(numeroLinha, 3).toString());
            double preco = Double.parseDouble(tblProdutos.getModel().getValueAt(numeroLinha, 4).toString().replace(",", "."));

            txtNomeProduto.setText(nome);
            txtDescricaoProduto.setText(descricao);
            txtQuantidadeProduto.setText(String.valueOf(qtd));
            txtPrecoProduto.setText(String.valueOf(preco).replace(".", ","));

            objProduto.setId(idProd);
            objProduto.setNome(nome);
            objProduto.setDescricao(descricao);
            objProduto.setQtd(qtd);
            objProduto.setPreco(preco);

            modoTela = "Alteração";
            this.btnSalvarProduto.setText("Alterar");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    public void CarregarJTable() {
        ArrayList<String[]> listaProduto = ProdutoController.listar();
        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("Id");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Descrição");
        tmProduto.addColumn("Qtd");
        tmProduto.addColumn("Preço");

        tblProdutos.setModel(tmProduto);
        tmProduto.setRowCount(0);

        for (String[] item : listaProduto) {
            tmProduto.addRow(item);
        }

        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(200); // Descricao
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(65); // Qtd
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(80); // Preço
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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblConsultaDescricao;
    private javax.swing.JLabel lblConsultaNome;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem opCadastroClientes;
    private javax.swing.JMenuItem opMenuPrincipal;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opTelaVendas;
    private javax.swing.JPanel pnlCadastroProdutos;
    private javax.swing.JPanel pnlConsultaProdutos;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtConsultaIdProd;
    private javax.swing.JTextField txtConsultaNomeProd;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
