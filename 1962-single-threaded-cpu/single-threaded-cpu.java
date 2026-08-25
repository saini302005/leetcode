class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;

        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> 
            Integer.compare(tasks[a][0], tasks[b][0])
        );

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (tasks[a][1] != tasks[b][1]) {
                    return Integer.compare(tasks[a][1], tasks[b][1]);
                }
                return Integer.compare(a, b);
            }
        );

        int[] ans = new int[n];

        long time = 0;
        int i = 0;
        int k = 0;

        while (k < n) {

            if (pq.isEmpty()) {
                time = Math.max(time, tasks[index[i]][0]);
            }

            while (i < n && tasks[index[i]][0] <= time) {
                pq.offer(index[i]);
                i++;
            }

            int task = pq.poll();

            ans[k++] = task;
            time += tasks[task][1];
        }

        return ans;
    }
}