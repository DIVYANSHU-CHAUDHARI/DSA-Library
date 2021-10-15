class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class Stack {
   private Node mid = null;
   private Node head = null;
   private Node tail = null;
   private int size = 0;
   public void push(int data){
       Node n = new Node(data);
       if(size==0){
        head = n;
        tail = n;
        mid = n;
       }else{
           tail.next = n;
           n.prev = tail;
           tail = n;
       }
       size++;
       if(size%2==0){
            mid = mid.next;
       }
   }

   public int pop(){
       int popedElement = -1;
       if(size==0){
           return popedElement;
       }
       //Popping out of a stack with single node 
       popedElement = tail.data; 
       if(head==tail){
           head = null;
           tail = null;
           mid = null;
       }else{
           tail = tail.prev;
           tail.next = null;
       }
       size--;
       if(size%2==1 && size!=1){
        mid = mid.prev;
       }else if(size%2==1){
           mid = tail;
       }
       return popedElement;
    }
    public int getMid(){
        if(size==0)return -1;
       return mid.data;
    }
    public void deleteMid(){
      //No nodes
       if(size==0){
           System.out.println("Stack is Empty");
       }
       //One node
       if(size==1){
           head = null;
           tail = null;
           mid = null;
       }
       //Two nodes
       if(size==2){
           mid = mid.prev;;
           tail = mid;
           tail.next= null;
       }
       if(size>2){
           Node temp = mid.next;
           Node midTemp = mid;
           mid = mid.prev;
           mid.next = temp;
           temp.prev = mid;
           midTemp.next = null;
           midTemp.prev = null;
       }
       size--;
    }
    public void display(){
        if(size==0){
            System.out.println("Stack is Empty");
        }
        Node temp = head;
        for(int i =0;i<size;i++){
            if(i!=size-1){
                System.out.print(temp.data+"<=>");
            }else{
                System.out.print(temp.data);
            }
            
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        System.out.println(st.getMid());
        st.deleteMid();
        st.display();
        System.out.println(st.getMid());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();
        st.pop();
        st.display();
        System.out.println(st.getMid());
        st.push(1);
        st.push(2);
        st.display();
        }
}
