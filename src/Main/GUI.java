

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    JLabel lbIdade = new JLabel("Digite sua idade");
    JLabel lbVazio = new JLabel("");
    JButton btCategoria = new JButton("Descubra a categoria");
    JLabel lbResult = new JLabel("Você está na categoria");
    JTextField tfIdade = new JTextField(1000);
    JTextField tfResult = new JTextField(1000);
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new GridLayout(3,2));
        setTitle("Categoria de natação");
        
        cp.add(lbIdade);
        cp.add(tfIdade);
        cp.add(btCategoria);
        cp.add(lbVazio);
        cp.add(lbResult);
        cp.add(tfResult);
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
        
        btCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Categoria categoria = new Categoria();
                categoria.setIdade(Integer.valueOf(tfIdade.getText()));
                tfResult.setText(String.valueOf(categoria.getCategoria()));
            }
        });
    }
}
