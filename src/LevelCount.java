public class LevelCount {
    public int count(TreeNode t, int level) {

        if(t == null) return 0;
        if(level == 0) return 1;

        int countLeft = count(t.left, level - 1);
        int countRight = count(t.right, level - 1);

        return countLeft + countRight;
    }
}