class Solution {

    public int height(Node root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void nthorder1(Node root, int n, List<Node> arr) {
        if(root == null) return;

        if(n == 1) {
            arr.add(root);
            return;
        }

        nthorder1(root.left, n - 1, arr);
        nthorder1(root.right, n - 1, arr);
    }

    public Node connect(Node root) {

        if(root == null) return root;

        int level = height(root) + 1;

        for(int i = 1; i <= level; i++) {

            List<Node> arr = new ArrayList<>();

            nthorder1(root, i, arr);

            for(int j = 0; j < arr.size() - 1; j++) {
                arr.get(j).next = arr.get(j + 1);
            }

            arr.get(arr.size() - 1).next = null;
        }

        return root;
    }
}