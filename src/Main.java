import java.util.Objects;
import java.util.Scanner;
class LimcaShop {
    String name;

    int cashrecieved;
    String Flavour;
    int howmanyBB;
    int howmanyrA;
    int howmanyL;
    int howmanyLA;
    int howmanyM;

    int capacity_ofblueberry = 50;
    int capacity_ofLychee = 50;
    int capacity_ofRedApple = 50;
    int capacity_ofMango = 50;
    int capacity_ofLemonade = 50;
    int rupees = 90;
    String shop_name = "1°C One Degree Centigrade The Liquid Shop";
    String location = " SB 7, Block 2 Gulshan-e-Iqbal, Karachi, Karachi City, Sindh";
}
class Manager {
    String name;
    private int NIC;
    public void SetNIC(int nic){
        NIC = nic;
    }
    int GetNIC(){
        return  NIC;
    }
}
class Employee extends Manager{

    private int Salary;
    public void SetSalary(int monthlyincome){
        Salary = monthlyincome;
    }
    int GetSalary(){
        return  Salary;
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("==================== 1°C One Degree Menu ==================");
        System.out.println("***********************************************************");
        System.out.println("*** FLAVOURS ********************* Price *** ");
        System.out.println("    BlueBerry                        90        ");
        System.out.println("    Lychee                           90        ");
        System.out.println("    Red Apple                        90        ");
        System.out.println("    Mango                            90        ");
        System.out.println("    LemonAde                         90        ");
        // OBject for Shop
        LimcaShop OneD = new LimcaShop();
        Scanner CustomerName = new Scanner(System.in);
        System.out.println("Enter Custumer Name");
        OneD.name = CustomerName.nextLine();
        int howmany;
        Scanner quantity = new Scanner(System.in);
        System.out.println("Enter quantity of soda ");
        howmany = quantity.nextInt();
        for (int i = 0 ; i < howmany ; i++){
            Scanner SelectFlavour = new Scanner(System.in);
            System.out.println("Enter Flavour");
            OneD.Flavour = SelectFlavour.nextLine();
            System.out.println("Flavour of Soda = " + OneD.Flavour);
            if (Objects.equals(OneD.Flavour, "BlueBerry")){
                Scanner kitneblueberry = new Scanner(System.in);
                System.out.println("How many BlueBerry ");
                OneD.howmanyBB = kitneblueberry.nextInt();
            }else if(Objects.equals(OneD.Flavour, "RedApple")){
                Scanner kitnerple = new Scanner(System.in);
                System.out.println("How many RedApple ");
                OneD.howmanyrA = kitnerple.nextInt();
            }else if(Objects.equals(OneD.Flavour, "Lychee")){
                Scanner kitnelcy = new Scanner(System.in);
                System.out.println("How many Lychee ");
                OneD.howmanyL = kitnelcy.nextInt();
            }else if(Objects.equals(OneD.Flavour, "LemonAde")){
                Scanner kitnelemoade = new Scanner(System.in);
                System.out.println("How many LemonAde ");
                OneD.howmanyLA = kitnelemoade.nextInt();
            }else if(Objects.equals(OneD.Flavour, "Mango")){
                Scanner kitnemangoo = new Scanner(System.in);
                System.out.println("How many Mango ");
                OneD.howmanyM = kitnemangoo.nextInt();
            }else {
                System.out.println("OK");
            }
        }
        Scanner CashRec = new Scanner(System.in);
        System.out.println("Enter Cash Received");
        OneD.cashrecieved = CashRec.nextInt();

        System.out.println("**************************************************");
        System.out.println("=================Custumer Reciept=================");
        System.out.println("**************************************************");
        System.out.println("Shop name = " + OneD.shop_name);
        System.out.println("Location = " + OneD.location);
        System.out.println("Customer Name is = " + OneD.name);
        System.out.println("Quantity of Soda " + howmany);
        System.out.println("Price of soda is = " + OneD.rupees);
        System.out.println("===================");
        System.out.println("Cash Received = " + OneD.cashrecieved);
        System.out.println("===================");
        int puriraqam = ( OneD.howmanyLA + OneD.howmanyM + OneD.howmanyBB + OneD.howmanyL + OneD.howmanyrA);
        System.out.println("Cash Given = " + (OneD.cashrecieved - (OneD.rupees * puriraqam)));
        // OBject for Employee1
        Employee Eone = new Employee();
        System.out.println("**************************************************");
        System.out.println("==============Soda Shop Information===============");
        System.out.println("**************************************************");
        Scanner nameofEmp = new Scanner(System.in);
        System.out.println("Enter name of Employee");
        Eone.name = nameofEmp.nextLine();
        System.out.println("Name of Employee is " + Eone.name);
        Scanner nic = new Scanner(System.in);
        System.out.println("Enter NIC of Employee");
        Eone.SetNIC(nic.nextInt());
        System.out.println("NIC of Employee is " + Eone.GetNIC());
        Scanner salarie = new Scanner(System.in);
        System.out.println("Enter Salary of Employee");
        Eone.SetSalary(salarie.nextInt());
        System.out.println("Salary of Employee is " + Eone.GetSalary());
        // 2nd Employee object
        Employee Etwo = new Employee();
        Scanner empname = new Scanner(System.in);
        System.out.println("Enter name of Employee");
        Etwo.name = empname.nextLine();
        System.out.println("Name of Second Employee is " + Etwo.name);
        Scanner idcard = new Scanner(System.in);
        System.out.println("Enter NIC of Employee");
        Etwo.SetNIC(idcard.nextInt());
        System.out.println("NIC of Second Employee is " + Etwo.GetNIC());
        Scanner kharcha = new Scanner(System.in);
        System.out.println("Enter Second Salary of Employee");
        Etwo.SetSalary(kharcha.nextInt());
        System.out.println("Salary of Employee is " + Etwo.GetSalary());
        System.out.println("***^^^******** MANAGER COPY *********^^^***");
        Manager M = new Manager();
        Scanner Mana = new Scanner(System.in);
        System.out.println("Enter name of Manager");
        Etwo.name = Mana.nextLine();
        Scanner shc = new Scanner(System.in);
        System.out.println("Enter NIC of Manager");
        Etwo.SetNIC(shc.nextInt());
        System.out.println("Name of Second Employee is " + M.name);
        System.out.println("NIC of Manager is " + M.GetNIC());
        System.out.println("******************************************************");
        System.out.println("*** FLAVOURS *******     Stock          Remaining *** ");
        System.out.println("******************************************************");
        System.out.println("    BlueBerry             50               "+ (OneD.capacity_ofblueberry - OneD.howmanyBB ));
        System.out.println("    Lychee                50               "+ (OneD.capacity_ofLychee - OneD.howmanyL));
        System.out.println("    Red Apple             50               "+ (OneD.capacity_ofRedApple - OneD.howmanyrA));
        System.out.println("    Mango                 50               "+ (OneD.capacity_ofMango - OneD.howmanyM));
        System.out.println("    LemonAde              50               "+ (OneD.capacity_ofLemonade - OneD.howmanyLA));
    }
}