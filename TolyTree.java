import java.util.*;

public class TolyTree{
    
    public static void main(String[] args){
        
        Tree<String> t = new Tree<String>();
        t.setRoot("a");
        t.root.setLeftChild("b");
        t.root.setRightChild("c");
        t.root.getLeftChild().setLeftChild("d");
        t.root.getLeftChild().setRightChild("e");
        t.root.getRightChild().setLeftChild("f");
        t.root. getRightChild().setRightChild("g");
        //t.recursiveDFS(t.root);
        t.postTraverse(t.root);
        
        
        
        
        
    }
    
    
    
}


class Tree<T>{
    
    TreeNode<T> root;
    
    Tree(){
        
        this.root=null;
    }
    
    public void setRoot(T v){
        
        root=new TreeNode<T>(v);
    }
    
    public void visit(TreeNode<T> n){
        
        System.out.println(""+n.getValue());
    }
    public void BFS(){
        
        //Queue<TreeNode> waitingRoom=new LinkedList<TreeNode>();
        
        ArrayList<TreeNode<T>> waitingRoom=new ArrayList<TreeNode<T>>();

        waitingRoom.add(this.root);
           
        while (waitingRoom.size()>0){
            //TreeNode<T> temp=waitingRoom.poll();
            TreeNode<T> temp=waitingRoom.get(waitingRoom.size()-1);
            System.out.println(temp.getValue());
                                        waitingRoom.remove(waitingRoom.size()-1);

            //waitingRoom.add(temp);
            
             if (temp.getLeftChild()!=null){

                waitingRoom.add(0,temp.getLeftChild());
            }
            if (temp.getRightChild()!=null){

                waitingRoom.add(0,temp.getRightChild());
            }
            
            
            
            
        }
        
        
    }
    
    public void DFS(){
        
        Stack<TreeNode<T>> waitingRoom=new Stack<TreeNode<T>>();
        
        if (this.root!=null){
            
            waitingRoom.add(this.root);
        }
        
        while (!(waitingRoom.size()<=0)){
            //TreeNode<T> temp=waitingRoom.poll();
            TreeNode<T> temp=waitingRoom.pop();

            System.out.println(temp.getValue());
           // waitingRoom.add(temp);
            if (temp.getRightChild()!=null){

                waitingRoom.add(temp.getRightChild());
            }
            if (temp.getLeftChild()!=null){

                waitingRoom.add(temp.getLeftChild());
            }
            

            
        }
    }

    public void recursiveDFS(TreeNode<T> n){

        if (n==null){


        }

        else {
            System.out.println(n.getValue());
            recursiveDFS(n.getLeftChild());
            recursiveDFS(n.getRightChild());

        }

    }

    public void preTraverse(TreeNode<T> n){

        if (n==null){
            
        }

        else {
            System.out.println(n.getValue());
            recursiveDFS(n.getLeftChild());
            recursiveDFS(n.getRightChild());

        }
    }

    public void inorderTraverse(TreeNode<T> n){


        if (n==null){
            
        }
        
        else {
            
            inorderTraverse(n.getLeftChild());
            System.out.println(n.getValue());
            inorderTraverse(n.getRightChild());
            //System.out.println(n.getValue());
        }
}

    public void postTraverse(TreeNode<T> n){
        if (n==null){
            
        }
        
        else {
            
            inorderTraverse(n.getLeftChild());
            
         
                inorderTraverse(n.getRightChild());
                
            
            
            //System.out.println(n.getValue());

          
            System.out.println(n.getValue());
            
            





            //System.out.println(n.getValue());
        }
        
    }
    
    
    
    
}

class TreeNode<T>{
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;
    private T value;
    TreeNode(){
        
        this.leftChild=null;
        this.rightChild=null;
        this.value=null;
    }
    TreeNode(T value){
        
        this.leftChild=null;
        this.rightChild=null;
        this.value=value;
    }
    public void setLeftChild(T v){
        
        leftChild=new TreeNode<T>(v);
    }
    
    public void setRightChild(T v){
        rightChild=new TreeNode<T>(v);
        
    }
    public TreeNode<T> getLeftChild(){
        
        return this.leftChild;
    }
    
    public TreeNode<T> getRightChild(){
        return this.rightChild;
        
    }
    
    public T getValue(){
        
        return this.value;
    }
}




