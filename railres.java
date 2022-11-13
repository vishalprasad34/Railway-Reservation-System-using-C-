import java.io.*;

class railres{
    
  static int n=100;
  int num;
  static int age;
  static String name;
  static String gender;

  void Book()throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter no. of tickets to book: ");
    num=Integer.parseInt(br.readLine());
    for(int i=0; i<num; i++)
    {
      getDetails(i);
    }
    System.out.println("No. of Tickets booked: " + num);
    n=n-num;
    System.out.println("No. of Tickets available: " + n);
  }

  void getDetails(int i)throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    railres passenger = new railres(String name, String gender, int age);
    railres[] passenger = new railres[100];
    System.out.println("Enter the deatails of passenger " + i + ": ");
    System.out.println("Passenger Name: ");
    name=br.readLine();
    System.out.println("Passenger Gender: ");
    gender=br.readLine();
    System.out.println("Passenger Age: ");
    age=Integer.parseInt(br.readLine());
    passenger[i] = new Passenger(name, gender, age);
    System.out.println("Passenger Name: " + name);
    System.out.println("Passenger Gender: " + gender);
    System.out.println("Passenger Age: " + age);
  }

  void putDetails()
  {
    System.out.println("Passenger Name: " + name);
    System.out.println("Passenger Gender: " + gender);
    System.out.println("Passenger Age: " + age);
  }

  void Show()
  {
    System.out.println("No. of Tickets available: " + n);
  }

  public static void main(String a[])throws IOException
  {
    while(true)
    {
      System.out.println("\n ---- WELCOME TO RAILWAY TICKET RESERVATION ---- ");
      System.out.println("Choose any one choice: ");
      System.out.println("1.Book your ticket");
      System.out.println("2.Show number of tickets available");
      System.out.println("3.Exit");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your choice: ");
      int ch=Integer.parseInt(br.readLine());
      railres ob = new railres();
      switch(ch){
        case 1:
          ob.Book();
	  break;
	case 2:
          ob.Show();
	  break;
        case 3:
          return;
	default:
	  System.out.println("Wrong Choice!");
	  break;
      }
    }
  }
}