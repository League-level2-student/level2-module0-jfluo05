/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	int hiddenButton = 0;
	JButton[] buttons;
	Random r = new Random();
	boolean newNum = true;

	// 1. create an array of JButtons. Don't initialize it yet.

	// 2 create an int variable called hiddenButton

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {

		window = new JFrame("Find the Button");
		panel = new JPanel();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String numberOfButtons = JOptionPane.showInputDialog("Enter in a positive number:");
		int nOB = Integer.parseInt(numberOfButtons);

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3

		// 5. Make a for loop to iterate through the JButton array
		buttons = new JButton[nOB];
		for (int i = 0; i < buttons.length; i++) {

		}
		// 6. initialize each JButton in the array

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		window.add(panel);
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find and press the button that has 'me' writton on it.");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		hiddenButton = r.nextInt(nOB);
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "Yay! You win!");
			newNum = true;
			start();
		}
		// 18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null, "TRY AGAIN");
			newNum = false;
		}
	}
}
