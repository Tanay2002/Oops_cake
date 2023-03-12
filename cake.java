import java.util.*;
public class cake
    {
        String name;
        float price;
        public String getName()
        {	return name;	}
        public float getPrice()
        {	return price;	}

        public void setName(String newName)
        {	this.name = newName;	}
        public void setPrice(float newPrice)
        {	this.price = newPrice;	}
        void display()
        {
            System.out.println(name +" : " +'\u20B9'+ " " +price+ " per pound");
        }
    }

    class pastry extends cake
    {

        void display()
        {
            System.out.println(name +" : " +'\u20B9'+ " " +price+ " per piece");
        }
    }

    class bakery // Bakery Class
    {
        public static void main(String[] args)
        {

            cake cake1 = new cake();
            cake cake2 = new cake();
            pastry pastry1 = new pastry();
            pastry pastry2 = new pastry();

            cake1.setName("Chocolate Brownie");
            cake1.setPrice(250f);
            cake2.setName("Chocolate Maple");
            cake2.setPrice(300f);
            pastry1.setName("Black Forest");
            pastry1.setPrice(35f);
            pastry2.setName("Choco Truffle");
            pastry2.setPrice(40f);


            List<cake> cakesList = new ArrayList<cake>();
            cakesList.add(cake1);
            cakesList.add(cake2);
            List<pastry> pastriesList = new ArrayList<pastry>();
            pastriesList.add(pastry1);
            pastriesList.add(pastry2);

            System.out.println("        Today's Special Menu        ");
            System.out.println("------------------------------------");
            System.out.println();
            System.out.println("Special Cakes                       ");
            System.out.println("------------------------------------");
            for (cake object : cakesList)
            {
                object.display();
            }

            System.out.println();
            System.out.println("Special Pastries                    ");
            System.out.println("------------------------------------");


            for (pastry object : pastriesList)
            {
                object.display();
            }
        }
    }
