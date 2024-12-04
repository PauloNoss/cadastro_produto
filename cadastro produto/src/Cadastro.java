import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class Cadastro extends JFrame {
    private JTextField txtNome;
    private JComboBox<String> comboCategoria;
    private JTextField txtPreco;
    private JTextField txtQuantidade;
    private JTextArea txtDescricao;
    private final String filePath = "produtos.txt";

    public Cadastro() {
        setTitle("Cadastro de Produtos");
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        txtNome = new JTextField();
        comboCategoria = new JComboBox<>(new String[]{"Eletrônicos", "Roupas", "Alimentos"});
        txtPreco = new JTextField();
        txtQuantidade = new JTextField();
        txtDescricao = new JTextArea();

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> salvarProduto());

        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Categoria:"));
        add(comboCategoria);
        add(new JLabel("Preço:"));
        add(txtPreco);
        add(new JLabel("Quantidade:"));
        add(txtQuantidade);
        add(new JLabel("Descrição:"));
        add(new JScrollPane(txtDescricao));
        add(btnSalvar);
    }

    private void salvarProduto() {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            String produto = txtNome.getText() + ";" +
                    comboCategoria.getSelectedItem() + ";" +
                    txtPreco.getText() + ";" +
                    txtQuantidade.getText() + ";" +
                    txtDescricao.getText() + "\n";
            writer.write(produto);
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o produto!");
        }
    }
}