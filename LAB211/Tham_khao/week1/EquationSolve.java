import java.util.*;  
public class EquationSolve {

    public List<Double> ptb1(double a, double b){
        List<Double> list=new ArrayList<Double>();  
        if (a!=0) {
            list.add(-b/a);
            return list;
        } else{
            if (b!=0){
                return null;
            } else{
                return list;
            }
        }
    }

    public List<Double> ptb2(double a, double b, double c){
        List<Double> list=new ArrayList<Double>();  
        double delta;
        if (a==0) {
            return ptb1(b, c);
        }else {
            delta = b*b - 4*a*c;
            if (delta>0){
                list.add((-b-Math.sqrt(delta))/2/a);
                list.add((-b+Math.sqrt(delta))/2/a);
                return list;
            } else if (delta == 0){
                list.add(-b/2/a);
                return list;
            } else {
                return null;
            }
        }
    }

    boolean checkOdd(double a){
        if (a%2==0) return false;
        return true;
    }

    boolean checkSquare(double a){
        if ((int)Math.sqrt(a) == Math.sqrt(a)) return true;
        return false;
    }

    public void func1(){
        List<Double> list=new ArrayList<Double>();  
        double a=0,b=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("----- Calcutelate Equation -----");

        boolean noFalse = true;
        while(noFalse){
            try{
                System.out.print("Enter A: ");
                a = sc.nextDouble();
            } catch (Exception e){
                System.out.println("Please input number");
                sc.nextLine();
                noFalse = true;
                continue;
            }
            try{
                System.out.print("Enter B: ");
                b = sc.nextDouble();
            } catch (Exception e){
                System.out.println("Please input number");
                noFalse = true;
                sc.nextLine();
                continue;
            }
            noFalse = false;           
        }

        list = ptb1(a, b);
        System.out.print("Solution: ");
        if (list == null ){
            System.out.println("Vo nghiem!");

        } else if (list.isEmpty()) {
            System.out.println("Infinity");
        } else if (!list.isEmpty()){
            for (double i:list){
                System.out.println("x = " + i);
            }
        }
        System.out.print("Odd Number(s): ");
        if (checkOdd(a)){
           if (checkOdd(b)) System.out.println(a + ", " + b);
           else System.out.println(a);
        } else{
            if (checkOdd(b)) System.out.println(b);
        }

        System.out.print("Number is Even: ");
        if (!checkOdd(a)){
            if (!checkOdd(b)) System.out.println(a + ", " + b);
            else System.out.println(a);
         } else{
             if (!checkOdd(b)) System.out.println(b);
         }

         System.out.print("Number is Perfect Square: ");
         if (checkSquare(a)){
            if (checkSquare(b)) System.out.println(a + ", " + b);
            else System.out.println(a);
         } else{
             if (checkSquare(b)) System.out.println(a + ", " + b);
            else System.out.println(b);
         }      
    }

    public void func2(){
        List<Double> list=new ArrayList<Double>();  
        double a=0, b=0, c=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("----- Calcutelate Equation -----");

        boolean noFalse = true;
        while(noFalse){
            try{
                System.out.print("Enter A: ");
                a = sc.nextDouble();
            } catch (Exception e){
                System.out.println("Please input number");
                sc.nextLine();
                noFalse = true;
                continue;
            }
            try{
                System.out.print("Enter B: ");
                b = sc.nextDouble();
            } catch (Exception e){
                System.out.println("Please input number");
                noFalse = true;
                sc.nextLine();
                continue;
            }

            try{
                System.out.print("Enter C: ");
                c = sc.nextDouble();
            } catch (Exception e){
                System.out.println("Please input number");
                noFalse = true;
                sc.nextLine();
                continue;
            }
            noFalse = false;           
        }

        list = ptb2(a, b, c);
        int dem=1;
        System.out.print("Solution: ");
        if (list == null ){
            System.out.println("NULL!");

        } else if (list.isEmpty()) {
            System.out.println("Infinity");
        } else if (!list.isEmpty()){
            for (double i:list){
                System.out.println("x" + dem+" = " + i);
                ++dem;
            }
        }
        System.out.print("Odd Number(s): ");
        if (checkOdd(a)){
            if (checkOdd(b)){
                if (checkOdd(c)){
                    System.out.println(a + ", " + b + ", "+c );
                } else System.out.println(a + ", " + b);
            } else {
                if (checkOdd(c)){
                    System.out.println(a + ", " + c); 
                } else System.out.println(a);
            }
        } else{
            if (checkOdd(b)){
                if (checkOdd(c)){
                    System.out.println(b + ", "+c );
                } else System.out.println(b);
            } else {
                if (checkOdd(c)){
                    System.out.println(c);
                }
            }
        }

        System.out.print("Number is Even: ");
        if (!checkOdd(a)){
            if (!checkOdd(b)){
                if (!checkOdd(c)){
                    System.out.println(a + ", " + b + ", "+c );
                } else System.out.println(a + ", " + b);
            } else {
                if (!checkOdd(c)){
                    System.out.println(a + ", " + c); 
                } else System.out.println(a);
            }
        } else {
            if (!checkOdd(b)){
                if (!checkOdd(c)){
                    System.out.println(b + ", "+c );
                } else System.out.println(b);
            } else {
                if (!checkOdd(c)){
                    System.out.println(c);
                }
            }
        }

         System.out.print("Number is Perfect Square: ");
         if (checkSquare(a)){
            if (checkSquare(b)){
                if (checkSquare(c)){
                    System.out.println(a + ", " + b + ", "+c );
                } else System.out.println(a + ", " + b);
            } else {
                if (checkSquare(c)){
                    System.out.println(a + ", " + c); 
                } else System.out.println(a);
            }
        } else{
            if (checkSquare(b)){
                if (checkSquare(c)){
                    System.out.println(b + ", "+c );
                } else System.out.println(b);
            } else {
                if (checkSquare(c)){
                    System.out.println(c);
                }
            }
        }    
    }


    public void menu(){
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        Scanner sc  = new Scanner(System.in);
        String choice = sc.next();
        switch (choice){
            case "1" : 
                func1();
                break;
            case "2" :
                func2();
                break;
            case "3" :
                System.out.println("Have a nice day!");
                return;
        }
    }
    public static void main(String[] a){
        EquationSolve d = new EquationSolve();
        d.menu();
    }
}
