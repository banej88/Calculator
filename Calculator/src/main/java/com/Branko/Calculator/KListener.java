package com.Branko.Calculator;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class KListener implements KeyListener {

							private JTextField result;
							private Logic c;
							
							public KListener(JTextField result) {
								
								this.result=result;
								this.c=new Logic();
								
							}			
							
							public void keyPressed(KeyEvent ke) {
									
								
									if(ke.getKeyCode()==KeyEvent.VK_1 || ke.getKeyCode()==KeyEvent.VK_NUMPAD1) {
										
										result.setText(result.getText()+"1");
									}
									else if(ke.getKeyCode()==KeyEvent.VK_2 || ke.getKeyCode()==KeyEvent.VK_NUMPAD2) {
										
										result.setText(result.getText()+"2");
										
									}
									else if(ke.getKeyCode()==KeyEvent.VK_3 || ke.getKeyCode()==KeyEvent.VK_NUMPAD3) {
										
										result.setText(result.getText()+"3");
										
									}
									else if(ke.getKeyCode()==KeyEvent.VK_4 || ke.getKeyCode()==KeyEvent.VK_NUMPAD4) {
										
										result.setText(result.getText()+"4");
	
									}
									else if(ke.getKeyCode()==KeyEvent.VK_5 || ke.getKeyCode()==KeyEvent.VK_NUMPAD5) {
										
										result.setText(result.getText()+"5");
	
									}
									else if(ke.getKeyCode()==KeyEvent.VK_6 || ke.getKeyCode()==KeyEvent.VK_NUMPAD6) {
										
										result.setText(result.getText()+"6");
	
									}
									else if(ke.getKeyCode()==KeyEvent.VK_7 || ke.getKeyCode()==KeyEvent.VK_NUMPAD7) {
										
										result.setText(result.getText()+"7");
									}
									else if(ke.getKeyCode()==KeyEvent.VK_9 || ke.getKeyCode()==KeyEvent.VK_NUMPAD9) {
										
										result.setText(result.getText()+"9");
	
									}else if(ke.getKeyCode()==KeyEvent.VK_0 || ke.getKeyCode()==KeyEvent.VK_NUMPAD0) {
										
										result.setText(result.getText()+"0");
	
									}else if(ke.getKeyCode()==KeyEvent.VK_ADD) {
										
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
										
									}else if(ke.isShiftDown()==true && ke.getKeyChar()=='+') {
											
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
									
										
									
									}else if(ke.getKeyCode()==KeyEvent.VK_SUBTRACT || ke.getKeyCode()==45) {
										
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
									}else if(ke.getKeyCode()==KeyEvent.VK_DIVIDE || ke.getKeyCode()==47) {
										
										if(result.getText().isEmpty() || result.getText().contains("+") || (!result.getText().startsWith("-") 
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
									}else if(ke.getKeyCode()==KeyEvent.VK_MULTIPLY || ke.getKeyChar()=='*') {
										
										if(result.getText().isEmpty() || result.getText().contains("+") || (!result.getText().startsWith("-") 
												&& result.getText().contains("-")) ||
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
										
										
										
									    }else if(ke.getKeyCode()==KeyEvent.VK_8 || ke.getKeyCode()==KeyEvent.VK_NUMPAD8) {
											
											result.setText(result.getText()+"8");
										
										
										
										
									}else if(ke.getKeyCode()==KeyEvent.VK_PERIOD || ke.getKeyCode()==KeyEvent.VK_DECIMAL) {
										
			
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
										
										result.getText().startsWith("-") 
										&& result.getText().substring(1, result.getText().length()).contains("-") && result.getText().contains(".") &&
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
									
									}
										else if(ke.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
										
											if(result.getText().isEmpty()) {
																
											}else {
												
											result.setText(result.getText().substring(0, result.getText().length()-1));
											
											}
									
									   }else if(ke.getKeyCode()==KeyEvent.VK_ENTER || ke.getKeyCode()==KeyEvent.VK_ACCEPT) {
										
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
													
												}	
												
												
												result.setText(c.plus(a, b)+"");
												
											} else if((result.getText().contains("-") && result.getText().startsWith("-")==false) ||
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
												
											
											}else if(result.getText().contains("/")) {
												
												
												for(int i=0;i<result.getText().length();i++) {
													
													if(result.getText().startsWith("-")==true && i==0) {
														
														i++;
													}
													
													if(result.getText().charAt(i)==divide) {
														
														try {
														a=Double.parseDouble(result.getText().substring(0,i));
														b=Double.parseDouble(result.getText().substring(i+1,result.getText().length()));
														
														}catch (NumberFormatException e) {
														    
														  }
													}
													
												}	result.setText(c.divide(a, b)+"");	
												
											
											}
									}
								
							}

							public void keyReleased(KeyEvent e) {
								// TODO Auto-generated method stub
								
							}

							public void keyTyped(KeyEvent e) {
								// TODO Auto-generated method stub
								
							}
}