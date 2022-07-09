package com.an7one.leetcode.lvl2.lc0690;

import com.an7one.util.Constant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Leon
 * <a href="https://leetcode.com/problems/employee-importance/">Description</a>
 *
 * Time Complexity:     O(V + E) ~ O()
 * Space Complexity:    O(V + E) ~ O()
 *
 * References:
 *  <a href="https://leetcode.com/problems/employee-importance/discuss/112587/Java-HashMap-bfs-dfs">...</a>
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class SolutionApproach0DFSRecursive {
    public int getImportance(List<FakeEmployee> employees, int id) {
        Map<Integer, FakeEmployee> map = new HashMap<>();
        for(FakeEmployee employee: employees){
            map.put(employee.id, employee);
        }
        return getImportance(id, map);
    }
    
    private int getImportance(int rootId, Map<Integer, FakeEmployee> map){
        FakeEmployee root = map.get(rootId);
        int total = root.importance;
        for(int subordinate : root.subordinates){
            total += getImportance(subordinate, map);
        }
        return total;
    }
}