package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {
    @Test
    public void testLeftAndRight(){
        System.out.println(new App().getGreeting());

        Squirrel cheeks = new Squirrel("Cheeks");
        Node<Squirrel> nodeOne = new Node<>(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node<Squirrel> nodeTwo = new Node<>(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node<Squirrel> nodeThree = new Node<>(fluffybutt);

        Squirrel chonkers = new Squirrel("Chonkers");
        Node<Squirrel> nodeFour = new Node<>(chonkers);


        nodeOne.set_left(nodeTwo);
        nodeOne.set_right(nodeThree);
        nodeTwo.set_left(nodeFour);

        Node<Squirrel> retrievedLeft = nodeOne.left(); // This should retrieve the left node
        Node<Squirrel> retrievedRight = nodeOne.right(); // This should retrieve the right node
        Node<Squirrel> retrievedThird = nodeOne.left().left();

        assertEquals(retrievedLeft.getData().getName(), "Squeaks");
        assertEquals(retrievedRight.getData().getName(), "Mr. Fluffy Butt");
        assertEquals(retrievedThird.getData().getName(), "Chonkers");
    }
}
