package br.senac.sp.pi.view;

import br.senac.sp.pi.controller.ClienteController;
import br.senac.sp.pi.controller.ProdutoController;
import br.senac.sp.pi.controller.VendaController;
import br.senac.sp.pi.model.Venda;
import br.senac.sp.pi.model.Cliente;
import br.senac.sp.pi.model.ItemVenda;
import br.senac.sp.pi.model.Produto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVenda extends javax.swing.JFrame {
    
    Venda objVendas;
    ArrayList<ItemVenda> listItemVenda = new ArrayList<>();
    ArrayList<String[]> listCarrinho = new ArrayList<>();
    double valorTotalVenda = 0.0f;
    int cont = 0;

    public TelaVenda() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Vendas"); //altera titulo da janela
        objVendas = new Venda();

        //Carregar todos os clientes na tabela ao iniciar este JFrame
        CarregarJTableClientes();

        //Carregar todos os produtos na tabela ao iniciar este JFrame
        CarregarJTableProdutos();
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
        lblIdProduto = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        lblQtdProduto = new javax.swing.JLabel();
        txtQtdProduto = new javax.swing.JTextField();
        pnlCarrinho = new javax.swing.JPanel();
        lblValorTotalVenda = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        btnRemoverVenda = new javax.swing.JButton();
        lblClienteCarrinho = new javax.swing.JLabel();
        lblCpfCarrinho = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCPFCliente = new javax.swing.JLabel();
        lblValorTotalCliente = new javax.swing.JLabel();
        pnlSelecionarCliente = new javax.swing.JPanel();
        lblNomeClienteVenda = new javax.swing.JLabel();
        txtNomeClienteVenda = new javax.swing.JTextField();
        lblCpfClienteVenda = new javax.swing.JLabel();
        txtCpfClienteVenda = new javax.swing.JFormattedTextField();
        btnSelecionarCliente = new javax.swing.JButton();
        btnLimparTelaVenda = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
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
                "Id", "Nome", "Descrição", "Quantidade", "Preço Unit."
            }
        ));
        jScrollPane1.setViewportView(tblDetalhesProduto);

        btnAdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_adicionar.png"))); // NOI18N
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

        lblIdProduto.setText("Id:");

        txtIdProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProdutoFocusLost(evt);
            }
        });

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_buscar2.png"))); // NOI18N
        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        lblQtdProduto.setText("Qtd Produto:");

        javax.swing.GroupLayout pnlAdicionaProdutoLayout = new javax.swing.GroupLayout(pnlAdicionaProduto);
        pnlAdicionaProduto.setLayout(pnlAdicionaProdutoLayout);
        pnlAdicionaProdutoLayout.setHorizontalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(lblIdProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblQtdProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdicionarCarrinho))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdicionaProdutoLayout.setVerticalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdProduto)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto)
                    .addComponent(lblQtdProduto)
                    .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCarrinho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblValorTotalVenda.setText("Valor total da compra:");

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_selecionar.png"))); // NOI18N
        btnFinalizarCompra.setText("Finalizar compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
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

        btnRemoverVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_remover.png"))); // NOI18N
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
            .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addComponent(lblValorTotalVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCarrinhoLayout.createSequentialGroup()
                        .addComponent(lblClienteCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpfCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pnlCarrinhoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFinalizarCompra, btnRemoverVenda});

        pnlCarrinhoLayout.setVerticalGroup(
            pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClienteCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCpfCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarrinhoLayout.createSequentialGroup()
                        .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoverVenda)
                            .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarrinhoLayout.createSequentialGroup()
                        .addGroup(pnlCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorTotalVenda)
                            .addComponent(lblValorTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        pnlCarrinhoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFinalizarCompra, btnRemoverVenda});

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

        btnSelecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_selecionar.png"))); // NOI18N
        btnSelecionarCliente.setText("Selecionar");
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        btnLimparTelaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_limpar.png"))); // NOI18N
        btnLimparTelaVenda.setText("Limpar");
        btnLimparTelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaVendaActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_buscar2.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlSelecionarClienteLayout = new javax.swing.GroupLayout(pnlSelecionarCliente);
        pnlSelecionarCliente.setLayout(pnlSelecionarClienteLayout);
        pnlSelecionarClienteLayout.setHorizontalGroup(
            pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                        .addComponent(lblNomeClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCpfClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarCliente))
                    .addComponent(btnLimparTelaVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlSelecionarClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscarCliente, btnLimparTelaVenda, btnSelecionarCliente});

        pnlSelecionarClienteLayout.setVerticalGroup(
            pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeClienteVenda)
                    .addComponent(txtNomeClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfClienteVenda)
                    .addComponent(txtCpfClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(14, 14, 14)
                .addGroup(pnlSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelecionarClienteLayout.createSequentialGroup()
                        .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparTelaVenda))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSelecionarClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarCliente, btnLimparTelaVenda, btnSelecionarCliente});

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
                .addComponent(pnlCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            String qtdString = txtQtdProduto.getText();

            int qtd = 0;
            if (qtdString.equals("")) {
                JOptionPane.showMessageDialog(this, "Digite a quantidade do produto!");            
                return;
            } else {
                try {
                    qtd = Integer.parseInt(qtdString);
                } catch (NumberFormatException erro){ //Caso o usuário não digitar um número  
                    JOptionPane.showMessageDialog(this, "Digite somente número no campo quantidade!");             
                    return;
                }
            }

            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());
            String nomeProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 1).toString();
            String descricaoProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 2).toString();
            String qtdAnteriorString = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 3).toString();
            String precoUnit = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 4).toString().replace(",", ".");

            int qtdAnterior = Integer.parseInt(qtdAnteriorString);
            if (qtd > qtdAnterior) {
                 JOptionPane.showMessageDialog(null, "A quantidade da venda não pode ser superior a de estoque!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            ItemVenda objItemVenda = new ItemVenda();

            objItemVenda.setId(0);
            objItemVenda.setIdVenda(0);
            objItemVenda.setIdProduto(IDProduto);
            objItemVenda.setQtdVenda(qtd);
            objItemVenda.setValorUnitVenda(Double.parseDouble(precoUnit));
            listItemVenda.add(objItemVenda);

            DefaultTableModel tmCarrinho = new DefaultTableModel();
            tmCarrinho.addColumn("Nome");
            tmCarrinho.addColumn("Descrição");
            tmCarrinho.addColumn("Qtd");
            tmCarrinho.addColumn("Preço Unit.");
            tblCarrinho.setModel(tmCarrinho);
            tmCarrinho.setRowCount(0);
            
            if (listCarrinho.size() > 0) {
                listCarrinho.add(new String[]{nomeProduto, 
                                            descricaoProduto,
                                            String.valueOf(qtd).replace(".",","),
                                            precoUnit});

                for (String[] item : listCarrinho) {
                    tmCarrinho.addRow(item);
                }
            } else {
                listCarrinho.add(new String[]{nomeProduto, 
                                            descricaoProduto,
                                            String.valueOf(qtd).replace(".",","),
                                            precoUnit});
                tmCarrinho.addRow(new Object[]{nomeProduto,
                                           descricaoProduto,
                                           String.valueOf(qtd).replace(".",","),
                                           precoUnit});
            }

            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(150); // Nome
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250); // Descrição
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100); // Qtd
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Preço Unit.

            valorTotalVenda += (qtd * Double.parseDouble(precoUnit));
            lblValorTotalCliente.setText(String.valueOf(valorTotalVenda).replace(".", ","));
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela para adicionar ao carrinho!");
        }
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVendaActionPerformed
        if(tblCarrinho.getSelectedRow() != -1) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblCarrinho.getSelectedRow();
            
            DefaultTableModel tmCarrinho = (DefaultTableModel)tblCarrinho.getModel();
            String qtdString = tblCarrinho.getModel().getValueAt(numeroLinha, 2).toString();
            String precoUnit = tblCarrinho.getModel().getValueAt(numeroLinha, 3).toString().replace(",", ".");

            valorTotalVenda -= (Integer.parseInt(qtdString) * Double.parseDouble(precoUnit));
            lblValorTotalCliente.setText(String.valueOf(valorTotalVenda).replace(".", ","));
            listItemVenda.remove(numeroLinha);
            //Passo o indice da linha a ser removida
            tmCarrinho.removeRow(numeroLinha);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverVendaActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        if(tblCarrinho.getRowCount() > 0) {
            Date dataVenda = new Date();
            objVendas.setDataVenda(dataVenda);
            objVendas.setValorTotal(valorTotalVenda);

            boolean retorno = false;
            try {
                retorno = VendaController.salvar(objVendas, listItemVenda);
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR!");
            }

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso.", "Venda realizado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar a venda!", "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Insira ao menos um produto no carrinho para finalizar a compra!");
        }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnLimparTelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaVendaActionPerformed
        txtNomeClienteVenda.setText("");
        txtCpfClienteVenda.setText("");
    }//GEN-LAST:event_btnLimparTelaVendaActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        if(tblClientes.getRowCount()>0) {
            int numeroLinha = tblClientes.getSelectedRow();

            int idCliente = Integer.parseInt(tblClientes.getModel().getValueAt(numeroLinha, 0).toString());
            String nome = tblClientes.getModel().getValueAt(numeroLinha, 1).toString();
            String cpf = tblClientes.getModel().getValueAt(numeroLinha, 2).toString();

            lblNomeCliente.setText(nome);
            lblCPFCliente.setText(cpf);
            objVendas.setIdCliente(idCliente);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente da tabela!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

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

    private void txtNomeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusGained
        txtNomeProduto.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtNomeProdutoFocusGained

    private void txtNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusLost
         txtNomeProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeProdutoFocusLost

    private void txtIdProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProdutoFocusGained
        txtIdProduto.setBackground(new Color(152,245,255));
    }//GEN-LAST:event_txtIdProdutoFocusGained

    private void txtIdProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProdutoFocusLost
       txtIdProduto.setBackground(Color.white);
    }//GEN-LAST:event_txtIdProdutoFocusLost

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String nomeCliente = txtNomeClienteVenda.getText();
        String cpfCliente = txtCpfClienteVenda.getText();
        ArrayList<String[]> listaCliente = ClienteController.pesquisaPorNomeOuCpf(nomeCliente, cpfCliente);

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("Id");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("Cpf");
        tmCliente.addColumn("Tel");
        tmCliente.addColumn("Email");
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
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        String idProd = txtIdProduto.getText();
        String nomeProd = txtNomeProduto.getText();
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
        tblDetalhesProduto.setModel(tmProduto);

        tmProduto.setRowCount(0);
        
        for (String[] item : listaProduto) {
            tmProduto.addRow(item);
        }
        tblDetalhesProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblDetalhesProduto.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblDetalhesProduto.getColumnModel().getColumn(2).setPreferredWidth(200); // Descricao
        tblDetalhesProduto.getColumnModel().getColumn(3).setPreferredWidth(65); // Qtd
        tblDetalhesProduto.getColumnModel().getColumn(4).setPreferredWidth(80); // Preço
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    public void CarregarJTableClientes() {
        ArrayList<String[]> listaCliente = ClienteController.listar();
        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("Id");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("Cpf");
        tmCliente.addColumn("Tel");
        tmCliente.addColumn("Email");
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
    }

    public void CarregarJTableProdutos() {
        ArrayList<String[]> listaProduto = ProdutoController.listar();
        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("Id");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Descrição");
        tmProduto.addColumn("Qtd");
        tmProduto.addColumn("Preço");

        tblDetalhesProduto.setModel(tmProduto);
        tmProduto.setRowCount(0);

        for (String[] item : listaProduto) {
            tmProduto.addRow(item);
        }

        tblDetalhesProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //Id
        tblDetalhesProduto.getColumnModel().getColumn(1).setPreferredWidth(150); // Nome
        tblDetalhesProduto.getColumnModel().getColumn(2).setPreferredWidth(200); // Descricao
        tblDetalhesProduto.getColumnModel().getColumn(3).setPreferredWidth(65); // Qtd
        tblDetalhesProduto.getColumnModel().getColumn(4).setPreferredWidth(80); // Preço
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
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnLimparTelaVenda;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblClienteCarrinho;
    private javax.swing.JLabel lblCpfCarrinho;
    private javax.swing.JLabel lblCpfClienteVenda;
    private javax.swing.JLabel lblIdProduto;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeClienteVenda;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQtdProduto;
    private javax.swing.JLabel lblValorTotalCliente;
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
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblDetalhesProduto;
    private javax.swing.JFormattedTextField txtCpfClienteVenda;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeClienteVenda;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQtdProduto;
    // End of variables declaration//GEN-END:variables
}
