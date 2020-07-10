package arraylist_linkedlist.baitap;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

    //phần tử đầu tiên của danh sách liên kết
    private Node head;
    //số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {
    }
    public void addFrist(E element){
        //khai báo một biến là temp trỏ đến giá trị của head
        Node temp = head;
        // biến head sẽ nhận 1 giá trị là node mới
        head = new Node(element);
        // head.next trỏ đến temp
        head.next = temp;
        numNodes ++;
    }

    public void addLast (E element){
        // khai báo biến temp trở đến head
        Node temp = head;
        // sẽ cho con trỏ đến phần tử cuối cùng của danh sách
        while (temp.next != null){
            temp= temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        // khai báo biến temp trỏ đến head
        Node temp =head;

        // khai báo một node là holder
        Node holder;

        // cho con trỏ chạy đến vị trí index-1
        for(int i=0; i<index-1 && temp.next!=null;i++){
            temp = temp.next;
        }
        // cho holder tham chiếu đến vị trí index
        holder = temp.next;

        //Node tại vị trí index-1 sẽ trỏ tới node mới
        temp.next = new Node(element);

        // node mới này sẽ trỏ đến holder
        temp.next.next = holder;
        // tăng số lượng trong danh sách lên 1
        numNodes++;
    }

    public  Object get(int index){
        // khai báo biến temp trỏ tới head
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public int size(){
        return numNodes;
    }

    //XÓA MỘT PHẦN TỬ TẠI VỊ TRÍ INDEX
    public E remove (int index){
        if(index<0 || index>numNodes){
            throw new IllegalArgumentException("Error index: "+index);
        }
        // khai báo biến temp trỏ đến head 29:07
        Node temp = head;
        Object data;

        // Nếu index= 0 thì sẽ trả về data hiện tại
        if(index == 0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for(int i=0; i<index-1 && temp.next!=null;i++){
                temp= temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    //PHƯƠNG THỨC XÓA MỘT PHẦN TỬ element TRUYỀN VÀO
    public boolean remove(E element){
        //Remove đối tượng nếu element head
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            //khai báo temp trỏ đến head
            Node temp = head;
            while (temp.next!=null){
                // nếu như tồn tại 1 phần tử có data bằng data truyền vào thì node đó bị remove
                if(temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;

            }
        }
        return false;
    }

    //PHƯƠNG THỨC ĐỂ SAO CHÉP MỘT NODE
    public MyLinkedList<E> clone (){
        // kiểm tra xem linkedlist có phần tử hay không
        if(numNodes==0){
            throw new NullPointerException("Linkedlist này null");
        }
        //Khai báo linkedlist trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();

        //khai báo một temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFrist((E) temp.data);
        temp = temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    //    kIỂM TRA SỰ TỒN TẠI CỦA MỘT PHẦN TỬ
    public boolean contains(E element){
        Node temp = head;
        while (temp.next!=null){
            if(temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    //  PHƯƠNG THỨC TRẢ VỀ INDEX CỦA MỘT PHẦN TỬ
    public int indexOf(E element){
        Node temp = head;
        for (int i=0;i<numNodes;i++){
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Object getFirst(){
        if(numNodes == 0 ) {
            return null;
        } else {
            return head.data;
        }
    }
    public Object getLast() {
        Node temp = head;
        if (numNodes == 0) {
            return null;
        } else {
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public void clear(){
        Node temp  = head;
        head = null;
        for (int i = 0 ; i < numNodes; i ++){
            temp.next = null;
        }
        numNodes = 0;
    }

}
