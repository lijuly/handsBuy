package com.handsBuy.test;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.stream.Collectors;

public class DemoTest {

    @Test
    public void fun1() {
        String str = "AAAAAAAAAAA";

        findRepeatedDnaSequences(str).forEach(elem -> System.out.println(elem));
    }
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result  = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        int len = s.length();
        int end = len - 10;
        for (int start = 0 ; start < end + 1; start++) {
            String subStr = s.substring(start, start + 10);
            if (map.containsKey(subStr)) {
                result.add(subStr);
            } else {
                map.put(subStr, 1);
            }

        }
        return new ArrayList<>(result);

    }

    @Test
    public void fun2(){
        int[] nums = {1,2,1};
        System.out.println(maxArea(nums));
    }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = (r - l) * Math.min(height[l], height[r]);
        while(l < r) {
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
        }
        return max;
    }

    @Test
    public void fun3(){
        fizzBuzz(15).forEach(elem -> System.out.print(elem + " "));;
    }

    public List<String> fizzBuzz(int n) {
        List<String> res  = new LinkedList<>();
        for (int i = 1 ; i < n+1; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz" );
            } else if (i % 3 == 0 ) {
                res.add("Fizz" );
            } else if (i % 5 == 0) {
                res.add("Buzz" );
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }

    private TreeNode arrsToNode(Integer[] arrs, int idx){
        TreeNode treeNode = null;
        if (idx < arrs.length) {
            Integer val = arrs[idx];
            if (val == null) {
                return null;
            }

            treeNode = new TreeNode(val);
            treeNode.left = arrsToNode(arrs, 2*idx + 1);
            treeNode.right = arrsToNode(arrs, 2*(idx + 1));
        }
        return treeNode;
    }


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    @Test
    public void fun4(){
        Integer [] arrs = {5, 3, 6, 2, 4, null , null, 1};
        TreeNode treeNode = arrsToNode(arrs, 0);
        System.out.println(kthSmallest(treeNode, 2));
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        preorderNode(root, list, 0);
        list = list.stream().sorted().collect(Collectors.toList());
        return list.get(k-1);
    }

    private void preorderNode(TreeNode node, List<Integer> list, int idx){
        if (node != null) {
            list.add(node.val);
            preorderNode(node.left, list, 2*idx+1);
            preorderNode(node.right, list, 2*(idx+1));
        }
    }

    @Test
    public void fun5(){
        letterCombinations("4").forEach(elem -> System.out.print(elem + " "));
    }
    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));

        if (digits.length() == 1) {
            return map.get(digits);
        }

        List<String> result = new ArrayList<>();
        if (digits.length() == 2) {
            char[] chars = digits.toCharArray();
            List<String> strs1 = map.get(String.valueOf(chars[0]));
            List<String> strs2 = map.get(String.valueOf(chars[1]));
            for (String str1 : strs1) {
                for (String str2 : strs2) {
                    result.add(str1.concat(str2));
                }
            }
        }

        if (digits.length() == 3) {
            char[] chars = digits.toCharArray();
            List<String> strs1 = map.get(String.valueOf(chars[0]));
            List<String> strs2 = map.get(String.valueOf(chars[1]));
            List<String> strs3 = map.get(String.valueOf(chars[2]));
            for (String str1 : strs1) {
                for (String str2 : strs2) {
                    for (String str3 : strs3) {
                        result.add(str1.concat(str2).concat(str3));
                    }
                }
            }
        }

        if (digits.length() == 4) {
            char[] chars = digits.toCharArray();
            List<String> strs1 = map.get(String.valueOf(chars[0]));
            List<String> strs2 = map.get(String.valueOf(chars[1]));
            List<String> strs3 = map.get(String.valueOf(chars[2]));
            List<String> strs4 = map.get(String.valueOf(chars[3]));
            for (String str1 : strs1) {
                for (String str2 : strs2) {
                    for (String str3 : strs3) {
                        for (String str4 : strs4) {
                            result.add(str1.concat(str2).concat(str3).concat(str4));
                        }
                    }
                }
            }
        }

        return result;
    }

    @Test
    public void fun6() {
        int[] nums = {0,2,1, -3};
        System.out.println(threeSumClosest(nums, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int res = 0;
        while (l + 2 <= r) {
            int sum = nums[l] + nums[l+1] + nums[l+2];
            if (sum == target) {
                res = target;
                break;
            }
            if (sum < target) {
                res = sum;
                l++;
            } else {
                res = sum;
                break;
            }
        }
        return res;
    }

    @Test
    public void fun7() {
        char[][] board =  {
                 {'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};


        System.out.println(isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!solo1(board[i])) {
                return false;
            }
            for (int j = 0; j < 9; j++) {

            }
            System.out.println();
        }
        return true;
    }

    private boolean solo1(char[] chars){
        Map<String, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (".".equals(String.valueOf(c))) {
                continue;
            }
            if (map.getOrDefault(String.valueOf(c), 0) == 0) {
                map.put(String.valueOf(c), 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
