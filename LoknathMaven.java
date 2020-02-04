import java.io.*;

class Sweet implements Comparable
{
int weight=1;
String name="";
String color="Blue";
float calories=125;
@Override
public int compareTo(Object o)
{
return 0;
}
}

class chocolate extends Sweet{}

class FiveStar extends chocolate
{
FiveStar ()
{
this.name="<.....Five Star chocolate.....>";
}
}

class DairyMilk extends chocolate
{
DairyMilk()
{
this.name="<.....Dairy Milk Choclate.....>";
}
}




class AllData
{
public static void main(String[] args) 
{
Sweet[]  al = new Sweet[4];
al [0]= new FiveStar();
al [1]= new FiveStar();
al [2]= new DairyMilk();
al [3]= new DairyMilk();
float total_weight =0;

for (int i = 0; i < al.length; i++)
{
Sweet s = al[i];
total_weight += s.weight;
}
System.out.println(".......Total_Weight = "+total_weight);
for (int i = 0; i < al.length; i++)
{
Sweet s = al[i];
System.out.println(s.name);
}
System.out.println("......The task is Completed......");
}
}