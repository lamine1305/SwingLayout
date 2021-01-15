import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeGridBagLayout extends JFrame{

	public LeGridBagLayout() {
	this.setSize(400,400);
	this.setMinimumSize(new Dimension(900,700));
	this.setTitle("GridBagLayout");
	JPanel panPrincipal = new JPanel(new BorderLayout());
	panPrincipal.setBackground(Color.RED);
	JPanel pan = new JPanel(new GridBagLayout());
	panPrincipal.add(pan,BorderLayout.WEST);
	JPanel pan2 = new JPanel(new GridBagLayout());
	panPrincipal.add(pan2,BorderLayout.EAST);

	GridBagConstraints gbc = new GridBagConstraints();
	gbc.insets = new Insets(0,10, 10,3);

	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.anchor = GridBagConstraints.WEST;
	JButton btn1 = new JButton("Bouton 1");
	pan.add(btn1,gbc);
	
	gbc.gridx = 1;
	gbc.gridy = 0;
	JButton btn2 = new JButton("Bouton 2");
	pan.add(btn2,gbc);

	gbc.gridx = 2;
	gbc.gridy = 0;
	JButton btn3 = new JButton("Bouton 3");
	pan.add(btn3,gbc);
	
	gbc.gridx = 0;
	gbc.gridy = 1;
	JButton btn4 = new JButton("Bouton 4");
	pan.add(btn4,gbc);
	
	
	gbc.gridx = 2;
	gbc.gridy = 1;
	JButton btn5 = new JButton("Bouton 5");
	pan.add(btn5,gbc);
	this.add(panPrincipal);
	
	gbc.gridx = 2;
	gbc.gridy = 0;
	JLabel label = new JLabel("---LE GRidBagLayout---");
	pan2.add(label,gbc);
	int k=1;
	for(int i=0;i<4;i++) {
		for(int j=1;j<5;j++) {
			if((k != 1)&&(k !=7)&&(k != 10)){
		gbc.gridx = i;
		gbc.gridy = j;
		JButton btn = new JButton("Bouton "+k);
		btn.setName("btn"+k);
		pan2.add(btn,gbc);
			}
		k++;
	}
	}
	this.setVisible(true);
	}
}
