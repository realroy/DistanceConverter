import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DistanceConverter extends JFrame {

	private JPanel mainPane;
	private JTextField input1;
	private JComboBox combobox1;
	private UnitConverter uc;
	private JLabel equalLabel;
	private JTextField resultField;
	private JTextField inputField;
	private JComboBox<Object> unitCombobox1;
	private JComboBox<Object> unitCombobox2;
	private JButton convertBtn;
	private JButton clearBtn;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceConverter frame = new DistanceConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DistanceConverter() {
		initComponent();
	}
	
	@SuppressWarnings("unchecked")
	public void initComponent(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 80);
		mainPane = new JPanel();
		setContentPane(mainPane);
		
		new UnitConverter();
		
		inputField 		= new JTextField();
		inputField.setColumns(10);
		unitCombobox1	= new JComboBox<Object>(Length.values());
		equalLabel 		= new JLabel("=");
		resultField 	= new JTextField();
		resultField.setColumns(10);
		unitCombobox2	= new JComboBox<Object>(Length.values());
		convertBtn		= new JButton("Convert!");
		clearBtn		= new JButton("Clear");
		mainPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		mainPane.add(inputField);
		mainPane.add(unitCombobox1);
		mainPane.add(equalLabel);
		mainPane.add(resultField);
		mainPane.add(unitCombobox2);
		mainPane.add(convertBtn);
		mainPane.add(clearBtn);
		
	}

}
