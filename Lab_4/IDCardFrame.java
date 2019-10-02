import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class IDCardFrame extends JFrame{
	//Variables
	private String title;
	
	/**
	 * Creates an instance of IDCardFrame with a title
	 * @param title
	 */
	//Constructor
	public IDCardFrame(String title) {
		this.title = title;	
		//Labels
		JLabel nameLabel = new JLabel("Arthur Chu");
		JLabel javaLabel = new JLabel("Java Programmer");
		JLabel heightLabel = new JLabel("5' 5''");
		JLabel weightLabel = new JLabel("140 lbs.");
		JLabel eyeColorLabel = new JLabel("Brown");
		
		//Create the frame
		this.setLayout(new GridBagLayout());
		GridBagConstraints frameConstraints = new GridBagConstraints();
		
		//Place the Name Label
		frameConstraints.gridx = 1;
		frameConstraints.gridy = 0;
		this.add(nameLabel, frameConstraints);
		
		//Place the javaLabel
		frameConstraints.gridx = 1;
		frameConstraints.gridy = 5;
		this.add(javaLabel, frameConstraints); 
		
		//Place the height label
		frameConstraints.gridx = 2;
		frameConstraints.gridy = 2;
		this.add(heightLabel, frameConstraints);

		//Place the weight label
		frameConstraints.gridx = 2;
		frameConstraints.gridy = 3;
		this.add(weightLabel, frameConstraints);

		//Place the eyeColorLabel
		frameConstraints.gridx = 2;
		frameConstraints.gridy = 4;
		this.add(eyeColorLabel, frameConstraints);
		
		//Set the frame's size
		this.setSize(500, 800);
		
		//Set the frame's position

		//Make the frame unable to be resized
		this.setResizable(false);
		
		//Make the window visible
		this.setVisible(true);
	}
	
	public static void main(String[] args) { 
		IDCardFrame idFrame = new IDCardFrame("ID Card");
	}
}

