package indi.vonstro;

import javax.swing.SwingUtilities;

import indi.vonstro.window.WindowMain;

public class Application {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(doRun);
	}

	private static Runnable doRun = new Runnable() {

		@Override
		public void run() {

			WindowMain frmMain = new WindowMain();
			frmMain.show();
		}
	};
}
