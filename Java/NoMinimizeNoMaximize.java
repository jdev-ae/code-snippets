import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NoMinimizeNoMaximize 
{
    private static void createAndShowGUI()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));
        panel.add(new JLabel("Howdy"));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        JDialog dialog = new JDialog(frame, "No Minimize or Maximize", true);
        dialog.getContentPane().add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        frame.dispose();
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });

    }
}