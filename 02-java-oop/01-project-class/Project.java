public class Project{
    public String[] name;
    public String[] description;

    public class elevatorPitch{
        return name + ":" + description;
    }

    public Project(){}

    public Project(String name){}

    public Project(String[] name, String[] description){
        this.name = name;
        this.description = description;
    }

    public String[] getName(){
        return name;
    }

    public String[] getDescription(){
        return description;
    }

    public void setName(String[] name){
        this.name = name;
    }

    public void setDescription(String[] description){
        this.description = description;
    }
}