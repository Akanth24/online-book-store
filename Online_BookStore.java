import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Online_BookStore implements ActionListener
{
// declaring values
 JMenuBar mb;
 JPanel jp1,jp2,jp3;
 JMenu m1,m2,m3,m4;
 JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8;
 JComboBox jcb1,jcb2,jcb3,jcb4;
 JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
 JTextField jtf1;
//constructor
 public Online_BookStore()
{
  JFrame jf=new JFrame();// creating frame
  jf.setLocation(700,300);// setting location of frame
  jf.setTitle("ONLINE_BOOK_STORE"); // title of Frame
  jf.setSize(600,600);// size of Frame 
  jf.setLayout(null);// to place item in the frame is in fixed positions 
  mb=new JMenuBar();// instance of menunbar
 //instance of panel
 jp1=new JPanel();
  jp2=new JPanel();
  jp2.setBackground(new Color(20,212,250));// setting panel backgroung colour
  jp2.setBounds(0,60,600,540); // setting position of panel
  jp1.setBackground(new Color(20,212,150));// setting panel backgroung colour
  jp1.setBounds(0,0,600,60);// setting position of panel
  jp1.setLayout(null);
  jp2.setLayout(null);
  JLabel jl1=new JLabel("STAR BOOKS"); // instance of label and naming label
  
  jl1.setFont(new Font("SanSerif",Font.BOLD,20));//font of the text and size
  jl1.setForeground(new Color(175,90,100)); //text colour
  jl1.setHorizontalAlignment(JLabel.CENTER);
  jl1.setVerticalAlignment(JLabel.CENTER);
  jl1.setBounds(0,0,150,30); //position of text label
  jp1.add(jl1); // adding label to panel

  jf.setJMenuBar(mb); // adding menubar to frame

  jtf1=new JTextField("Search",50);// instance of texft field
  jtf1.setBounds(170,5,350,20);
  jp1.add(jtf1);// adding text field to panel

  mb.setBackground(new Color(200,21,100));
  mb.setFont(new Font("SanSerif",Font.ITALIC|Font.BOLD,20));
// instance of menus and naming  
  m1=new JMenu("Comics");
  m2=new JMenu("Novels");
  m3=new JMenu("TextBooks");
  m4=new JMenu("Holy books");
// adding memus to menubar
  mb.add(m1); mb.add(m2); mb.add(m3); mb.add(m4);
// instance of menu items and naming 
  mi1=new JMenuItem("BATMAN");
  mi2=new JMenuItem("SUPERMAN");
  mi3=new JMenuItem("THE GREAT GATSBY");
  mi4=new JMenuItem("THE CATCHER IN THE RYE");
  mi5=new JMenuItem("CONCEPTS OF PHYSICS");
  mi6=new JMenuItem("CENGAGE");
  mi7=new JMenuItem("RAMAYAN");
  mi8=new JMenuItem("MAHABHARAT");
// adding menuitems to menu  
  m1.add(mi1); m1.add(mi2);
  m2.add(mi3); m2.add(mi4);
  m3.add(mi5); m3.add(mi6);
  m4.add(mi7); m4.add(mi8);
// creating combo box and adding item to it   
  jcb2=new JComboBox();
  jcb2.addItem("My Account");
  jcb2.addItem("Settings");
  jcb2.addItem("Wishlist");
  jcb2.addItem("Theme");
  jcb2.addItem("Logout");
  jp1.add(jcb2);
  jcb2.setBounds(0,40,200,20);

  jcb1=new JComboBox();
  jcb1.addItem("Filter");
  jcb1.addItem("Price : Low to High");
  jcb1.addItem("Price : High to Low");
  jcb1.addItem("Liked Books : High to Low");
  jcb1.setBounds(400,40,180,20);
  jp1.add(jcb1);
// adding image to the panel  
  ImageIcon i1=new ImageIcon(new ImageIcon("download.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
  JLabel jl2=new JLabel(i1);
  jl2.setBounds(0,0,80,80);
  jp2.add(jl2);
// adding text field to panel
  JTextField jtf2=new JTextField("Qty: ",35);
  jtf2.setBounds(300,35,35,20);
  jp2.add(jtf2);
  
// adding label to panel
  JLabel jl3=new JLabel("HARRY POTTER - THE SORCERES STONE\n");
  JLabel jl4=new JLabel("Author : JK ROWLING");
  JLabel jl5=new JLabel("Price: Rs.1200/-\n");
  jp2.add(jl3); jp2.add(jl4); jp2.add(jl5);
// setting positions of labels on panel
  jl3.setBounds(100,10,300,30);
  jl4.setBounds(100,40,300,10);
  jl5.setBounds(100,60,500,20);

//instance of button and naming
  jb1=new JButton("Purchase");
  jb2=new JButton("Add to Cart");
  jb1.setBounds(350,30,80,30);
  jb2.setBounds(450,30,100,30);
  jb1.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb2.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb1.setBackground(new Color(80,200,20));
  jb2.setBackground(new Color(80,200,20));
// eventhanling for buttons
  jb1.addActionListener(this);
  jb2.addActionListener(this);
//adding buttons to panel
  jp2.add(jb1); jp2.add(jb2);
  
  ImageIcon i2=new ImageIcon(new ImageIcon("gv.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
  JLabel jl9=new JLabel(i2);
  jl9.setBounds(0,80,80,80);
  jp2.add(jl9);
 
  JTextField jtf3=new JTextField("Qty: ",35);
  jtf3.setBounds(300,115,35,20);
  jp2.add(jtf3);
  
  JLabel jl6=new JLabel("GULLIVER'S TRAVELS");
  JLabel jl7=new JLabel("Author : Jonathon Swift");
  JLabel jl8=new JLabel("Price: Rs.1850/-\n");
  jp2.add(jl6); jp2.add(jl7); jp2.add(jl8);
  
  jl6.setBounds(100,90,300,30);
  jl7.setBounds(100,120,300,10);
  jl8.setBounds(100,140,500,20);

  jb3=new JButton("Purchase");
  jb4=new JButton("Add to Cart");
  jb3.setBounds(350,110,80,30);
  jb4.setBounds(450,110,100,30);
  jb3.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb4.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb3.setBackground(new Color(80,200,20));
  jb4.setBackground(new Color(80,200,20));
  jb3.addActionListener(this);
  jb4.addActionListener(this);
  jp2.add(jb3);
  jp2.add(jb4);

  ImageIcon i3=new ImageIcon(new ImageIcon("oliver.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
  JLabel jl10=new JLabel(i3);
  jl10.setBounds(0,160,80,80);
  jp2.add(jl10);
 
  JTextField jtf4=new JTextField("Qty: ",35);
  jtf4.setBounds(300,195,35,20);
  jp2.add(jtf4);
  
  JLabel jl11=new JLabel("OLIVER TWIST");
  JLabel jl12=new JLabel("Author : CHARLES DICKENS");
  JLabel jl13=new JLabel("Price: Rs.1570/-\n");
  jp2.add(jl11); jp2.add(jl12); jp2.add(jl13);
  
  jl11.setBounds(100,170,300,30);
  jl12.setBounds(100,200,300,10);
  jl13.setBounds(100,220,500,20);

  jb6=new JButton("Purchase");
  jb7=new JButton("Add to Cart");
  jb6.setBounds(350,190,80,30);
  jb7.setBounds(450,190,100,30);
  jb6.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb7.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb6.setBackground(new Color(80,200,20));
  jb7.setBackground(new Color(80,200,20));
  jb6.addActionListener(this);
  jb7.addActionListener(this);
  jp2.add(jb6);
  jp2.add(jb7);

  jb5=new JButton("MyCart");
  jb5.setFont(new Font("SanSerif",Font.ITALIC,10));
  jb5.setBackground(new Color(80,200,20));
  jp2.add(jb5);
  jb5.setBounds(450,400,100,30);
  
  jf.add(jp1); jf.add(jp2);
  jf.setVisible(true); // to visible frame
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close program on exiting
}
  public void actionPerformed(ActionEvent e)
{
  String s=e.getActionCommand();
  if(s.equals("Purchase"))
  {
    JOptionPane.showMessageDialog(null,"You will be directed to next page..");// when purchase button is clicked
  }
  else if(s.equals("Add to Cart"))
  {
    JOptionPane.showMessageDialog(null,"Added to cart Successfully!!");// when add to cart button is clicked
  }
}
// main method
  public static void main(String args[])
 {
  Online_BookStore n=new Online_BookStore();// instance of main class
 }
}