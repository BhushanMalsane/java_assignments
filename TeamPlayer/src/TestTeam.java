import java.util.*;

public class TestTeam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("1. Add new Team \n 2. Display all teams \n 3. Search team by Captain Name \n 4. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    TeamService.addnewTeam();
                break;
                case 2: 
                    TeamService.displayAllTeams();
                break;

                 case 3:
                     TeamService.displayByCaptain();
                 break;
                
                case 4: 
                    System.out.println("OKK BYEEEE!");
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Wrong Choice!");
            }

        }while (true);
        
    }
}