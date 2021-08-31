package p;

public class customer
{
    private int age = -1;
    private String name = "";
    private String status = "";
    
    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //not adding setStatus because that has to be decided here
    
    public String getStatus()
    {
        return this.validateTicket(status);
    }

    public String validateTicket(String status)
    {
        
        if(age>18)
        {
            return "Ticket can be purchased. Proceed.";
        }

        else
        {
            return "People under the age of 18 aren't allowed.";
        }
        
    }
}