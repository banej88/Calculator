package com.Branko.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class AListener implements ActionListener{
	
						
						private JTextField result;
						private JButton num0 = new JButton("0");
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
						private JButton times = new JButton("*");
						private JButton divide = new JButton("/");
						private JButton percent = new JButton("%");
						private JButton clear = new JButton("Clear");
						private JButton dot = new JButton(".");
						private JButton delete=new JButton();
						private Logic c;
						private List<Double> brojevi;
						
						
						
						public AListener(JTextField result,JButton num1,JButton num2,JButton num3,JButton num4,JButton num5,
								JButton num6,JButton num7,JButton num8,JButton num9,JButton num0,JButton clear,JButton plus,
								JButton minus,JButton equals,JButton dot,JButton times,JButton divide,JButton delete) {
							
							this.result=result;
							this.num1=num1;
							this.num2=num2;
							this.num3=num3;
							this.num4=num4;
							this.num5=num5;
							this.num6=num6;
							this.num7=num7;
							this.num8=num8;
							this.num9=num9;
							this.num0=num0;
							this.clear=clear;
							this.plus=plus;
							this.minus=minus;
							this.equals=equals;
							this.dot=dot;
							this.times=times;
							this.divide=divide;
							this.delete=delete;
							this.c=new Logic();
							this.brojevi=new ArrayList<Double>();
							
						}
						
	
						public void actionPerformed(ActionEvent ae) {
									
							
								
								if(ae.getSource()==num1) {
									
									result.setText(result.getText()+"1");
									
								}
								else if(ae.getSource()==num2) {
									
									result.setText(result.getText()+"2");
									
								}
								else if(ae.getSource()==num3) {
									
									result.setText(result.getText()+"3");
								}
								else if(ae.getSource()==num4) {
	
									result.setText(result.getText()+"4");
								}
								else if(ae.getSource()==num5) {
	
									result.setText(result.getText()+"5");
								}
								else if(ae.getSource()==num6) {
	
									result.setText(result.getText()+"6");
								}
								else if(ae.getSource()==num7) {
	
									result.setText(result.getText()+"7");
								}
								else if(ae.getSource()==num8) {
	
									result.setText(result.getText()+"8");
								}
								else if(ae.getSource()==num9) {
	
									result.setText(result.getText()+"9");
								}
								else if(ae.getSource()==clear) {
									
									result.setText("");
								}
								else if(ae.getSource()==num0) {
									
									result.setText(result.getText()+"0");
								}
							
								else if(ae.getSource()==plus) {
										
									if(result.getText().isEmpty() || result.getText().contains("+") || (!result.getText().startsWith("-") 
											&& result.getText().contains("-")) ||
											result.getText().contains("/") || result.getText().contains("*")) {
										
									}else {
										
										if((result.getText().startsWith("-") && result.getText().matches("^(.*?\\-){2,}.*$"))) {
											
										}else {
											
											if(result.getText().substring(0).equals("-")) {
												
											}else {	
											
										result.setText(result.getText()+"+");
										
											}
										}
									}
									
								}else if(ae.getSource()==minus) {
									
								
									
									if(result.getText().contains("+") || (!result.getText().startsWith("-") && result.getText().contains("-")) ||
											result.getText().contains("/") || result.getText().contains("*")) {
											
			
									}else {
										
										
										if((result.getText().startsWith("-") && result.getText().matches("^(.*?\\-){2,}.*$"))) {
											
										}else {
											
											if(result.getText().substring(0).equals("-")) {
												
											}	else {	
												
										result.setText(result.getText()+"-");
										
										}
									}
									}	
								}else if(ae.getSource()==dot) {
									
									if(result.getText().matches("^(.*?\\.){2,}.*$")) {
										
									}
									
									
									
									if(
									!result.getText().startsWith("-") && result.getText().contains("+") 
									&& !result.getText().substring(0, result.getText().indexOf("+")).contains(".")
									&& result.getText().substring(result.getText().indexOf("+"),result.getText().length()).contains(".")||
									
									result.getText().startsWith("-") && result.getText().contains("+") 
									&& !result.getText().substring(0, result.getText().indexOf("+")).contains(".")
									&& result.getText().substring(result.getText().indexOf("+"),result.getText().length()).contains(".")||
											
									!result.getText().startsWith("-") && result.getText().contains("-") 
									&& !result.getText().substring(0, result.getText().indexOf("-")).contains(".")
									&& result.getText().substring(result.getText().indexOf("-"),result.getText().length()).contains(".") ||
													
									!result.getText().startsWith("-") && result.getText().contains("*") 
									&& !result.getText().substring(0, result.getText().indexOf("*")).contains(".")
									&& result.getText().substring(result.getText().indexOf("*"),result.getText().length()).contains(".") ||
									
									result.getText().startsWith("-") && result.getText().contains("*") 
									&& !result.getText().substring(0, result.getText().indexOf("*")).contains(".")
									&& result.getText().substring(result.getText().indexOf("*"),result.getText().length()).contains(".") ||
											
									!result.getText().startsWith("-") && result.getText().contains("/") 
									&& !result.getText().substring(0, result.getText().indexOf("/")).contains(".")
									&& result.getText().substring(result.getText().indexOf("/"),result.getText().length()).contains(".") ||
									
									result.getText().startsWith("-") && result.getText().contains("/") 
									&& !result.getText().substring(0, result.getText().indexOf("/")).contains(".")
									&& result.getText().substring(result.getText().indexOf("/"),result.getText().length()).contains(".")
													
													) {	
											}
									
									else if(
											
									result.getText().startsWith("-") && result.getText().contains("+") 
									&& result.getText().substring(0, result.getText().indexOf("+")).contains(".")
									&& result.getText().substring(result.getText().indexOf("+"),result.getText().length()).contains(".") ||
											
									result.getText().contains("+") && result.getText().substring(0, result.getText().indexOf("+")).contains(".")
									&& result.getText().substring(result.getText().indexOf("+"),result.getText().length()).contains(".") ||
									
									!result.getText().startsWith("-") && result.getText().contains("-") 
									&& result.getText().substring(0, result.getText().indexOf("-")).contains(".")
									&& result.getText().substring(result.getText().indexOf("-"),result.getText().length()).contains(".") ||
									
									result.getText().startsWith("-") && result.getText().substring(1, result.getText().length()).contains("-") 
									&& result.getText().contains(".") &&
									result.getText().substring(result.getText().indexOf("-", 1), result.getText().length()).contains(".") ||
																		
									result.getText().startsWith("-") && result.getText().contains("*") 
									&& result.getText().substring(0, result.getText().indexOf("*")).contains(".")
									&& result.getText().substring(result.getText().indexOf("*"),result.getText().length()).contains(".") ||
											
									result.getText().contains("*") && result.getText().substring(0, result.getText().indexOf("*")).contains(".")
									&& result.getText().substring(result.getText().indexOf("*"),result.getText().length()).contains(".") ||
									
									result.getText().startsWith("-") && result.getText().contains("/") 
									&& result.getText().substring(0, result.getText().indexOf("/")).contains(".")
									&& result.getText().substring(result.getText().indexOf("/"),result.getText().length()).contains(".") ||
											
									result.getText().contains("/") && result.getText().substring(0, result.getText().indexOf("/")).contains(".")
									&& result.getText().substring(result.getText().indexOf("/"),result.getText().length()).contains(".") 
									
									
									
											) {	
									}
									
													
									else {
										if(result.getText().contains("+") || (!result.getText().startsWith("-") && result.getText().contains("-")) ||
											result.getText().contains("/") || result.getText().contains("*") || !result.getText().contains(".")
											|| (result.getText().startsWith("-") && result.getText().matches("^(.*?\\-){2,}.*$"))) {
											
											if(result.getText().isEmpty() || result.getText().contains("+") &&
													result.getText().substring(result.getText().indexOf("+")).equals("+") ||
														
													result.getText().contains("-") &&
													result.getText().substring(result.getText().indexOf("-")).equals("-") ||
													
													result.getText().startsWith("-") && result.getText().substring(1).contains("-") &&
													result.getText().substring(result.getText().indexOf("-", 1)).equals("-")  ||
													
													result.getText().contains("*") &&
													result.getText().substring(result.getText().indexOf("*")).equals("*") ||
													
													result.getText().contains("/") &&
													result.getText().substring(result.getText().indexOf("/")).equals("/")
																								) 
												
												{				
												
											}else {
												
											 result.setText(result.getText()+".");
											 
										}
										}
									}
								
								
								}else if(ae.getSource()==times) {
									
									if(result.getText().isEmpty() || result.getText().contains("+") || (!result.getText().startsWith("-") && result.getText().contains("-")) ||
											result.getText().contains("/") || result.getText().contains("*")) {
										
									}else {
										
										if((result.getText().startsWith("-") && result.getText().matches("^(.*?\\-){2,}.*$"))) {
											
										}else {
											
											if(result.getText().substring(0).equals("-")) {
												
											}else {	
												
										result.setText(result.getText()+"*");
											}
										}
									}
									
								}else if(ae.getSource()==divide) {
									
									if(result.getText().isEmpty()  || result.getText().contains("+") || (!result.getText().startsWith("-") 
											&& result.getText().contains("-")) ||
											result.getText().contains("/") || result.getText().contains("*")) {
										
									}else {
										
										if((result.getText().startsWith("-") && result.getText().matches("^(.*?\\-){2,}.*$"))) {
											
										}else {
											
											if(result.getText().substring(0).equals("-")) {
												
											}else {	
												
										result.setText(result.getText()+"/");
										
											}
										}
									}	

								}else if(ae.getSource()==delete) {
									
									if(result.getText().isEmpty()) {
										
									}else {
										
									result.setText(result.getText().substring(0, result.getText().length()-1));
									
									}
								}
								
								
								else if(ae.getSource()==equals) {
										
										double a=0;
										double b=0;
										Character plus = '+';
										Character minus = '-';
										Character times='*';
										Character divide='/';
										
										
										if(result.getText().contains("+")) {
											
												
											
												for(int i=0;i<result.getText().length();i++) {
													
													if(result.getText().startsWith("-")==true && i==0) {
														
														i++;
													}
													
													if(result.getText().charAt(i)==plus) {
													
														try {
														a=Double.parseDouble(result.getText().substring(0,i));
														b=Double.parseDouble(result.getText().substring(i+1,result.getText().length()));
														
														}catch (NumberFormatException e) {
														    
														  }
													}
													
												}	result.setText(c.plus(a, b)+"");
												
												
										}else if((result.getText().contains("-") && result.getText().startsWith("-")==false) ||
												(result.getText().substring(1, result.getText().length()).contains("-") 
												&& result.getText().startsWith("-"))==true) {
											
											
											for(int i=0;i<result.getText().length();i++) {
												
												if(result.getText().startsWith("-")==true && i==0) {
													
													i++;
												}
												
												if(result.getText().charAt(i)==minus) {
													
													try {
													a=Double.parseDouble(result.getText().substring(0,i));
													b=Double.parseDouble(result.getText().substring(i+1,result.getText().length()));
													
													}catch (NumberFormatException e) {
													    
													  }
												}
												
											}	result.setText(c.minus(a, b)+"");		
										
								}else if(result.getText().contains("*")) {
									
									
									for(int i=0;i<result.getText().length();i++) {
										
										if(result.getText().startsWith("-")==true && i==0) {
											
											i++;
										}
										
										if(result.getText().charAt(i)==times) {
											
											try {
											a=Double.parseDouble(result.getText().substring(0,i));
											b=Double.parseDouble(result.getText().substring(i+1,result.getText().length()));
											
											}catch (NumberFormatException e) {
											    
											  }
										}
										
									}	result.setText(c.times(a, b)+"");	
									
								
								}else if(result.getText().contains("/") || result.getText().contains("/") && result.getText().startsWith("-") ) {
									
									
									for(int i=0;i<result.getText().length();i++) {
										
										int start=0;
										if(result.getText().startsWith("-")==true && i==0) {
											
											i++;
											start++;
										}
										
										if(result.getText().charAt(i)==divide) {
											
											try {
											a=Double.parseDouble(result.getText().substring(start,i));
											b=Double.parseDouble(result.getText().substring(i+1,result.getText().length()));
											
											}catch (NumberFormatException e) {
											    
											  }
										
										}
										
									}	result.setText(c.divide(a, b)+"");						
						
								}
										
								}
						}

}