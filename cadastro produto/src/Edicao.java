import javax.swing.*;
import java.awt.*;

public class Edicao extends JFrame {
    public Edicao() {
        setTitle("Edição de Produtos");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblInfo = new JLabel("Funcionalidade em desenvolvimento.");
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblInfo, BorderLayout.CENTER);
    }
}