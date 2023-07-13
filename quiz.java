class Main{
    public static void main(String[] args) {
        Student folder= new Student(4, folder, 65, 2.75);
        folder.ShowDetails();
        folder.Setting(9, ider, 65, 3.00);
        folder.ShowDetails();
    }
}

class Student{

    private int ID;
    private String Name;
    private int AddmissionYear;
    private double GPA;

    Student(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public void ShowDetails(){
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.AddmissionYear);
        System.out.println("GPA : " + this.GPA);
    }

    public void Setting(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA; 
    }
}