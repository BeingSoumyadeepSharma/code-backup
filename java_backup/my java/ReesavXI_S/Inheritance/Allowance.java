package Inheritance;
import java.util.*;
class Allowance extends Employee1
{
    int DA,HRA,TOTAL;
    void cal()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        DA=(BASIC*10)/100;
        HRA=5000;
        TOTAL=BASIC+DA+HRA;
    }
    void display()
    {
        super.show();
        System.out.println("Your DA "+DA);
        System.out.println("Your HRA "+HRA);
        System.out.println("Your TOTAL "+TOTAL);
    }
}
        