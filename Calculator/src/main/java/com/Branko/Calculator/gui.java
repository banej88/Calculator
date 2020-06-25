package com.Branko.Calculator;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

import java.awt.*;
import java.net.URL;

public class gui implements Runnable{

	
					private JFrame frame;
					private JTextField result =new JTextField();
					private JButton num0 = new JButton("0");
					private JButton clear = new JButton("Clear");
					private JButton num1 = new JButton("1");
					private JButton num2 = new JButton("2");
					private JButton num3 = new JButton("3");
					private JButton num4 = new JButton("4");
					private JButton num5 = new JButton("5");
					private JButton num6 = new JButton("6");
					private JButton num7 = new JButton("7");
					private JButton num8 = new JButton("8");
					private JButton num9 = new JButton("9");
					private JButton plus = new JButton("+");
					private JButton minus = new JButton("-");
					private JButton equals = new JButton("=");
					private JButton times = new JButton("x");
					private JButton divide = new JButton("/");
					private JButton dot = new JButton(".");
					private JButton delete = new JButton("Delete");
				
					private Font f = new Font(Font.SANS_SERIF,Font.BOLD,30);
					private AListener b;
					private KListener c;
					
					public void run() {
						
						frame = new JFrame("Calculator v1.0");
						
						ImageIcon icon = new ImageIcon("resource/icon.png");
						frame.setIconImage(icon.getImage());
						
						
						frame.setPreferredSize(new Dimension(540,680));
						frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
						
						
						createComponent(frame.getContentPane());
						
						frame.pack();
						
						frame.setVisible(true);
									
					}
					
					
					public void createComponent(Container container) {
											
							
							
							this.b=new AListener(result,num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,clear,plus,minus,equals,dot,times,divide,delete);
							this.c=new KListener(result);
							GridLayout layout = new GridLayout(3,1);
							container.setLayout(layout);
							Action beep = result.getActionMap().get(DefaultEditorKit.deletePrevCharAction);
							beep.setEnabled(false);
							container.add(result);
							result.setBackground(Color.black);
							result.setFont(f);
							result.setForeground(Color.white);
							result.setEditable(false);
							
							container.add(numbersPanel());
							container.add(functionsPanel());
										
		
					}
					
					public JPanel numbersPanel() {
						
						JPanel panel = new JPanel(new GridLayout(3,3));		
						panel.setBackground(Color.gray);
						panel.add(num1);
						num1.setFont(f);
						num1.setForeground(Color.white);
						num1.setBackground(Color.DARK_GRAY);
						num1.addActionListener(b);
						num1.setFocusable(false);
						result.addKeyListener(c);
						panel.add(num2);
						num2.setFont(f);
						num2.addActionListener(b);
						num2.setForeground(Color.white);
						num2.setBackground(Color.DARK_GRAY);
						num2.setFocusable(false);
						panel.add(num3);
						num3.setFont(f);
						num3.addActionListener(b);
						num3.setForeground(Color.white);
						num3.setBackground(Color.DARK_GRAY);
						num3.setFocusable(false);
						panel.add(num4);
						num4.setFont(f);
						num4.addActionListener(b);
						num4.setForeground(Color.white);
						num4.setBackground(Color.DARK_GRAY);
						num4.setFocusable(false);
						panel.add(num5);
						num5.setFont(f);
						num5.addActionListener(b);
						num5.setForeground(Color.white);
						num5.setBackground(Color.DARK_GRAY);
						num5.setFocusable(false);
						panel.add(num6);
						num6.setFont(f);
						num6.addActionListener(b);
						num6.setForeground(Color.white);
						num6.setBackground(Color.DARK_GRAY);
						num6.setFocusable(false);
						panel.add(num7);
						num7.setFont(f);
						num7.addActionListener(b);
						num7.setForeground(Color.white);
						num7.setBackground(Color.DARK_GRAY);
						num7.setFocusable(false);
						panel.add(num8);
						num8.setFont(f);
						num8.addActionListener(b);
						num8.setForeground(Color.white);
						num8.setBackground(Color.DARK_GRAY);
						num8.setFocusable(false);
						panel.add(num9);
						num9.setFont(f);
						num9.addActionListener(b);
						num9.setForeground(Color.white);
						num9.setBackground(Color.DARK_GRAY);
						num9.setFocusable(false);
						return panel;
					}
					
						public JPanel functionsPanel() {		
						JPanel panel = new JPanel(new GridLayout(3,3));		
						panel.setBackground(Color.gray);
						panel.add(num0);
						num0.addActionListener(b);
						num0.setFont(f);
						num0.setForeground(Color.white);
						num0.setBackground(Color.DARK_GRAY);
						num0.setFocusable(false);
						panel.add(plus);
						plus.setFont(f);
						plus.setForeground(Color.white);
						plus.setBackground(Color.DARK_GRAY);
						plus.addActionListener(b);
						plus.setFocusable(false);
						clear.setFont(f);
						clear.addActionListener(b);
						clear.setForeground(Color.white);
						clear.setBackground(Color.DARK_GRAY);
						clear.setFocusable(false);
						panel.add(minus);
						minus.setFont(f);
						minus.setForeground(Color.white);
						minus.setBackground(Color.DARK_GRAY);
						minus.addActionListener(b);
						minus.setFocusable(false);
						panel.add(times);
						times.setFont(f);
						times.addActionListener(b);
						times.setForeground(Color.white);
						times.setBackground(Color.DARK_GRAY);
						times.setFocusable(false);
						panel.add(divide);
						divide.setFont(f);
						divide.setForeground(Color.white);
						divide.setBackground(Color.DARK_GRAY);
						divide.setFocusable(false);
						divide.addActionListener(b);
						panel.add(clear);
						dot.setFont(f);
						dot.setForeground(Color.white);
						dot.setBackground(Color.DARK_GRAY);
						dot.setFocusable(false);
						dot.addActionListener(b);
						panel.add(dot);
						equals.setFont(f);
						equals.setForeground(Color.white);
						equals.setBackground(Color.DARK_GRAY);
						equals.addActionListener(b);
						equals.setFocusable(false);
						panel.add(equals);
						delete.setFont(f);
						delete.setForeground(Color.white);
						delete.setBackground(Color.DARK_GRAY);
						delete.addActionListener(b);
						delete.setFocusable(false);
						panel.add(delete);
						return panel;
					}

						
						
						
						
						
					             
					             
				
	
}
