package Binary_Search;

public class Next_Alphabetical_element {
    public static void main(String[] args) {

        char[] ch={'a','c','f','h'};
        char key='f';

        System.out.println(nextAlphabet(ch,key));
        System.out.println(nextAlphabet(ch,'b'));
        System.out.println(nextAlphabet(ch,'e'));
        System.out.println(nextAlphabet(ch,'d'));
        System.out.println(nextAlphabet(ch,'h'));
        System.out.println(nextAlphabet(ch,'v'));

    }//Main Ends.........................................

    static char nextAlphabet(char[] ch,char key){
        int low=0,high=ch.length-1;
        char ans='-';
        int mid;

        while (low<=high){
            mid=low+(high-low)/2;
            if(ch[mid]<=key){
                low=mid+1;
            }else {
                ans=ch[mid];
                high=mid-1;
            }
        }
        return ans;
    }
}
