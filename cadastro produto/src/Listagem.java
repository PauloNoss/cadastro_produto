import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Listagem extends JFrame {
    private final String filePath = "produtos.txt";

    public Listagem() {
        setTitle("Listagem de Produtos");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea areaListagem = new JTextArea();
        areaListagem.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaListagem);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                areaListagem.append(linha + "\n");
            }
        } catch (IOException e) {
            areaListagem.setText("Erro ao carregar os produtos!");
        }

        add(scrollPane, BorderLayout.CENTER);
    }
}