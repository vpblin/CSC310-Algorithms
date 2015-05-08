package finite_automatas;

import java.util.Scanner;
import java.lang.String;

public class FiniteAutomata {
//thanks http://stackoverflow.com/questions/20153970/how-do-i-implement-a-dfa-in-java-without-using-reg-expression
    public static void main(String[] args) throws Exception {

        //create the file instance
        java.io.File file = new java.io.File("DFA.txt");
        //it's scanner time
        Scanner input = new Scanner(file);
        //read it
        int dfaAmount = input.nextInt();
        //loop for amount of dfas
       for (int dfaAmountIndex = 0; dfaAmountIndex < dfaAmount;
                dfaAmountIndex++){
            int numberOfStates = input.nextInt();
            int startState;
            int numberOfSigmaSym;



            String sigma = "";
            sigma = input.next();


            numberOfSigmaSym = sigma.length();
            String transitionLine = input.nextLine();
            int[][] transition = new int[numberOfStates][numberOfSigmaSym];


            startState = input.nextInt();    
            //checker
            System.out.println(startState);
            for (int i=0; i < numberOfStates; i++){
            	int j = 0;
                numberOfStates = i;
                numberOfSigmaSym = j;
                for (j=0; j < sigma.length(); j++){
            int state1 = transition[i][j];
                }
        }

            String w;
            w = input.nextLine();
            for (int i=0; i < w.length(); i++){

                 char x;
               x = w.charAt(i);
               int state = startState;
                int index = sigma.indexOf(x);
                int state1 = transition [state][index];
            }
            int numberOfAcceptStates;
            numberOfAcceptStates = input.nextInt();
            int acceptState;
            acceptState = input.nextInt();






          }
       }

    }
