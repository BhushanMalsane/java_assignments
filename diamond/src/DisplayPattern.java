class DisplayPattern{
    public static void diamond(int num){
        int spcnt = (int) (num/2);
        for(int r=1; r<=num; r+=2){
            String s = "";
            //<============UPPER DIAMOND==============>//
            // FOR SPACES
            for(int sp=1; sp<=spcnt; sp++){
                s = s + "-";
            }
            // FOR STARS 
            for(int st=1; st<=r; st++){
                s = s + "*";
            }
            System.out.print(s);
            spcnt = spcnt -1;
            System.out.println();
        }        
        spcnt= 1;
        for(int r=num-2; r>=1; r-=2){
            String s = "";
            for(int sp=1; sp<=spcnt; sp++){
                s = s+ "-";
            }
            for(int st=1;st<=r;st++){
                s = s+"*";
            }
            System.out.print(s);
            spcnt= spcnt + 1;
            System.out.println();
        }
     }
}