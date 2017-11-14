import java.util.HashMap;

public class LinkedListExample {

    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.insertAtStart(2);
        linkedList.insertAtEnd(4);
        linkedList.insertAtPosition(1,5);

        linkedList.deleteEnd();
        linkedList.display();

        /*linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(6);
        linkedList.insertAtStart(2);
        linkedList.insertAtPosition(4,30);
        linkedList.display();
        System.out.println("****************");
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.display();
*/
    }

    static class LinkedList{

        class Node{
            int value;
            Node node;
            Node(int value){
                this.value = value;
                this.node = null;
            }
        }
        Node startNode;
        Node endNode;
        Node createNode(int value){
            return new Node(value);
        }

        public void insertAtEnd(int val){
            if(startNode == null){
                startNode = createNode(val);
                endNode = startNode;
            } else {
                Node newNode = createNode(val);
                endNode.node = newNode;
                endNode = newNode;
            }
        }

        public void insertAtStart(int value){

            if(startNode == null){
                Node newNode = createNode(value);
                newNode.node = startNode;
                startNode = newNode;
                endNode = startNode;
            } else {
                Node newNode = createNode(value);
                newNode.node = startNode;

                startNode = newNode;
            }

        }

        public void deleteFirst(){
            Node currentNode = startNode;
            if(currentNode != null){
                if(currentNode.node == null){
                    startNode = null;
                    endNode = null;
                } else {
                    startNode = startNode.node;
                }
            }
        }

        public void deleteEnd(){

            Node currentNode = startNode;

            if(currentNode != null){

                if(currentNode.node == null){
                    startNode = null;
                    endNode = null;
                } else {
                    Node preousNode = currentNode;
                    while (currentNode.node != null){
                        currentNode = currentNode.node;
                        if(currentNode.node == null){
                            preousNode.node = null;
                            endNode = preousNode;
                        }
                        preousNode = currentNode;
                    }

                }

            }
        }

        public void insertAtPosition(int position, int value) {
            /*Node currentNode = startNode;
            if (position == 1) {
                Node newNode = createNode(value);
                newNode.node = startNode;
                startNode = newNode;
            } else {
                Node previousNode = null;
                for (int i = 0; i <= position - 1; i++) {
                    if (i == position - 1) {
                        Node newNode = createNode(value);
                        //currentNode = previousNode.node;
                        newNode.node = currentNode;
                        previousNode.node = newNode;
                    } else {
                    }
                }
            }
*/
            Node currentNode = startNode;
            int j = 1;
            Node previousNode = null;
            boolean isFinished = false;
            while (!isFinished){
                if(position == 1){
                    Node newNode = createNode(value);
                    newNode.node = startNode;
                    startNode = newNode;
                    isFinished = true;
                    break;
                } else {
                    if(position == j){
                        Node newNode = createNode(value);
                        newNode.node = currentNode;
                        previousNode.node = newNode;
                        isFinished = true;
                        break;
                    } else {
                        previousNode = currentNode;
                        currentNode = currentNode.node;
                        if(previousNode.node == null){
                            System.out.println("Invalide length");
                            isFinished =true;
                        }
                    }
                }
                j = j+1;
            }
        }

        public void display(){
            LinkedList.Node node = startNode;
            while (node != null){
                System.out.println(node.value);
                node = node.node;
            }
        }
    }
}
