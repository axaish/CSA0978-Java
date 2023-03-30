import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
class A23
{    
public static void main(String[] args)
{    
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
System.out.println(dtf.format(now));  
}    
}