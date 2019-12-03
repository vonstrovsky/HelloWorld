package indi.vonstro.window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowMain {

	private JFrame frame;
	private JButton btnMsg;

	public WindowMain() {

//		LookAndFeelInfo[] skins = UIManager.getInstalledLookAndFeels();
//		for (LookAndFeelInfo skin : skins) {
//
//			System.out.println(skin.getName() + " : " + skin.getClassName());
//		}
//
//		try {
//
//			// "javax.swing.plaf.metal.MetalLookAndFeel"
//			// "javax.swing.plaf.nimbus.NimbusLookAndFeel"
//			// "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
//			// "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
//			// "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}

		initialize();

//		SwingUtilities.updateComponentTreeUI(frame);
	}

	private void initialize() {

		/**
		 * btnMsg
		 */
		btnMsg = new JButton();
		btnMsg.setActionCommand("BUTTON_MESSAGE");
		btnMsg.setText("消息提示");
		btnMsg.addActionListener(onButtonClick);

		/**
		 * frame
		 */
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setTitle(this.getClass().getSimpleName());
		frame.setLayout(new BorderLayout());

		frame.getContentPane().add(btnMsg, BorderLayout.SOUTH);
	}

	@SuppressWarnings("unused")
	private void destroy() {

		frame.dispose();
	}

	public void show() {

		frame.setVisible(true);
	}

	private ActionListener onButtonClick = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("BUTTON_MESSAGE")) {

				JOptionPane.showMessageDialog(null, "HelloWorld!");
			}
		}
	};
}
