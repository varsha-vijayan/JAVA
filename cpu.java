class cpu
{
double price;
String name;
cpu(double p,String name1)
{
price=p;
name=name1;
}
class processor
{
int numberofcores;
String manufactures;
processor(int cores,String man)
{
numberofcores=cores;
manufactures=man;
}
}
static class ram
{
String memory;
String manufactures;
ram(String mem,String man)
{
memory=mem;
manufactures=man;
}
}
public static void main(String []args)
{cpu c=new cpu(1800,"intel i7");
cpu.processor p=c.new processor(8,"intel");
cpu.ram r=new cpu.ram("18gb","intel");
System.out.println("processor name="+c.name+"\nprice"+c.price);
System.out.println("processor cores="+p.numberofcores +"\nprocessor manufactures name="+p.manufactures);
System.out.println("memory capacity=" +r.memory+ "\n ram manufactures="+r.manufactures);
}}

