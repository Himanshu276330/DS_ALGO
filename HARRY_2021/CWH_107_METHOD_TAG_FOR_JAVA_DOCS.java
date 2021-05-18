package HARRY_2021;

/**
 * This is good class
 */
public class CWH_107_METHOD_TAG_FOR_JAVA_DOCS {
    /**
     *hello bhi kaya hal
     * @param args These are argument supplies to the command line
     */
    public static void main(String[] args) {

        System.out.println("I am main method");
    }

    /**
     *Hello this is best method
     * @param a This is the first int to add
     * @param b This is the second int to add
     * @return sum of two number
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use + operation
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception("invalid input");
        }
        return a+b;
    }
}
