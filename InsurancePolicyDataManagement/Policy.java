package InsurancePolicyDataManagement;

public class Policy {
    private String ID;
    private String Name;
    private int amount;

    public Policy(String ID , String Name , int amount){
        this.ID = ID;
        this.Name = Name;
        this.amount = amount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "ID = " + ID + '\'' +
                "Name = " + Name + '\'' +
                "Amount = " + amount ;
    }
}
