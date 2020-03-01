package task5;

	import java.util.Scanner;
	import java.util.logging.Logger;
	import java.io.IOException; 
	public class compoundinterest {

			static Logger logger = Logger.getLogger(calculateinterest.class.getName());

			float principleAmount,rate,time;

			double Interest;

			private Scanner sc;

			void readValues() throws IOException{

				sc = new Scanner(System.in);

				logger.info("Enter Principle Amount : ");

				principleAmount = sc.nextFloat();

				logger.info("Enter Rate : ");

				rate = sc.nextFloat();

				logger.info("Enter Time Period : ");

				time = sc.nextFloat();

			}

			void calculateCompoundInterest(){

				Interest =principleAmount*(Math.pow (1+rate/100,time));

			}

			void displayAmount() throws IOException{

				logger.info("Total Interest : "+Interest);

			}



		}




