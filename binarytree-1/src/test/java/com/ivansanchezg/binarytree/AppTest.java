package com.ivansanchezg.binarytree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testPreOrder()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        String preOrder = tree.preOrder();
        assertEquals("50 30 20 10 40 70 60 80 90 100", preOrder);
    }

    public void testInOrder()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        String inOrder = tree.inOrder();
        assertEquals("10 20 30 40 50 60 70 80 90 100", inOrder);
    }

    public void testPostOrder()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        String postOrder = tree.postOrder();
        assertEquals("10 20 40 30 60 100 90 80 70 50", postOrder);
    }

    public void testTopView()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        String topView = tree.topView();
        assertEquals("40 30 50 70 80 90 100", topView);
    }

    public void testContainsTrue()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        assertTrue(tree.contains(80));
    }

    public void testContainsFalse()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        assertFalse(tree.contains(55));
    }

    public void testHeight()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        assertEquals(5, tree.height());
    }

    public void testCommonLowestAncestor()
    {
        BinaryTree<Integer> tree = createTestBinaryTree();
        assertEquals(new TreeNode<Integer>(70), tree.commonLowestAncestor(60, 100));
    }

    private BinaryTree<Integer> createTestBinaryTree() {
        Integer[] array = new Integer[]{50,30,70,40,60,20,80,10,90,100};
        BinaryTree<Integer> tree = new BinaryTree<Integer>(array);
        return tree;
    }
}
