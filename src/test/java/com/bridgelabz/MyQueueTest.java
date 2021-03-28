package com.bridgelabz;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    public class MyQueueTest {
        MyQueue myQueue = new MyQueue();
        private Assertions Assert;
        //    private Assertions Assert;

        @Test
        public void givenThreeNoWhenAddedToQueueShouldReturnTrue() {
            MyNode<Integer> myFirstNode=new MyNode<>(56);
            MyNode<Integer> mySecondNode=new MyNode<>(30);
            MyNode<Integer> myThirdNode=new MyNode<>(70);
            myQueue.queue(myFirstNode);
            myQueue.printQueue();
            myQueue.queue(mySecondNode);
            myQueue.printQueue();
            myQueue.queue(myThirdNode);
            myQueue.printQueue();
            INode peak=myQueue.peak();
            //Assertions Assert;
            Assert.assertEquals(peak, myThirdNode);
        }

        @Test
        public void givenThreeNoWhenDeletePeakValueOfQueueShouldReturnTrue() {
            MyNode<Integer> myFirstNode=new MyNode<>(70);
            MyNode<Integer> mySecondNode=new MyNode<>(30);
            MyNode<Integer> myThirdNode=new MyNode<>(56);
            myQueue.queue(myThirdNode);
            myQueue.printQueue();
            myQueue.queue(mySecondNode);
            myQueue.printQueue();
            myQueue.queue(myFirstNode);
            myQueue.printQueue();
            INode peak=myQueue.dequeue();
            myQueue.printQueue();
            Assert.assertEquals(myFirstNode,peak);
        }

}
