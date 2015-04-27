import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SortSetter extends JFrame implements ActionListener{
public int [] array = new int [10];
public JButton Sort = new JButton("Sort");
public JTextField [] text= new JTextField [10];
public JLabel [] label = new JLabel[10];
public JLabel label1= new JLabel("Please enter 10 numbers in the array.");
public JPanel panel1= new JPanel();
public JPanel panel2= new JPanel();
public JPanel [] panel= new JPanel[10];
public SortSetter(){
	setVisible(true);
	panel2.setLayout(new GridLayout(12,1));
	panel2.add(label1);
	for(int i=0;i<10;i++){
		panel[i]= new JPanel();
		panel[i].setLayout(new GridLayout(1,2));
		label[i]=new JLabel("Number "+(i+1));
		text[i]= new JTextField();
		panel[i].add(label[i]);
		panel[i].add(text[i]);
		panel2.add(panel[i]);
		
	}
	Sort.addActionListener(this);
	panel2.add(Sort);
	add(panel2);
	pack();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
	
	JOptionPane.showMessageDialog(null,""+Sortout());
}
public String Sortout (){
	for(int b=0;b<10;b++){
		array[b]= Integer.parseInt(text[b].getText());
	}
	for (int w=0;w<9;w++){
	for (int c=0;c<9;c++){
		if(array[c]>array[c+1]){
			Switch(array,c,c+1);
		}
	}}
	return  ""+array[0]+","+array[1]+","+array[2]+","+array[3]+","+array[4]+","+array[5]+","+array[6]+","+array[7]+","+array[8]+","+array[9];
	
}
public static void Switch(int [] array, int smallnumber, int biggernumber){
	int v1=array[smallnumber];
	int v2=array[biggernumber];
	array[biggernumber]=v1;
	array[smallnumber]=v2;
}
}
