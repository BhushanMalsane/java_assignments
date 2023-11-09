import java.util.*;
public class Team{
    private String tname;
    private int tno;
    Player captain;
    Player[] plist;

    public Team(){
        this(null,0,null,null);
    }

    public Team(String tname, int tno, Player c, Player[] parr){
        this.tno=tno;
        this.tname=tname;
        this.captain=c;
        this.plist=parr;
    }

    //setter Methods

    public void setTno(int tno){
        this.tno=tno;
    }

    public void setTname(String Tname){
        this.tname=tname;
    }
    
    public void setPlayer(Player[] parr){
        this.plist=parr;
    }

    public void setCaptain(Player c){
        this.captain=c;
    }

    //getter methods
    public int getTno(){
        return this.tno;
    }
    public String getTname(){
        return this.tname;
    }
    public Player getCaptain(){
        return this.captain;
    }
   
    public Player[] getPlayer(){
        return plist;
    }

    //ToSTRING
    public String toString(){
        return "Team [tno=" + tno + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)+ "]";   
    }
}

