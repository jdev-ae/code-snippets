import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author SuRu
 */
class SuRuDemoFrame extends JFrame implements ActionListener {

	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JPanel panel1;
	private JPanel panel2;

	public void actionPerformed(ActionEvent eve) {
		/*if (eve.getSource() == but1) {
			panel2.setBackground(Color.red);
		} else if (eve.getSource() == but2) {
			panel2.setBackground(Color.blue);
		} else if (eve.getSource() == but3) {
			panel2.setBackground(Color.green);
		}*/
		Thread t = new Thread() {
			
			public void run() {
				System.out.println("Start: " + new java.util.Date());
				for (int i = 0; i <= 255; i++) {
					for (int j = 0;j <= 255; j++) {
						for (int k = 0; k <= 255; k++) {
							panel2.setBackground(new Color(i, j, k));
							System.out.print("[" + i + ", " + j + ", " + k + "]");
						}
					}
				}
				System.out.println("End: " + new java.util.Date());
			}
		};
		t.start();
	}

	SuRuDemoFrame() {
		super("SuRu Demo Frame");
		init();
		setSize(500, 500);
		setLocation(150, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void init() {
		JPanel root = new JPanel(new GridLayout(1, 2));
		panel1 = new JPanel(new GridLayout(3, 1));
		panel1.setBackground(Color.black);
		panel2 = new JPanel();
		root.add(panel1);
		root.add(panel2);
		add(root);
		but1 = new JButton("Red");
		but2 = new JButton("Blue");
		but3 = new JButton("Green");
		panel1.add(but1);
		panel1.add(but2);
		panel1.add(but3);
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new SuRuDemoFrame().setVisible(true);
	}
}
