import java.util.*;
public class Player{
    private int pno;
    private String pname; 
    private String skill;
    // private int cno;
    // private String cname;
    // private String cskill;

    public Player(){
        this(0,null,null);
    }

    public Player(int pno, String pname, String skill){
        this.pno=pno;
        this.pname=pname;
        this.skill=skill;
    }

    //setter Methods

    public void setPno(int pno){
        this.pno=pno;
    }

    public void setPname(String pno){
        this.pname=pname;
    }
    
    public void setSkill(String skill){
        this.skill=skill;
    }
    //getter methods
    public int getPno(){
        return this.pno;
    }
    public String getPname(){
        return this.pname;
    }
    public String getSkill(){
        return this.skill;
    }

    //ToSTRING
    public String toString(){
        return "Player [pno=" + pno + ", pname=" + pname + ", skill=" + skill + "]";
    }
}

