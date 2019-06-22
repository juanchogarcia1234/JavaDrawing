import javax.swing.JFrame;

public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal init = new Principal();
		init.go();

	}
	
	public void go() {
		JFrame marco = new JFrame();
		MyDrawPanel dibujo = new MyDrawPanel();
		
		marco.getContentPane().add(dibujo);
		
		marco.setSize(300,300);
		marco.setVisible(true);
	}

}
