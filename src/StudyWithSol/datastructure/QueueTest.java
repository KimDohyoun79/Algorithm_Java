package StudyWithSol.datastructure;


// 큐 노드
class QueueNode {
    int value;
    QueueNode queueNode;

    public QueueNode(int value){
        this.value = value;
        this.queueNode = null;
    }

    public int getValue(){
        return this.value;
    }

    public QueueNode getNextNode(){
        return this.queueNode;
    }

    public void setNextNode(QueueNode queueNode){
        this.queueNode = queueNode;
    }
}

// 큐 기능 클레스
class Queue {
    QueueNode front, rear;

    public Queue() {
        front = rear = null;
    }

    public boolean queueIsEmpty(){
        return front == null && rear == null ? true : false;
    }

    public void push(int value){
        QueueNode queueNode = new QueueNode(value);
        if(queueIsEmpty())
            front = rear = queueNode;
        else{
            rear.setNextNode(queueNode);
            rear = queueNode;
        }
    }

    public QueueNode pop(){
        if(queueIsEmpty())
            return null;
        else{
            QueueNode popNode = front;
            front = front.getNextNode();
            return popNode;
        }
    }

    public QueueNode peek(){
        if(queueIsEmpty())
            return null;
        else
            return front;
    }

    public int size(){
        QueueNode current = front;
        int count = 0;
        while(current != null){
            count++;
            current = current.getNextNode();
        }
        return count;
    }
}



public class QueueTest {

    public static void main(String[] args) {
        Queue queueManager = new Queue();
        // 큐에 데이터 추가
        queueManager.push(10);
        queueManager.push(20);
        queueManager.push(30);

        // 큐의 상태 출력
        System.out.println("Queue size: " + queueManager.size());
        System.out.println("Front value: " + queueManager.peek().getValue());

        // 큐에서 데이터 제거
        QueueNode poppedNode = queueManager.pop();
        System.out.println("Popped value: " + poppedNode.getValue());

        // 큐의 상태 출력
        System.out.println("Queue size: " + queueManager.size());
        System.out.println("Front value: " + queueManager.peek().getValue());
    }
}


