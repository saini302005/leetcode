class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[]{c, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator<int[]> it = stack.descendingIterator();
        while (it.hasNext()) {
            int[] p = it.next();
            for (int i = 0; i < p[1]; i++) {
                sb.append((char) p[0]);
            }
        }
        return sb.toString();
    }
}