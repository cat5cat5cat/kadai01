import java.util.Scanner;

public class example {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.print("一人目 名前(アルファベットで):");
            String s=sc.nextLine();
            int si=0;
            System.out.print("二人目 名前(アルファベットで):");
            String sn=sc.nextLine();
            int sni=0;

            for(int i=0;i<s.length();i++){
                si+=swit(s.substring(i,i+1));
            }

            for(int i=0;i<sn.length();i++){
                sni+=swit(sn.substring(i,i+1));
            }

            String t=""+si;
            int ts=0;
            String tn=""+sni;
            int tns=0;
            while(true){
                for(int i=0;i<t.length();i++){
                    ts+=Integer.parseInt(t.substring(i,i+1));
                }

                for(int i=0;i<tn.length();i++){
                    tns+=Integer.parseInt(tn.substring(i,i+1));
                }

                if(ts>=10){
                    t=ts+"";
                    ts=0;
                    continue;
                }

                if(tns>=10){
                    tn=tns+"";
                    tns=0;
                    continue;
                }
                break;
            }


            int fl=0;
            int fln=0;

            if(ts==1 || ts==5 || ts==7)fl=1;
            if(ts==2 || ts==4 || ts==8)fl=2;
            if(ts==3 || ts==6 || ts==9)fl=3;

            if(tns==1 || tns==5 || tns==7)fln=1;
            if(tns==2 || tns==4 || tns==8)fln=2;
            if(tns==3 || tns==6 || tns==9)fln=3;

            if(fl==fln)System.out.println("二人の相性は最適になりえます");
            else System.out.println("二人の相性は最適ではありません");

        }

        static int swit(String a){
            int coun=0;
            switch(a.toLowerCase()){

                case "a":
                case "i":
                case "q":
                case "j":
                case "y":
                    coun=1;
                    break;

                case "b":
                case "k":
                case "r":
                    coun=2;
                    break;

                case "c":
                case "g":
                case "l":
                case "s":
                    coun=3;
                    break;

                case "d":
                case "m":
                case "t":
                    coun=4;
                    break;

                case "e":
                case "h":
                case "n":
                    coun=5;
                    break;

                case "u":
                case "v":
                case "w":
                case "x":
                    coun=6;
                    break;

                case "o":
                case "z":
                    coun=7;
                    break;

                case "f":
                case "p":
                    coun=8;
                    break;
            }
            return coun;
        }

    }



