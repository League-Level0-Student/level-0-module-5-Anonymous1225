package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;
public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	static float level=0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int task = JOptionPane.showOptionDialog(null, "What pet would you like to choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Guinea Pig", "Dog", "Cat", "Fish", "Hamster", "Bird", "Frog","Tortoise", "Mouse","Snake","Lizard","Spider","Rabbit"}, null);

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(level<15) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
//			int task = JOptionPane.showOptionDialog(null, "What pet would you like to choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
//					new String[] { "Guinea Pig", "Dog", "Cat", "Fish", "Hamster", "Bird", "Frog","Tortoise", "Mouse","Snake","Lizard","Spider","Rabbit"}, null);
			if (task==0) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					JOptionPane.showMessageDialog(null, "Squeak");
					level+=1.2;
				}
				if (awww==1) {
					level+=0.5;
				}
				if (awww==2) {
					level+=5;
				}
				if (awww==3) {
					level+=4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==1) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
					if (awww==0) {
						level+=1.2;
					}
					if (awww==1) {
						level+=2;
					}
					if (awww==2) {
						level+=3;
					}
					if (awww==3) {
						level+=7;
					}
					JOptionPane.showMessageDialog(null, level);
			}
			if (task==2) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
					if (awww==0) {
						level+=0.1;
					}
					if (awww==1) {
						level+=0.1;
					}
					if (awww==2) {
						level+=3;
					}
					if (awww==3) {
						level+=0.1;
					}
					JOptionPane.showMessageDialog(null, level);
			}
			if (task==3) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
					if (awww==0) {
						level+=0;
					}
					if (awww==1) {
						level-=2147483647;
						JOptionPane.showMessageDialog(null, level);
						JOptionPane.showMessageDialog(null, "It died :(");
						//FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
						break;
					}
					if (awww==2) {
						level+=3;
					}
					if (awww==3) {
						level-=0;
					}
					JOptionPane.showMessageDialog(null, level);
			}
			if (task==4) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=1.2;
				}
				if (awww==1) {
					level+=0.5;
				}
				if (awww==2) {
					level+=5;
				}
				if (awww==3) {
					level+=2;
				}
				JOptionPane.showMessageDialog(null, level);
			}
			if (task==5) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=1.2;
				}
				if (awww==1) {
					level+=6;
				}
				if (awww==2) {
					level+=5;
				}
				if (awww==3) {
					level+=4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==6) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=1.2;
				}
				if (awww==1) {
					level+=2;
				}
				if (awww==2) {
					level+=7;
				}
				if (awww==3) {
					level+=-2;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==7) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=.12;
				}
				if (awww==1) {
					level+=.6;
				}
				if (awww==2) {
					level+=.5;
				}
				if (awww==3) {
					level+=0.5;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==8) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=5;
				}
				if (awww==1) {
					level+=6;
				}
				if (awww==2) {
					level+=5;
				}
				if (awww==3) {
					level+=4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==9) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=1.2;
				}
				if (awww==1) {
					level+=6;
				}
				if (awww==2) {
					level+=5;
					JOptionPane.showMessageDialog(null, "Sorry mice :(");
				}
				if (awww==3) {
					level+=4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==10) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=.1;
				}
				if (awww==1) {
					level+=.6;
				}
				if (awww==2) {
					level+=.5;
				}
				if (awww==3) {
					level+=.4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==11) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=1.2;
				}
				if (awww==1) {
					level+=6;
				}
				if (awww==2) {
					level+=5;
					JOptionPane.showMessageDialog(null, "sorry flies:(");
				}
				if (awww==3) {
					level+=4;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			if (task==12) {
				int awww= JOptionPane.showOptionDialog(null,"Anything you'd like to do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Pet", "Walk","Feed", "Cuddle"}, null);
				if (awww==0) {
					level+=5;
				}
				if (awww==1) {
					level+=6;
				}
				if (awww==2) {
					level+=5;
				}
				if (awww==3) {
					level+=7;
				}
				JOptionPane.showMessageDialog(null, level);
				
			}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void walk(){
		
	}
}