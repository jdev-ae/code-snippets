import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//How to Grab the HTML source of a website URL

public class GrabHTML extends JFrame{

	 String txt = null;
	public GrabHTML(){
		Connect();
			setSize(500,500);
			JTextPane a = new JTextPane();
			a.setText(txt);
			add(new JLabel(txt));
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void Connect(){
	try {
        //Set URL
        URL url = new URL("file:///C:/temp/Home%20Page/My%20Home%20Page.html");
        URLConnection spoof = url.openConnection();

        //Spoof the connection so we look like a web browser
        //spoof.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0; H010818)");
        BufferedReader in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));
        String strLine = "";
		

        //Loop through every line in the source
        while ((strLine = in.readLine()) != null) {

            //Prints each line to the console
            System.out.println(strLine);
			this.txt += strLine;
        }
	}catch(Exception e) {e.printStackTrace();}
    }

    public static void main(String[] args) {

        try {
            //Calling the Connect method
			new GrabHTML();
        } catch (Exception e) {
        }
    }
}