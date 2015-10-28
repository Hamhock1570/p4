package Project4;

import java.util.Scanner;

/**
 * Created by michael on 10/27/15.
 */
public class Menu1 {

    private Scanner input;
    private int choice;

    public Menu1()
    {
        // default constructor
    }

    public void printMenu1()
    {
        System.out.println();
    }


    public int getChoice() {
        return this.choice;
    }

    public Scanner getInput() {
        return input;
    }

    public Scanner takeInput()
    {
        Scanner in = new Scanner(System.in);
        return in;
    }

    public void setChoice()
    {
       this.choice =  this.getInput().nextInt();
    }
}
