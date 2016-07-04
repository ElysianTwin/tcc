package telaLogin;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import telaSplashScreen.SplashScreen;

public class Principal {

	    public static void main(String[] args) {        
	        // Mostra uma imagem com o t�tulo da aplica��o 
	        SplashScreen splash = new SplashScreen(1000); //Dura��o em milisec
	        splash.showSplashAndExit();        //Mostrar e Fechar ap�s a dura��o
	        
	        try {
				EventQueue.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						FrameLogin mlogin = new FrameLogin();
						
					}
				});
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Falha");
			}
	        

	        
	        
	    }
		
		
	}
