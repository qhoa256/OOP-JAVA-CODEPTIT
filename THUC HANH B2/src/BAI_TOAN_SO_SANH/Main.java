package BAI_TOAN_SO_SANH;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indeg = new int[100005];
        int vertical = 0;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= 100004; i++) {
            adj.add(new ArrayList<>());
        }
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            if (!mp.containsKey(x[0])) {
                vertical++;
                mp.put(x[0], vertical);
            }
            if (!mp.containsKey(x[2])) {
                vertical++;
                mp.put(x[2], vertical);
            }
            int x1 = mp.get(x[0]), x3 = mp.get(x[2]);
            if (x[1].compareTo(">") == 0) {
                adj.get(x1).add(x3);
                indeg[x3]++;
            } else {
                adj.get(x3).add(x1);
                indeg[x1]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= vertical; i++) {
            if (indeg[i] == 0) q.add(i);
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            cnt++;
            for (int i : adj.get(x)) {
                indeg[i]--;
                if (indeg[i] == 0) q.add(i);
            }
        }
        if (cnt == vertical) System.out.println("possible");
        else System.out.println("impossible");
    }
}
