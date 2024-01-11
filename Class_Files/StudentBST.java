package Class_Files;

public class StudentBST {
    TreeNode root;

    public void insert(Student student) {
        root = insertRec(root, student);
    }
    private TreeNode insertRec(TreeNode root, Student student) {
        if (root == null) {
            root = new TreeNode(student);
            return root;
        }
        if (student.id < root.data.id) {
            root.left = insertRec(root.left, student);
        } else if (student.id > root.data.id) {
            root.right = insertRec(root.right, student);
        }
        return root;
    }

    public Student search(int id) {
        return searchRec(root, id);
    }
    private Student searchRec(TreeNode root, int id) {
        if (root == null){
            return null;
        }
        if(root.data.id == id){
            return root.data;
        }
        if (id < root.data.id) {
            return searchRec(root.left, id);
        }
        return searchRec(root.right, id);
    }
}
