package leetcode_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lt_1202 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="dcab";
		List<List<Integer>> pairs = new ArrayList<List<Integer>>();
		System.out.println(smallestStringWithSwaps(s, pairs));
	}
	
		    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
		        DisjointSetUnion dsu = new DisjointSetUnion(s.length());
		        for (List<Integer> pair : pairs) {
		            dsu.unionSet(pair.get(0), pair.get(1));
		        }
		        Map<Integer, List<Character>> map = new HashMap<Integer, List<Character>>();
		        for (int i = 0; i < s.length(); i++) {
		            int parent = dsu.find(i);
		            if (!map.containsKey(parent)) {
		                map.put(parent, new ArrayList<Character>());
		            }
		            map.get(parent).add(s.charAt(i));
		        }
		        for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
		            Collections.sort(entry.getValue(), new Comparator<Character>() {
		                public int compare(Character c1, Character c2) {
		                    return c2 - c1;
		                }
		            });
		        }
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < s.length(); i++) {
		            int x = dsu.find(i);
		            List<Character> list = map.get(x);
		            sb.append(list.remove(list.size() - 1));
		        }
		        return sb.toString();
		    }
		}

	class DisjointSetUnion {
	    int[] f;
	    int[] rank;
	    int n;

	    public DisjointSetUnion(int n) {
	        this.n = n;
	        rank = new int[n];
	        Arrays.fill(rank, 1);
	        f = new int[n];
	        for (int i = 0; i < n; i++) {
	            f[i] = i;
	        }
	    }

	    public int find(int x) {
	        return f[x] == x ? x : (f[x] = find(f[x]));
	    }

	    public void unionSet(int x, int y) {
	        int fx = find(x), fy = find(y);
	        if (fx == fy) {
	            return;
	        }
	        if (rank[fx] < rank[fy]) {
	            int temp = fx;
	            fx = fy;
	            fy = temp;
	        }
	        rank[fx] += rank[fy];
	        f[fy] = fx;
	    }
	}
