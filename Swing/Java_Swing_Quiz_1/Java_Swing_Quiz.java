import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 参考 Oracle 官方教程：
 * 1. 如何使用 FlowLayout: https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html
 * 2. 如何添加 Menu: https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
 */
public class Java_Swing_Quiz extends JFrame {
	private JLabel label;
	private JButton button;
	private JTextField textField;
	private MenuBar menubar;
	private Menu menu;
	private MenuItem menuItem;
	
	public Java_Swing_Quiz() throws HeadlessException {
		super();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		this.setMenuBar(createMenuBar(contentPane));
		
		createLabel(contentPane);
		createButton(contentPane);
		createTextField(contentPane);
		
		//添加  button 事件监听器
		button.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				int labelNum = Integer.parseInt(label.getText());				
				label.setText("" + labelNum * 2);
			}
		});
		
		//添加 menuItem 事件监听器
		menuItem.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				
				sb
					.append(label.getText())
					.append(textField.getText());
				
				label.setText(sb.toString());
			}
		});
		
		//添加 button2 并且绑定对应的监听事件
		JButton button2 = new JButton();
		//添加 button2 到contentPane
		contentPane.add(button2);
		button2.setText("Multiply");
		button2.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				int textFieldNum = Integer.parseInt(textField.getText());
				int labelNum = Integer.parseInt(label.getText());
				
				label.setText("" + textFieldNum * labelNum);
			}
		});
		
		this.setSize(400, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private void createTextField(Container contentPane) {
		textField = new JTextField();
		textField.setColumns(20);
		contentPane.add(textField);
	}
	private void createButton(Container contentPane) {
		button = new JButton();
		button.setText("Double");
		contentPane.add(button);
	}
	private void createLabel(Container contentPane) {
		label = new JLabel();
		label.setText("2");
		contentPane.add(label);
	}
	private MenuBar createMenuBar(Container contentPane) {
		menubar = new MenuBar();
		
		menu = new Menu();
		menu.setLabel("Action");
		
		menuItem = new MenuItem();
		menuItem.setLabel("Append");
		
		menu.add(menuItem);	
		menubar.add(menu);
		
		return menubar;
	}
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	public MenuBar getMenubar() {
		return menubar;
	}
	public void setMenubar(MenuBar menubar) {
		this.menubar = menubar;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	public static void main(String[] args) {
		new GUI_Demo();
	}
}


