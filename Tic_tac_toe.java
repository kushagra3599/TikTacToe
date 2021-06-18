import java.util.*;
public class Tic_tac_toe {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
String a[][]={{"{0,0}","{0,1}","{0,2}"},
              {"{1,0}","{1,1}","{1,2}"},
              {"{2,0}","{2,1}","{2,2}"},};
String p1;
String p2;
System.out.println("player 1 takes");
p1 = sc.next();
System.out.println("player 2 takes");
p2 = sc.next();
if(p1==p2)
System.out.println("both can't be same");
else
{
int r,c,flag=0;
for(int i=1;i<=5;i++)
{
    for(int j=0;j<3;j++)
    {
        for(int k=0;k<3;k++)
            { if(a[j][k]==p1)
                System.out.print(p1);
               else if(a[j][k]==p2)
                System.out.print(p2);
               else 
                System.out.print("-");
             }
    System.out.println();
    }
    System.out.println("enter row p1");
    r=sc.nextInt();
    System.out.println("enter coloum p2 ");
    c=sc.nextInt();
    a[r][c]=p1;
    for(int j=0;j<3;j++)
    {
        for(int k=0;k<3;k++)
            { if(a[j][k]==p1)
                System.out.print(p1);
               else if(a[j][k]==p2)
                System.out.print(p2);
               else 
                System.out.print("-");
             }
        System.out.println();
    }
    
    System.out.println("\f");
    if(a[0][0]==a[0][1]&&a[0][1]==a[0][2])
    {
        System.out.println("PLAYER 1 WINS");
        flag=1;
        break;
    }
    if(a[0][0]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 1 WINS");
        flag=1;
        break;
    }
    if(a[0][0]==a[1][0]&&a[1][0]==a[2][0])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[0][1]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[0][2]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[1][0]==a[1][1]&&a[1][1]==a[1][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[2][0]==a[2][1]&&a[2][1]==a[2][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[0][2]==a[1][2]&&a[1][2]==a[2][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    if(a[2][0]==a[1][1]&&a[1][1]==a[0][2])
    {
        System.out.println("PLAYER 1 WINS");flag=1;
        break;
    }
    for(int j=0;j<3;j++)
    {
        for(int k=0;k<3;k++)
            { if(a[j][k]==p1)
                System.out.print(p1);
               else if(a[j][k]==p2)
                System.out.print(p2);
               else 
                System.out.print("-");
             }
        System.out.println();
    }
    System.out.println("enter row p2");
    r=sc.nextInt();
    System.out.println("enter coloum p2 ");
    c=sc.nextInt();
    a[r][c]=p2;
    for(int j=0;j<3;j++)
    {
        for(int k=0;k<3;k++)
            { if(a[j][k]==p1)
                System.out.print(p1);
               else if(a[j][k]==p2)
                System.out.print(p2);
               else 
                System.out.print("-");
             }
        System.out.println();
    }
    
    System.out.println("\f");
    if(a[0][0]==a[0][1]&&a[0][1]==a[0][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[0][0]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[0][0]==a[1][0]&&a[1][0]==a[2][0])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[0][1]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[0][2]==a[1][1]&&a[1][1]==a[2][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[1][0]==a[1][1]&&a[1][1]==a[1][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[2][0]==a[2][1]&&a[2][1]==a[2][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[0][2]==a[1][2]&&a[1][2]==a[2][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    if(a[2][0]==a[1][1]&&a[1][1]==a[0][2])
    {
        System.out.println("PLAYER 2 WINS");flag=1;
        break;
    }
    }
       if(flag==0)
       System.out.println("abe khichdi pak gai");
    System.out.println("THANKS FOR PLAYING");
}



    
    }


}