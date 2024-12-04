import javax.swing.*;
import java.awt.*;

public class Telamenu extends JFrame {
    public Telamenu() {
        setTitle("Menu Principal");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        JButton btnCadastro = new JButton("Cadastrar Produto");
        JButton btnListar = new JButton("Listar Produtos");
        JButton btnEditar = new JButton("Editar Produto");
        JButton btnSair = new JButton("Sair");

        btnCadastro.addActionListener(e -> new Cadastro().setVisible(true));
        btnListar.addActionListener(e -> new Listagem().setVisible(true));
        btnEditar.addActionListener(e -> new Edicao().setVisible(true));
        btnSair.addActionListener(e -> System.exit(0));

        add(btnCadastro);
        add(btnListar);
        add(btnEditar);
        add(btnSair);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Telamenu().setVisible(true));
    }
}