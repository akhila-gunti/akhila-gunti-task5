package task5;

	import java.io.IOException;
	import java.util.Scanner;

	import java.util.logging.Logger; 



		public class simpleinterest {

			private static final Logger logger = Logger.getLogger(calculateinterest.class.getName());

			float principleAmount,rate,time,simpleInterest;

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

			void calculateSimpleInterest(){

				simpleInterest = (principleAmount * rate * time)/100;

			}

			void displayAmount() throws IOException{

				logger.info("Total Interest : "+simpleInterest);

			}



		}





