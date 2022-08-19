//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 👍 1766 👎 0


package Solutions;

import java.util.ArrayList;

/**
 * @author bangsun
 */ //Java：Z 字形变换
public class P6ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new P6ZigzagConversion().new Solution();
        // TO TEST
        String ans = solution.convert("ABcfdfasdffd",2);
        System.out.println(ans);
        return;
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * @date 2022年8月17日12:23:32
     */
    class Solution {

        ArrayList<ArrayList<Character>> charList = new ArrayList<ArrayList<Character>>();

        private void generateLists(String s,int numRows){
            //init
            int var1 = numRows*2-1;
            for(int i=0;i<=numRows-1;i++){
                charList.add(new ArrayList<Character>());
            }
            int var2 = 0;
            int statusCode = -1;
            char p;

            //do
            for(int i=0;i<=s.length()-1;i++){
                p=s.charAt(i);
                var2++;
                if(var2<=numRows){
                    statusCode = 0;
                }
                else if(var2<=var1){
                    statusCode = 1;
                }
                System.out.println(var2);
                if(statusCode == 0){
                    this.charList.get(var2-1).add(p);
                }
                else if(statusCode == 1){
                    this.charList.get(var1-var2).add(p);
                }
                if(var2==(var1-1)){
                    var2=0;
                }
            }
        }

        private String getString(){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<=this.charList.size()-1;i++){
                for(int j=0;j<=this.charList.get(i).size()-1;j++){
                    stringBuilder.append(this.charList.get(i).get(j));
                }
            }
            return stringBuilder.toString();
        }

        public String convert(String s, int numRows) {
            if(numRows==1){
                return s;
            }
            generateLists(s,numRows);
            return getString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
