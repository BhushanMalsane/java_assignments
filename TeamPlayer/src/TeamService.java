import java.util.*;
public class TeamService{
    static Team[] trr;
    static int cnt;
    static {
        cnt = 0;
        trr = new Team[3];
    }
    public static void addnewTeam(){
        Scanner sc = new Scanner(System.in);
        //accept team details
        System.out.println("Enter Team ID: ");
        int tno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Team name: ");
        String tname = sc.nextLine();
        
        //accept caption details
        System.out.println("Enter Captian number: ");
        int pno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Captain name: ");
        String pname = sc.nextLine();
        System.out.println("Enter Caption Skill: ");
        String skill = sc.nextLine();
    
        //CAPTAIN OBJECT DECLARATION
        Player c = new Player(pno, pname, skill);
        
        // accept player list
        System.out.println("Enter the number of player you want to enter details for:");
        int pnum= sc.nextInt();
        Player[] plist = new Player[pnum];
         sc.nextLine();
        for(int i=0;i<pnum;i++){
            System.out.println("Enter player name : ");
            pname=sc.nextLine();

            System.out.println("Enter player number : ");
            pno=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter PLayer Skill : ");
            skill =sc.nextLine();

            plist[i] = new Player(pno,pname,skill);
        }
        
        trr[cnt]= new Team (tname, tno, c, plist);
        cnt++; 
    }

    public static void displayAllTeams(){
        for(int i=0; i<=cnt; i++){
            System.out.println(trr[i]);
        }
    }

    public static void displayByCaptain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the captain name for getting it's team: ");
        String cname= sc.nextLine();
        String c="";
        boolean flag=false;
        int index=0;
        for(int j=0; j<=cnt; j++){
            Player a =trr[j].getCaptain();
            if(a.getPname().equals(cname)){
                flag = true;
            }
            // flag = true;
             index=j;
        } 
         if(!flag){
             System.out.println("Caption doesn't exists!");
        }else {
            System.out.println(trr[index]);
          }
     }

}