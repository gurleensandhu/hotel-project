   import java.util.Scanner ;
    public class NewClass 
    { 
  static   Guest[] guestname = new Guest[5];   
  static Rooms[] roomno = new Rooms[5];
  static Booking[] bookings = new Booking[5];
   static int i=0;
   static int m=0;
   static int p=0;
   
    public static void main ( String [] args)
    {
         Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter command (quit to exit):");
            String input = keyboard.nextLine();
            if(input != null) {
                System.out.println("Your input is : " + input);
                if ("q".equals(input)) {
                    System.out.println("Exit programm");
                    exit = true;
                } else if ("a".equals(input)) {
                    addGuest();
                    //Do something
                }else if ("b".equals(input))  
                {
                    viewguest();
                }else if("c".equals(input))
                {
                    addroomNo();
                }else if ("d".equals(input))
                {
                    viewroomNo();
                }else if ( "addbooking".equals(input)){
                
                addbooking();
                
                }
            }
        }
        keyboard.close();
       
    }
    public static void addGuest()
    { if(i>4)
    {System.out.println( "sorry! guestlist is full");
      return;  
    }
    
    Guest g1=new Guest();
    System.out.println("enter name:");
      Scanner sc = new Scanner(System.in);
      g1.name = sc.nextLine();
      System.out.println("enter gender:");
      Scanner sc1 = new Scanner (System.in);
      g1.gender =sc1.nextLine();
      System.out.println(" enter address:");
      Scanner sc2= new Scanner (System.in);
      g1.address=sc2.nextLine();
      System.out.println("enter contactNumber:");
      Scanner sc3= new Scanner(System.in);
      g1.contactNumber=sc3.nextLong();
      guestname[i]=g1;
      i++;
    }
      public static void viewguest()
      {int n=0;
      while (n<i)
      { System.out.println(guestname[n].name + ","+ guestname[n].gender+","+ guestname[n].address+"'"+ guestname[n].contactNumber);
      n++;
      }}

      public static void addroomNo()
      { if (m>4)
      {System.out.println("list is full");
      return;
      }
      Rooms  r1=new Rooms();
      System.out.println(" enter roomNO:");
      Scanner sc=new Scanner (System.in);
      r1.roomNo=sc.nextInt();
      System.out.println("enter numberOfGuest:");
      Scanner sc1=new Scanner(System.in);
      r1.numberOfGuest=sc1.nextInt();
      System.out.println("enter category:");
      Scanner sc2=new Scanner(System.in);
      r1.category=sc2.nextLine();
      System.out.println("enter price");
      Scanner sc3=new Scanner (System.in);
      r1.price=sc3.nextInt();
      roomno[m]=r1;
      m++;
     }
      public static void viewroomNo()
      { int g=0;
      while (g<m)
      {
       System.out. println(roomno[g].roomNo + ","+ roomno[g].numberOfGuest+","+ roomno[g].category +"'"+ roomno[g].price);
      g++;
      }
      }
      public static void addbooking()
    { if(i>4)
    {System.out.println( "sorry! booking are  full");
      return;  
    }
    
    Booking b1=new Booking();
    System.out.println("enter name:");
      Scanner sc = new Scanner(System.in);
      String name= sc.nextLine(); 
      boolean namefound=false;
     int r=0;
     while(r<i){
     if( guestname[r].name == name)
     {
         namefound= true;
     }
     r++;
     }if( namefound){
     b1.name=name;
     }else {
          System.out.println("no guest with this name found");
          return;
     }
      System.out.println("enter roomNo:");
      Scanner sc1 = new Scanner (System.in);
      b1.roomNo =sc1.nextInt();
      System.out.println(" enter discount:");
      Scanner sc2= new Scanner (System.in);
      b1.discount=sc2.nextDouble();
      System.out.println("enter checkin:");
      Scanner sc3= new Scanner(System.in);
      b1.checkin=sc3.nextLine();
      System.out.println("enter checkout:");
      Scanner sc4= new Scanner(System.in);
      b1.checkout=sc4.nextLine();
      bookings[p]=b1;
      p++;
    }
      
      
      }
   
    
            
    

