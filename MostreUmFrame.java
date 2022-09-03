import javax.swing.JFrame;

class MostreUmFrame {
	public static void main(String[] args) {
		JFrame meuframe = new JFrame();
		String meuTitulo = "Meu primeiro janela em java";

		meuframe.setTitulo(meuTitulo);
		meuframe.setSize(300, 200);
		meuframe.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
		meuframe.setVisible(true);
	}
}