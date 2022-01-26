//package proj7;
//
//public class AnimalTree<T> {
//	
//	/** The binary tree that stores our animals and questions */
//	private BinaryTree<String> myTree;
//	/** the root node of the tree */
//	private BTNode<String> root;
//	/** the current node we are looking at */
//	private BTNode<String> current;
//	
//	public AnimalTree() {
//		resetTree();
//	} //constructor
//	
//	public void resetTree() {
//		BinaryTree<String> goldfish = new BinaryTree<String>("goldfish", null, null);
//		BinaryTree<String> dog = new BinaryTree<String>("dog", null, null);
//		myTree= new BinaryTree<String>("Does your animal live in the water?", goldfish, dog);
//		
//	} //resetTree
//	
//	public void addAnimal(String animal) {
//		myTree.addLeftData(animal);
//	} //addAnimal
//	
//	public void addQuestion(String question) {
//		myTree.addRootData(question);
//	} //addQuestion
//	
//	public boolean isLeaf() {
//		BTNode<String> cur = myTree.getCurrent();
//		return (cur.left == null && cur.right == null);
//	} //isLeaf
//	
//	public String getLeaf() {
//		if(isLeaf() == true) {
//			return (myTree.getCurrent().data);
//		}
//		return "";
//	} //getLeaf
//	
//	public BTNode<String> getRoot() {
//		return root;
//	} //getRoot
//	
//	public void setRoot(BTNode<String> root) {
//		this.root = root;
//	} //setRoot
//	
//	public BTNode<String> getCurrent() {
//		return current;
//	} //getCurrent
//	
//	public void setCurrent() {
//		this.current = myTree.getCurrent();
//	} //setCurrent
//	
//	public void traverseLeft() {
//		myTree.setCurrent(myTree.getCurrent().left);
//		setCurrent();
//	} //traverseLeft
//	
//	public void traverseRight() {
//		myTree.setCurrent(myTree.getCurrent().right);
//		setCurrent();
//	} //traverseRight
//	
//}
