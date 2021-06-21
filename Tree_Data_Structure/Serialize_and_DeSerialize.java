package Tree_Data_Structure;

import java.util.ArrayList;

public class Serialize_and_DeSerialize {

    ArrayList<Integer> arr=new ArrayList<>();
    void serialize(Node root){
        if(root==null) {
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialize(root.left);
        serialize(root.right);
    }

    int i=0;
    Node deSerialize(ArrayList<Integer> arr){
        if(arr.get(i)==-1){
            i++;
            return null;
        }
        Node head=new Node(arr.get(i++));
        head.left=deSerialize(arr);
        head.right=deSerialize(arr);
        return head;
    }
}
