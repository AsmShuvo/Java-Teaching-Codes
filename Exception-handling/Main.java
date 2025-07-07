public class Main {
    public static void main(String[] args) {
        int x = 10, y = 3;
        int a;
        String name = "Hello";
        int[] arr = new int[3];
        String num = "mahdi";
        try {
            // arithmatic exception
            a = x / (y-2); 
            System.out.println("a=" + a); // won;t execute
            // StringIndexOutOfBoundsException
            char ch = name.charAt(1); //ex
            System.out.println("ch =" + ch);
            
            // ArrayIndexOutOfBoundsException
            arr[1] = 50;
            // NumberFormatException
            int value = Integer.parseInt(num);
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic-Exception is: " + e);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String-Exception is: " + e);
            // handle
            char ch = name.charAt(0);
            System.out.println("After handling string-err: "+ch);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e);
            // hanlde
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e);
        }
        catch(Exception e){
             System.out.println("Something went wrong: " + e);
        }
        finally{
            System.out.println("Thank you");
        }
    }
}


