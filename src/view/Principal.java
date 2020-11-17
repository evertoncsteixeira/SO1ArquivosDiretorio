package view;
import controller.IArquivosController;

import java.io.IOException;

import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\SIGCR";
		
		try {
			//arqCont.readDir(dirWin);
			//arqCont.createFile(dirWin,"teste");
			//arqCont.readFile(dirWin, "teste.txt");
			arqCont.openFile(dirWin, "teste.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
